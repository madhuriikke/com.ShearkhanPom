package com.qa.stepdefination;

import com.qa.pages.HomePage;
import com.qa.pages.OptionChainPage;
import com.qa.util.Testcore;


import cucumber.api.java.en.Then;

public class OptionChainStepDefination extends Testcore{
	HomePage homepage;
	OptionChainPage option;
	
	@Then("^user click on OptionChain Page$")
	public void user_click_on_OptionChain_Page() throws InterruptedException  {
		homepage = new HomePage();
		option=homepage.ClickOnOptionChain();
	    
	}

	@Then("^user validate all buttons$")
	public void user_validate_all_buttons() {
		option.CheckAllButtons();
	   
	}

	
	
	

}
