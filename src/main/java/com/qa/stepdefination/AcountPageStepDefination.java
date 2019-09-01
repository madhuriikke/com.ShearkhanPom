package com.qa.stepdefination;

import com.qa.pages.AccountPage;
import com.qa.pages.HomePage;
import com.qa.util.Testcore;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class AcountPageStepDefination extends Testcore {
	HomePage homepage;
	AccountPage account;

	@Then("^user is click on account page$")
	public void user_is_click_on_account_page() {
		homepage = new HomePage();
		account = homepage.ClickOnAcountPage();

	}

	@Then("^user is on accounts page$")
	public void user_is_on_accounts_page() {
		account.CheckTextBox();

	}

	@Then("^user verify all left side links$")
	public void user_verify_all_left_side_links() {
		account.CheckAllleftPanel();

	}
//----------------------FundTransfer------------------------------------

	@Then("^user is click on Account$")
	public void user_is_click_on_Account() {
		homepage = new HomePage();
		account = homepage.ClickOnAcountPage();

	}

	@Then("^user is enter amount$")
	public void user_is_enter_amount() {
		account.MoveRs();

	}

	@Then("^user select segment$")
	public void user_select_segment() {
		account.SelectSegment();

	}

	@Then("^user click on transfer$")
	public void user_click_on_transfer() throws InterruptedException {
		account.ClickOnFundTransfer();
		account.handleAlert();
		account.Logout();

	}

}
