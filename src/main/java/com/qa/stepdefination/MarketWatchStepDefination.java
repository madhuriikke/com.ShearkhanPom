package com.qa.stepdefination;

import com.qa.pages.HomePage;
import com.qa.pages.MarketWatchPage;
import com.qa.util.Testcore;

import cucumber.api.java.en.Then;

public class MarketWatchStepDefination extends Testcore {
	HomePage homepage;
	MarketWatchPage marketwatch;

	@Then("^user is click on Market Watch page$")
	public void user_is_click_on_Market_Watch_page() {

		homepage = new HomePage();
		marketwatch = homepage.ClickOnMarketWatch();

	}

	@Then("^user is validate all the buttons$")
	public void user_is_validate_all_the_buttons() {
		marketwatch.CheckAllButtons();
	}

}
