package com.qa.stepdefination;

import java.util.concurrent.TimeUnit;

import com.qa.pages.HomePage;
import com.qa.pages.TradeNowPages;
import com.qa.util.TestUtil;
import com.qa.util.Testcore;

import cucumber.api.java.en.Then;

public class TradeNowPageStepDefination extends Testcore {
	HomePage homepage;
	TradeNowPages Trade;

	@Then("^user Click on TradePage$")
	public void user_Click_on_TradePage() {
		homepage= new HomePage();
		Trade=homepage.ClickOnTradePage();
	}
	
	@Then("^user is click on CloseButton$")
	public void user_is_click_on_CloseButton() throws Exception {
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		Trade.ClickToClose();
	}
	

	@Then("^User is On Trade Page$")
	public void user_is_On_Trade_Page() {
		Trade.FormTitleVerify();
	}

	@Then("^User Verify All Left PanelLink$")
	public void user_Verify_All_Left_PanelLink() {
		Trade.CheckAllleftPanelLink();
}

	@Then("^User Verify New Order Form$")
	public void user_Verify_New_Order_Form() {
		Trade.CheckAllFormButtons();
	}

}
