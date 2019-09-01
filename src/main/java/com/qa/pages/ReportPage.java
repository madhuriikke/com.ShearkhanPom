package com.qa.pages;

import org.hamcrest.Factory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Testcore;




public class ReportPage extends Testcore {
	public ReportPage() {
		PageFactory.initElements(driver, this);
	}

//------------------------------leftside--------------------------------
	@FindBy(xpath = "//div[@class='divChild sidebar']//div[1]//ul[1]//li[1]//a[1]")
	WebElement Order;

	@FindBy(xpath = "//div[@class='divChild sidebar']//div[1]//ul[1]//li[2]//a[1]")
	WebElement Trade;

	@FindBy(xpath = "//div[@class='divChild sidebar']//div[1]//ul[1]//li[3]//a[1]")
	WebElement TurnOverPosition;

	@FindBy(xpath = "//a[contains(text(),'Obligation')]")
	WebElement Obligation;

	@FindBy(xpath = "//div[@class='divChild sidebar']//div[1]//ul[1]//li[5]//a[1]")
	WebElement OrderHistory;

	@FindBy(xpath = "//a[contains(text(),'DP/SR Report')]")
	WebElement DPSRReport;

	@FindBy(xpath = "//h2[contains(text(),'Cash Reports')]")
	WebElement CashReportsTittle;
//---------------------------Methods---------------------------------------

	public void CheckLeftLinks() {
		boolean arr[] = new boolean[] { Order.isDisplayed(), Trade.isDisplayed(), Obligation.isDisplayed(),
				OrderHistory.isDisplayed(), DPSRReport.isDisplayed() };

		try {
			for (int i = 0; i < arr.length; i++) {
				//System.out.println("button is not disable" + arr[i]);

				Assert.assertEquals(arr[i], true);

			}

		} catch (Throwable e) {
			collector.addError(e);
			System.out.println("Button are all display");
		}

	}
	
	/*
	 * public void CheckText() { String Title = CashReportsTittle.getText();
	 * Assert.assertEquals(Title, "Cash Reports");
	 * 
	 * }
	 */
		
	



}
