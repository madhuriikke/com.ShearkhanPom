package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Testcore;

public class OptionChainPage extends Testcore {
	public OptionChainPage() {
		PageFactory.initElements(driver, this);
	}

//---------------------------all element here----------------------------
	@FindBy(xpath ="//select[@name='exchangecode']")
	WebElement NSEFO;

	@FindBy(xpath ="//select[@name='scrip']")
	WebElement Nifty;

	@FindBy(xpath ="//select[@name='expiry']")
	WebElement Date;

	@FindBy(xpath ="//select[@name='range']")
	WebElement Filter;

	@FindBy(xpath ="//body//select[5]")
	WebElement Sigma;

//----------------------------methods------------------------------------
	public void CheckAllButtons() {
		boolean arr[] = new boolean[] { NSEFO.isDisplayed(), Nifty.isDisplayed(), Date.isDisplayed(),
				Filter.isDisplayed(), Sigma.isDisplayed() };

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
