package com.automation_hseq.StepsDefinition;

import java.util.List;
import com.automation_hseq.Models.Usuario;
import com.automation_hseq.Steps.LoginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepsDefinitions {

	@Steps
	LoginSteps inicioDeSesionSteps;
	
	//ADMINISTRADOR
	@Given("^que estoy en la pagina de inicio de HSEQ$")
	public void que_estoy_en_la_pagina_de_inicio_de_HSEQ() {
	    
	    inicioDeSesionSteps.abrirAplicacionHSEQ();
	   
	}

	@When("^ingreso mis credenciales$")
	public void ingreso_mis_credenciales(List<Usuario> listaUsuario) throws InterruptedException {
		   inicioDeSesionSteps.clickEnLogIn(listaUsuario.get(0).getUsuario(), listaUsuario.get(0).getClave());
	       
	}

	@Then("^valido que el login ha sido exitoso$")
	public void valido_que_el_login_ha_sido_exitoso() throws InterruptedException {
		inicioDeSesionSteps.obtenerTextoDeMensaje();
		
	}
	
}