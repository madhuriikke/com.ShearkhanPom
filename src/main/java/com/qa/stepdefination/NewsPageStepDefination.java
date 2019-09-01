package com.qa.stepdefination;

import com.qa.pages.HomePage;
import com.qa.pages.NewsPage;
import com.qa.util.Testcore;

import cucumber.api.java.en.Then;

public class NewsPageStepDefination extends Testcore {
	
	HomePage homepage;
	NewsPage news;
	
	
	

@Then("^user Click on NewsPage$")
public void user_Click_on_NewsPage() throws InterruptedException  {
	homepage = new HomePage();
	news = homepage.ClickOnNewsPage();
    
}

@Then("^user validate the buttons$")
public void user_validate_the_buttons()  {
	news.CheckAllButtons();
	
    
}


	

}
