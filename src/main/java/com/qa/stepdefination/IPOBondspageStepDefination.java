package com.qa.stepdefination;

import com.qa.pages.HomePage;
import com.qa.pages.IPOBondsPage;
import com.qa.util.Testcore;

import cucumber.api.java.en.Then;

public class IPOBondspageStepDefination  extends Testcore{
	HomePage homepage;
	IPOBondsPage ipobonds;
	
	@Then("^usre is click on IPOBonds$")
	public void usre_is_click_on_IPOBonds()  {
		homepage =new HomePage();
		ipobonds = homepage.ClickOnIPOBonds();

	    
	}

	@Then("^user validate all the links$")
	public void user_validate_all_the_links()  {
		ipobonds.CheckButtons();
	    
	}
	

}
