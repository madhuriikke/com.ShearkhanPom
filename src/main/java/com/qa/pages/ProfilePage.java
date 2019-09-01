package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Testcore;



public class ProfilePage extends Testcore {

	public ProfilePage() {
		PageFactory.initElements(driver, this);
	}
//----------------------------all element here------------------------------

	@FindBy(xpath = "//a[contains(text(),'PROFILE')]")
	WebElement ProfileButton;
// -----------------------------------------------
	@FindBy(xpath = "//a[contains(text(),'View Profile')]")
	WebElement ViewProfile;

	@FindBy(xpath = "//a[contains(text(),'Edit Profile')]")
	WebElement EditProfile;

	@FindBy(xpath = "//a[contains(text(),'Membership Password')]")
	WebElement MembershipPassword;

	@FindBy(xpath = "//a[contains(text(),'Trading Password')]")
	WebElement TradingPassword;

	@FindBy(xpath = "//a[contains(text(),'?')]")
	WebElement ForgetPassword;
//--------------------------------------------------------------------
	@FindBy(xpath = "//div[@class='bkListH1']")
	WebElement CustomerProfile;
//------------------------------------------------------------------------
	@FindBy(xpath = "//div[@class='profile-box rd']//input[@id='emob']")
	WebElement ExistingMobNo;

	@FindBy(xpath = "//select[@id='isdcode']")
	WebElement ISDCode;

	@FindBy(xpath = "//form[@id='emailfrmprofile']//input[@id='mail']")
	WebElement NewMail;

	@FindBy(xpath = "//tr[4]//td[1]//input[1]")
	WebElement SubmitButton;

//----------------------all methods---------------------------------------

	public void CheckAllleftPanel() {
		boolean arr[] = new boolean[] { EditProfile.isDisplayed(), MembershipPassword.isDisplayed(),
				TradingPassword.isDisplayed(), ForgetPassword.isDisplayed(), CustomerProfile.isDisplayed() };

		try {
			for (int j = 0; j < arr.length; j++) {

				Assert.assertEquals(arr[j], true);

			}

		} catch (Throwable e) {
			collector.addError(e);
			System.out.println("Button are all display");
		}
	}

	public void TitleCustomerProfile() {
		String Title = CustomerProfile.getText();
		Assert.assertEquals(Title, "Customer Profile");

	}

	public void CheckCustomerPannel() {
		boolean arr[] = new boolean[] { ExistingMobNo.isDisplayed(), ISDCode.isDisplayed(), NewMail.isDisplayed(),
				SubmitButton.isDisplayed() };

		try {
			
			for (int i = 0; i < arr.length; i++) {

				Assert.assertEquals(arr[i], true);

			}

		} catch (Exception e) {
			System.out.println("Button are all display");
		}

	}

	public void ClickOnProfilePage() {
		ProfileButton.click();
	}

}
