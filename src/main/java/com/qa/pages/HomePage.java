package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Testcore;

public class HomePage extends Testcore {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

//-------------------------all elemet-----------------------------------
	@FindBy(xpath = "//a[@class='whitelink'][contains(text(),'HOME')]")
	WebElement HOME;

	@FindBy(xpath = "//a[contains(text(),'ACCOUNTS')]")
	WebElement ACCOUNTS;

	@FindBy(xpath = "//a[contains(text(),'PROFILE')]")
	WebElement PROFILE;

	@FindBy(xpath = "//a[contains(text(),'TRADE NOW')]")
	WebElement TRADENOW;

	@FindBy(xpath = "//a[contains(text(),'REPORTS')]")
	WebElement REPORTS;

	@FindBy(xpath = "//a[contains(text(),'MARKET WATCH')]")
	WebElement MARKETWATCH;

	@FindBy(xpath = "//a[contains(text(),'IPO/BONDS')]")
	WebElement IPOBONDS;

	@FindBy(xpath = "//a[@class='whitelink'][contains(text(),'PORTFOLIO')]")
	WebElement PORTFOlIO;

	@FindBy(xpath = "//a[contains(text(),'OPTION CHAIN')]")
	WebElement OPTIONCHAIN;

	@FindBy(xpath = "//a[contains(text(),'NEWS')]")
	WebElement NEWS;

	@FindBy(xpath ="//a[@class='whitelink'][contains(text(),'RESEARCH')]")
	WebElement RESEARCH1;

	@FindBy(xpath = "/html/body/div/table/tbody/tr[1]/td/div[2]/table/tbody/tr/td/a[13]")
	WebElement CS;

//--------------------------LeftSide---------------------------------------------
	@FindBy(xpath = "//ul[@class='grey-arrow-list']//a[contains(text(),'RESEARCH')]")
	WebElement RESEARCH;

	@FindBy(xpath = "//a[contains(text(),'MOVE FUNDS')]")
	WebElement MOVEFUNDS;

	@FindBy(xpath = "//a[contains(text(),'VIEW REPORT')]")
	WebElement VIEWREPORT;

	@FindBy(xpath = "//h2[contains(text(),'Investment Products')]")
	WebElement InvestmentProducts;

	@FindBy(xpath = "//a[contains(text(),'TOP PICK BASKET')]")
	WebElement TOPPICKBASKET;

	@FindBy(xpath = "//a[contains(text(),'STOCK SIP')]")
	WebElement STOCK;

	@FindBy(xpath = "//a[@class='whitelink'][contains(text(),'MUTUAL FUND')]")
	WebElement MUTUALFUND;

	// *[@id="search"]

//------------------------------Top Buttons Methods------------------------------------

	public void VerifyAllTopButtons() {
		boolean arr[] = new boolean[] { HOME.isDisplayed(), ACCOUNTS.isDisplayed(), PROFILE.isDisplayed(),
				TRADENOW.isDisplayed(), REPORTS.isDisplayed(), MARKETWATCH.isDisplayed() };
		try {

			for (int i = 0; i < arr.length; i++) {
				Assert.assertEquals(arr[i], true);

			}

		} catch (Throwable e) {
			collector.addError(e);
			System.out.println("Button are all display");
		}

	}
//-------------------------------Left Buttons Methods--------------------

	public void VerifyAllRightButtons() {
		boolean arr[] = new boolean[] { RESEARCH.isDisplayed(), MOVEFUNDS.isDisplayed(), VIEWREPORT.isDisplayed(),
				InvestmentProducts.isDisplayed(), TOPPICKBASKET.isDisplayed(), STOCK.isDisplayed(),
				MUTUALFUND.isDisplayed() };

		try {
			for (int j = 0; j < arr.length; j++) {

				Assert.assertEquals(arr[j], true);

			}

		} catch (Throwable e) {
			collector.addError(e);
			System.out.println("Button are all display");
		}

	}

//------------------------tradenow---------------------------------------	
	public TradeNowPages ClickOnTradePage() {
		TRADENOW.click();
		return new TradeNowPages();
	}
//-----------------------profile---------------------------------------

	public ProfilePage ClickOnProfilePage() {
		PROFILE.click();
		return new ProfilePage();
	}
//-------------------------Report----------------------------------------

	public ReportPage ClickOnReportPage() {
		REPORTS.click();
		return new ReportPage();
	}
//-------------------------------Account----------------------------------

	public AccountPage ClickOnAcountPage() {
		ACCOUNTS.click();
		return new AccountPage();

	}

//-------------------------MutualFund-------------------------------------------
	public MutualFundPage ClickOnMutualFund() {

		MUTUALFUND.click();
		return new MutualFundPage();
	}
//-------------------------------MARKETWATCH------------------------------

	public MarketWatchPage ClickOnMarketWatch() {
		MARKETWATCH.click();
		return new MarketWatchPage();

	}

//------------------------------IPOBONDS-------------------------------
	public IPOBondsPage ClickOnIPOBonds() {
		IPOBONDS.click();
		return new IPOBondsPage();
	}
//--------------------------OPTIONCHAIN-----------------------------------

	public OptionChainPage ClickOnOptionChain() throws InterruptedException {
		Thread.sleep(5000);
		OPTIONCHAIN.click();
		return new OptionChainPage();
	}

//----------------------------NEWS-------------------------------------------
	public NewsPage ClickOnNewsPage() throws InterruptedException {
		Thread.sleep(5000);

		NEWS.click();
		return new NewsPage();
	}

//---------------------------------RESEARCH1------------------------------
	public Research1Page ClickOnReserch1PAge() throws InterruptedException {
		Thread.sleep(5000);

		RESEARCH1.click();
		return new Research1Page();
	}
//-------------------------------CS------------------------------------

	public CSPage ClickOnCSPage() throws InterruptedException {
		Thread.sleep(7000);
		CS.click();

		return new CSPage();
	}

}
