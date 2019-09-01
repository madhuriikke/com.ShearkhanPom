package com.qa.stepdefination;

import com.qa.pages.HomePage;
import com.qa.pages.MutualFundPage;
import com.qa.util.Testcore;


import cucumber.api.java.en.Then;

public class MutualFundStepDefination extends Testcore {
	HomePage homepage;
	MutualFundPage mutualfund;

	@Then("^user Click on Mutual Fund page$")
	public void user_Click_on_Mutual_Fund_page() {
		homepage = new HomePage();
		mutualfund = homepage.ClickOnMutualFund();
	}
	
	@Then("^user verify all left sides links$")
	public void user_verify_all_left_sides_links() {
		mutualfund.CheckAllButtons();
	}


}
