package com.qa.pages;

import javax.swing.text.Segment;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.Testcore;

public class AccountPage extends Testcore {
	public AccountPage() {
		PageFactory.initElements(driver, this);
	}
//----------------------------------all element here-----------------------

	@FindBy(xpath = "//a[contains(text(),'Bank to Equity')]")
	WebElement BanktoEquity;

	@FindBy(xpath = "//a[contains(text(),'Bank to IPO')]")
	WebElement BanktoIPO;

	@FindBy(xpath = "//a[contains(text(),'Bank to MF')]")
	WebElement BanktoMF;

	@FindBy(xpath = "//a[contains(text(),'MF to Bank')]")
	WebElement MFtoBank;

	@FindBy(xpath = "//a[contains(text(),'NEFT/RTGS')]")
	WebElement NEFTRTGS;

	@FindBy(xpath = "//a[contains(text(),\"Standing Instruction for SIP's\")]")
	WebElement SIPs;

	@FindBy(xpath = "//a[contains(text(),'Equity to Bank')]")
	WebElement EquitytoBank;

	@FindBy(xpath = "//th[@class='bkListH1']")
	WebElement TittleText;

//---------------------FundTransfer---------------------------------------------

	@FindBy(xpath = "//select[@id='frombank']")
	WebElement From;

	@FindBy(xpath = "//select[@id='tobank']")
	WebElement To;

	@FindBy(xpath = "//input[@name='amount']")
	WebElement MOVERS;

	@FindBy(xpath = "//input[@name='btn']")
	WebElement Button;
//----------------------------------logout--------------------------------
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement Logout;
	

//---------------------------all methods here-----------------------------

	public void CheckAllleftPanel() {
		boolean arr[] = new boolean[] { BanktoEquity.isDisplayed(), BanktoIPO.isDisplayed(), BanktoMF.isDisplayed(),
				MFtoBank.isDisplayed(), NEFTRTGS.isDisplayed(), SIPs.isDisplayed(), EquitytoBank.isDisplayed() };

		try {
			for (int j = 0; j < arr.length; j++) {

				Assert.assertEquals(arr[j], true);

			}

		} catch (Throwable e) {
			collector.addError(e);
			System.out.println("Button are all display");
		}
	}

	public void CheckTextBox() {

		String Title = TittleText.getText();
		Assert.assertEquals(Title, "Fund Transfer");
	}
// ----------------------------fundTransfer---------------------------------

	public void MoveRs() {
		MOVERS.sendKeys("10");
	}

	public void SelectSegment() {
		Select select = new Select(From);
		select.selectByValue("MF");
		Select select1 = new Select(To);
		select.selectByValue("NSE");

	}

	public void ClickOnFundTransfer() {
		Button.click();
	}
	
	public void handleAlert() throws InterruptedException
	{
	 // Switching to Alert        
    Alert alert = driver.switchTo().alert();		
    		
    // Capturing alert message.    
    String alertMessage= driver.switchTo().alert().getText();		
    		
    // Displaying alert message	
    
    Thread.sleep(5000);
    		
    // Accepting alert		
    alert.accept();		
	}
//---------------------------------Logout--------------------------------
	public void Logout() {
		Logout.click();
	}


}