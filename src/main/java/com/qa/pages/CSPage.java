package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Testcore;

public class CSPage extends Testcore {
	public CSPage() {
		PageFactory.initElements(driver, this);
	}

//---------------------------------------all element here--------------------
	@FindBy(xpath = "//div[contains(text(),'Account Opening')]")
	WebElement AccountOpening;

	@FindBy(xpath = "//div[contains(text(),'Passwords')]")
	WebElement Passwords;

	@FindBy(xpath = "//div[contains(text(),'Profile and Plan Changes')]")
	WebElement ProfileandPlanChanges;

	@FindBy(xpath = "//div[contains(text(),'Brokerage and Taxes')]")
	WebElement BrokerageandTaxes;

	@FindBy(xpath = "//body/div[@class='middle-ui']/table[@class='style']/tbody/tr/td/table/tbody/tr/td/div[@id='id1']/div[@class='app-container']/div[@class='help-content']/div[9]")
	WebElement OrderPlacement;

	@FindBy(xpath = "//div[contains(text(),'Order Placement - Bracket Order')]")
	WebElement Bracketrder;

//--------------------------------methods----------------------------------

	public void CheckAllleftPanel() {
		boolean arr[] = new boolean[] { AccountOpening.isDisplayed(), Passwords.isDisplayed(),
				BrokerageandTaxes.isDisplayed(), OrderPlacement.isDisplayed(), Bracketrder.isDisplayed() };

		try {
			for (int j = 0; j < arr.length; j++) {

				Assert.assertEquals(arr[j], true);

			}

		} catch (Throwable e) {
			collector.addError(e);
			System.out.println("Button are all display");
		}
	}
}