package com.qa.stepdefination;

import com.qa.pages.HomePage;
import com.qa.pages.ReportPage;
import com.qa.util.Testcore;

import cucumber.api.java.en.Then;

public class ReportPageStepDefination extends Testcore {
	HomePage homepage;
	ReportPage report;

	@Then("^user click on Report page$")
	public void user_click_on_Report_page() {
		homepage = new HomePage();
		report=homepage.ClickOnReportPage();
	}

	/*
	 * @Then("^user is on Report page$") public void user_is_on_Report_page() {
	 * report.CheckText();
	 * 
	 * }
	 */

	@Then("^user verify left links$")
	public void user_verify_left_links() {
		report.CheckLeftLinks();

	}

}
