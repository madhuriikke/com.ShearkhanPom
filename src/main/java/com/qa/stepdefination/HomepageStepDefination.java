package com.qa.stepdefination;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.Testcore;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomepageStepDefination extends Testcore {

	LoginPage loginpage;
	HomePage homepage;

	@Given("^user open browser$")
	public void user_open_browser() {
		Testcore.initilization();
	}

	@Then("^user on LoginPage$")
	public void user_on_LoginPage() {
		loginpage = new LoginPage();
		System.out.println("Loginpage Title" + loginpage.ValidateTitle());

	}

	@Then("^User Login Application$")
	public void user_Login_Application() {
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Then("^Homepage is display$")
	public void homepage_is_display() {

		System.out.println("Homepage display");
	}

	@Then("^verify all top pannal links$")
	public void verify_all_top_pannal_links() {
		loginpage = new LoginPage();
		homepage.VerifyAllTopButtons();
	}

	@Then("^verify all left pannal links$")
	public void verify_all_left_pannal_links() {
		homepage.VerifyAllRightButtons();
	}

}
