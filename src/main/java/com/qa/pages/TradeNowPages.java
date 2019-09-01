package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Factory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestUtil;
import com.qa.util.Testcore;



public class TradeNowPages extends Testcore {

	public TradeNowPages() {
		PageFactory.initElements(driver, this);
	}
//----------------------------------all element here------------------------

	@FindBy(xpath = "//div[@class='divChild sidebar']//div[1]//ul[1]//li[1]//a[1]")
	WebElement NSE;

	@FindBy(xpath = "//a[@id='big-trade-plus1']")
	WebElement BracketOrder;

	@FindBy(xpath = "//a[@id='big-trade-plus2']")
	WebElement TarlingOrder;

	@FindBy(xpath = "//a[contains(text(),'BSE')]")
	WebElement BSE;

	@FindBy(xpath = "//li[5]//a[1]")
	WebElement NSEFO;

	@FindBy(xpath = "//a[@id='big-trade-plus']")
	WebElement BigTradePlus;

	@FindBy(xpath = "//ul[@class='grey-arrow-list']//a[contains(text(),'MCXFO')]")
	WebElement MCXFO;

	@FindBy(xpath = "//a[contains(text(),'NSE CURR')]")
	WebElement NSCCurr;

	// -------------------------------------Forms element---------------------

	@FindBy(xpath = "//select[@id='exchangecode']")
	WebElement Exchange;

	@FindBy(xpath = "//input[@id='scrip']")
	WebElement Scrip;

	@FindBy(xpath = "//select[@id='buysell']")
	WebElement Buysell;

	@FindBy(xpath = "//select[@id='validity']")
	WebElement Validity;

	@FindBy(xpath = "//input[@id='quantity']")
	WebElement Orderquantity;

	@FindBy(xpath = "//input[@name='disclosedorderqty']")
	WebElement DisclosedQyt;

	@FindBy(xpath = "//input[@id='tprice']")
	WebElement TPrice;

	@FindBy(xpath = "//input[@id='price']")
	WebElement LimitPrice;

	@FindBy(xpath = "//select[@id='adv_order_type']")
	WebElement AdvOrderType;

	@FindBy(xpath = "//div[@class='bkListH1']")
	WebElement TitleForm;
//-----------------------window----------------------------------------
	@FindBy(xpath = "//button[contains(text(),'X')]")
	WebElement Close;

//---------------------------------all methods---------------------------------	
	public void FormTitleVerify() {

		String Title = TitleForm.getText();
		Assert.assertEquals(Title, "New Order Form");
	}

	public void CheckAllleftPanelLink() {
		boolean arr[] = new boolean[] { NSE.isDisplayed(), BracketOrder.isDisplayed(), TarlingOrder.isDisplayed(),
				Buysell.isDisplayed(), NSEFO.isDisplayed(), Orderquantity.isDisplayed(), MCXFO.isDisplayed() };

		try {
			for (int j = 0; j < arr.length; j++) {

				Assert.assertEquals(arr[j], true);

			}

		} catch (Throwable e) {
			collector.addError(e);
			System.out.println("Button are all display");
		}

	}

	public void CheckAllFormButtons() {
		boolean arr[] = new boolean[] { Exchange.isDisplayed(), Scrip.isDisplayed(), TPrice.isDisplayed(),
				BSE.isDisplayed(), Validity.isDisplayed(), BigTradePlus.isDisplayed(), LimitPrice.isDisplayed(),
				AdvOrderType.isDisplayed(), TitleForm.isDisplayed() };

		try {
			for (int j = 0; j < arr.length; j++) {
				//System.out.println(arr[j] true );

				Assert.assertEquals(arr[j], true);

			}

		} catch (Throwable e) {
			collector.addError(e);
			System.out.println("Button are all display");
		}

	}

	public void ClickToClose() throws Exception {
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		Thread.sleep(10000);
		Close.click();
	}
}
