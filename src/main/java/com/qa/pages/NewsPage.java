package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Testcore;

public class NewsPage extends Testcore {

	public NewsPage() {
		PageFactory.initElements(driver, this);
	}

//---------------------------------------all element here--------------------
	@FindBy(xpath = "//a[contains(text(),'Must Know News')]")
	WebElement MustKnowNews;

	@FindBy(xpath = "//a[contains(text(),'Live News')]")
	WebElement LiveNews;

	@FindBy(xpath = "//a[contains(text(),'Other News')]")
	WebElement OtherNews;

	@FindBy(xpath = "//a[contains(text(),'Latest News - MC')]")
	WebElement LatestNewsMC;

	@FindBy(xpath = "//a[contains(text(),'Business News - MC')]")
	WebElement BusinessNewsMC;

	@FindBy(xpath = "//a[contains(text(),'Market Reports - MC')]")
	WebElement MarketReportMC;

//---------------------------methods-------------------------------------

	public void CheckAllButtons() {
		boolean arr[] = new boolean[] { MustKnowNews.isDisplayed(), LiveNews.isDisplayed(), OtherNews.isDisplayed(),
				LatestNewsMC.isDisplayed(), BusinessNewsMC.isDisplayed(), MarketReportMC.isDisplayed() };

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
