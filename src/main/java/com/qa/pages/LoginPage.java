package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Testcore;

public class LoginPage extends Testcore {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
//----------------------all elememt here-------------------------------------

	@FindBy(xpath = "//input[@name='emailLoginId']")
	WebElement username;

	@FindBy(xpath = "//button[@class='blk-lg-button col-sm-12 more-margin']")
	WebElement click;

	@FindBy(xpath = "//input[@name='br_pwd']")
	WebElement password;

	@FindBy(xpath = "//button[@class='blk-lg-button col-sm-12 ng-binding']")
	WebElement click2;

	@FindBy(xpath = "//a[@class='hamburgerMenuIcon']")
	WebElement meun;

	@FindBy(xpath = "//a[@class='blk-sm-button']")
	WebElement switchto;

//-----------------------------------------------

	public String ValidateTitle() {
		return driver.getTitle();

	}

	public HomePage login(String user, String pass) {

		username.sendKeys(user);
		click.click();
		password.sendKeys(pass);
		click2.click();
		meun.click();
		switchto.click();
		return new HomePage();

	}

}
