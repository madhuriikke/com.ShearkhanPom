package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Testcore;

public class IPOBondsPage extends Testcore{
	public IPOBondsPage() {
		PageFactory.initElements(driver, this);
	}
//------------------------------all element here------------------------
	
	
	@FindBy(xpath="//td//td//td[1]//a[1]//img[1]")
	WebElement FundTranfer;
	
	@FindBy(xpath="//td[2]//a[1]//img[1]")
	WebElement AllocateFunds;
	
	@FindBy(xpath="//div[@id='mainwrapper']//td[3]//img[1]")
	WebElement OrderReport;
	
	
	@FindBy(xpath="//div[@id='mainwrapper']//td[4]//img[1]")
	WebElement AccountBank;
	
	@FindBy(xpath="//td[5]//img[1]")
	WebElement YourProfile;
	
//---------------------------methods--------------------------------
	
	
	public void CheckButtons() {
		boolean arr[] = new boolean[] { FundTranfer.isDisplayed(), AllocateFunds.isDisplayed(),
				OrderReport.isDisplayed(), AccountBank.isDisplayed(),YourProfile.isDisplayed()};

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
