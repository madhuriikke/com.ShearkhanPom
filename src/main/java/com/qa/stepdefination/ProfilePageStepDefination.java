package com.qa.stepdefination;

import com.qa.pages.HomePage;
import com.qa.pages.ProfilePage;
import com.qa.util.Testcore;

import cucumber.api.java.en.Then;

public class ProfilePageStepDefination extends Testcore {
	HomePage homepage;
	ProfilePage profile;

	@Then("^user Click on Profile Page$")
	public void user_Click_on_Profile_Page() {
		homepage = new HomePage();
		profile = homepage.ClickOnProfilePage();

	}

	@Then("^User is On Profile Page$")
	public void user_is_On_Profile_Page() {
		profile.TitleCustomerProfile();
	}

	@Then("^User Verify All Left Panel$")
	public void user_Verify_All_Left_Panel() {
		profile.CheckAllleftPanel();
	}

	@Then("^User Verify Customer Form$")
	public void user_Verify_Customer_Form() {
		profile.CheckCustomerPannel();
	}
	
	

}
