package com.steps;

import org.openqa.selenium.WebDriver;

import com.pages.LandingPage;
import com.pages.SigninPage;

import io.cucumber.java.en.And;

public class LandingPageStepDef {

	Steps steps;

	public LandingPageStepDef(Steps steps) {
		this.steps=steps;
	}

	@And("^user click on signin link$") public void click_Signin_Link() {

		steps.signinPage=steps.landingPage.clickSigninIn(); 

	}



}
