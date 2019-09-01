package com.qa.stepdefination;

import com.qa.pages.HomePage;
import com.qa.pages.Research1Page;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class Research1PageStepDefination {

	HomePage homepage;
	Research1Page research;

	@Then("^user click on ResearchPage$")
	public void user_click_on_ResearchPage() throws InterruptedException {
		homepage = new HomePage();
		research = homepage.ClickOnReserch1PAge();

	}

	@Then("^user validate all the panels$")
	public void user_validate_all_the_panels() {
		research.CheckAllButtons();

	}

}
