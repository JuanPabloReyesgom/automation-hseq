package com.automation_hseq.Steps;

import com.automation_hseq.PageObjects.LoginPageObjects;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

	LoginPageObjects inicioDeSesionPOM=new LoginPageObjects();
	
	@Step
	public void abrirAplicacionHSEQ() {
		inicioDeSesionPOM.open();
	}
	@Step
	public void clickEnLogIn(String usuario, String clave) throws InterruptedException {
		inicioDeSesionPOM.enviarcredenciales(usuario,clave);
	}
	
	@Step
	public void obtenerTextoDeMensaje() throws InterruptedException {
		inicioDeSesionPOM.obtenerTextoDeAlerta();
	}

	

		
}
