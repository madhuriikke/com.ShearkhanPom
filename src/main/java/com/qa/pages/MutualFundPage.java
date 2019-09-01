package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Testcore;

public class MutualFundPage extends Testcore {
	public MutualFundPage() {
		PageFactory.initElements(driver, this);
	}
//----------------------all element here---------------------------------------

	@FindBy(xpath = "//a[contains(text(),'Know About Mutualfund')]")
	WebElement KnowAboutMutualfund;

	@FindBy(xpath = "//a[contains(text(),'Features Of Mutualfund')]")
	WebElement FeaturesOfMutualfund;

	@FindBy(xpath = "//a[contains(text(),'Tax Saving Features')]")
	WebElement TaxSavingFeatures;

	@FindBy(xpath = "//a[contains(text(),'Calculate Your Nav')]")
	WebElement CalculateYourNav;

	@FindBy(xpath = "//a[contains(text(),'Types Of Funds')]")
	WebElement TypesOfFunds;

	@FindBy(xpath = "//a[contains(text(),'SIP Mandate T & C')]")
	WebElement SIPMandateTC;

	@FindBy(xpath = "//a[contains(text(),'Commission Disclosure')]")
	WebElement CommissionDisclosure;

	@FindBy(xpath = "//ul[@class='grey-arrow-list']//a[contains(text(),'Purchase')]")
	WebElement Purchase;

	@FindBy(xpath = "//div[@class='divParent']//div[2]//ul[1]//li[2]//a[1]")
	WebElement FlexiSIP;

	@FindBy(xpath = "//div[@class='divParent']//div[2]//ul[1]//li[3]//a[1]")
	WebElement SIP;

	@FindBy(xpath = "//a[contains(text(),'Redeem / Add holdings')]")
	WebElement Addholdings;

	@FindBy(xpath = "//a[contains(text(),'Order Reports')]")
	WebElement OrderReports;

	@FindBy(xpath = "//a[contains(text(),'Flexi SIP Reports')]")
	WebElement FlexiSIPReports;

	@FindBy(xpath = "//div[@class='divParent']//div[3]//ul[1]//li[3]//a[1]")
	WebElement SIPReports;

	@FindBy(xpath = "//a[contains(text(),'Portfolio Report')]")
	WebElement PortfolioReport;

	@FindBy(xpath = "//a[contains(text(),'Transaction Report')]")
	WebElement TransactionReport;

	@FindBy(xpath = "//a[contains(text(),'Nav Reports')]")
	WebElement NavReports;

	@FindBy(xpath = "//a[contains(text(),'TAX Reports[NSE]')]")
	WebElement TAXReportsNSE ;

	@FindBy(xpath = "//a[contains(text(),'Your Profile')]")
	WebElement YourProfile;
	
	

//-------------------------------Methods-----------------------------------------

	public void CheckAllButtons() {
		boolean arr[] = new boolean[] { KnowAboutMutualfund.isDisplayed(), FeaturesOfMutualfund.isDisplayed(),
				TaxSavingFeatures.isDisplayed(), CalculateYourNav.isDisplayed(), TypesOfFunds.isDisplayed(), CommissionDisclosure.isDisplayed(), Purchase.isDisplayed(), 
				Purchase.isDisplayed(), FlexiSIP.isDisplayed(), SIP.isDisplayed(), Addholdings.isDisplayed(), OrderReports.isDisplayed(), FlexiSIPReports.isDisplayed(), 
				SIPReports.isDisplayed(),PortfolioReport.isDisplayed(), TransactionReport.isDisplayed(), NavReports.isDisplayed(), TAXReportsNSE.isDisplayed(), YourProfile.isDisplayed()};

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
