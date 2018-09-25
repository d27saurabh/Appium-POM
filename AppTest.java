package com.saurabh.deshpande.test.GoCanvas;

import org.testng.annotations.Test;

public class AppTest extends BaseApp {

	@Test
	public void mobileChallenge() {
		Lets lets = new Lets();
		On on = new On(driver);

		lets.skipIntro();

		lets.loginWith("testbeta1@yopmail.com", "canvas");

		on.SDETProjectName.click();

		lets.clickApp("Sales Order/Invoice Receipt");

		lets.fillNameInfo("Saurabh");

		lets.fillAddress1("Freedom Drive");

		lets.fillCity("Fairfax");

		lets.StatePicker();

		lets.findState("VA");

		lets.clickNext();

	}
}