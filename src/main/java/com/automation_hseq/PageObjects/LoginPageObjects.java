package com.automation_hseq.PageObjects;

import static org.junit.Assert.fail;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.FindBy;
//import com.hseqautomation.utils.Esperas;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("/login")
public class LoginPageObjects extends PageObject {
	//Esperas esperaExpl;
	
	  @FindBy(xpath = "//input[@id='username']")
	  WebElementFacade    ingreseelusername;
	  @FindBy(xpath = "//input[@id='password']")
	  WebElementFacade ingresarpassword;
	  @FindBy(xpath = "//button[@class='btn btn-primary']")
	  WebElementFacade clickoningresar;
	  @FindBy(xpath ="//img[@class='logo-indra-login img-fluid']")
	  WebElementFacade verificarimageniniciodesesion;
	
	  public void enviarcredenciales(String usuario, String clave) throws InterruptedException {
			// TODO Auto-generated method stub
			ingreseelusername.sendKeys(usuario);
			  //esperaExpl.esperaSimple(1000);
			  ingresarpassword.sendKeys(clave);
			  //esperaExpl.esperaSimple(1000);
			  clickoningresar.click();
			  Thread.sleep(3000);
		}
	
	public void obtenerTextoDeAlerta() throws InterruptedException {

		try {
			System.out.println("validate login");
			Thread.sleep(5000);
			boolean loginSuccess = verificarimageniniciodesesion != null;
			//driver.quit();
			if(!loginSuccess)
			{
				fail("login no exitoso");
			}
		}catch(NoSuchElementException ex) {
			//driver.quit();
			fail("login no exitoso");
		}
	}
}
