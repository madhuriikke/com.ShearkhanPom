package com.qa.stepdefination;

import com.qa.pages.CSPage;
import com.qa.pages.HomePage;
import com.qa.util.Testcore;

import cucumber.api.java.en.Then;

public class CSPageStepDefination extends Testcore {
	
	HomePage homepage;
	CSPage cs;
	
	
	@Then("^user click n CSPage$")
	public void user_click_n_CSPage() throws InterruptedException {
		homepage = new HomePage();
		cs=homepage.ClickOnCSPage();
	    
	}

	@Then("^user validate the links$")
	public void user_validate_the_links()  {
		cs.CheckAllleftPanel();
	    
	}
	

}
