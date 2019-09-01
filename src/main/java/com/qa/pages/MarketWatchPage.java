package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Testcore;

public class MarketWatchPage extends Testcore {
	public MarketWatchPage() {
		PageFactory.initElements(driver, this);
	}
//-----------------------------all element here---------------------------
	
	@FindBy(xpath="//select[@id='ex']")
	WebElement NSE;
	
	@FindBy(xpath="//select[@id='optiontype']")
	WebElement Future;
	
	@FindBy(xpath="//input[@id='scrip']")
	WebElement EnterScriptname;
	
	@FindBy(xpath="//input[@id='strike']")
	WebElement EnterStrikeName;
	
	@FindBy(xpath="//input[@placeholder='Template Name']")
	WebElement TemplateName;
	
	@FindBy(xpath="//tr[@class='orgbg']//select[@name='template']")
	WebElement DeleteTemplate;
	
	@FindBy(xpath="//body/div[@class='middle-ui']/table/tbody/tr/td[@class='ps2']/div[1]/input[1]")
	WebElement PlaceTrade;
	
	@FindBy(xpath="//body/div[@class='middle-ui']/table/tbody/tr/td[@class='ps2']/div[1]/input[2]")
	WebElement DeleteScript;
	
	@FindBy(xpath="//body/div[@class='middle-ui']/table/tbody/tr/td[@class='ps2']/div[1]/input[3]")
	WebElement CreateStockSIP;
	
	@FindBy(xpath="//body/div[@class='middle-ui']/table/tbody/tr/td[@class='ps2']/div[1]/input[5]")
	WebElement AddToCart;
	
	@FindBy(xpath="//body/div[@class='middle-ui']/table/tbody/tr/td[@class='ps2']/div[1]/input[6]")
	WebElement Alert;
	
	@FindBy(xpath="//body/div[@class='middle-ui']/table/tbody/tr/td[@class='ps2']/div[1]/input[7]")
	WebElement RemoveColoumn;
	
	@FindBy(xpath="//a[@class='inpButtonStyle orange button1']")
	WebElement HeatMap;
	
//----------------------------------all methods here------------------------
	
	public void CheckAllButtons() {
		boolean arr[] = new boolean[] { NSE.isDisplayed(), Future.isDisplayed(),
				EnterScriptname.isDisplayed(), EnterStrikeName.isDisplayed(), TemplateName.isDisplayed(), DeleteTemplate.isDisplayed(), PlaceTrade.isDisplayed(), 
				DeleteScript.isDisplayed(), DeleteScript.isDisplayed(), CreateStockSIP.isDisplayed(), AddToCart.isDisplayed(), Alert.isDisplayed(), RemoveColoumn.isDisplayed(), 
				HeatMap.isDisplayed()};

		try {
			for (int i = 0; i < arr.length; i++) {

				Assert.assertEquals(arr[i], true);

			}

		} catch (Throwable e) {
			collector.addError(e);
			System.out.println("Button are all display");
		}
	}
	

}
