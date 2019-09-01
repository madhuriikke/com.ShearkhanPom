package com.qa.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Testcore;

public class Research1Page extends Testcore {

	public Research1Page() {
		PageFactory.initElements(driver, this);
	}
//-----------------------------all element here---------------------------

	@FindBy(xpath ="//a[@class='active']")
	WebElement Calls;

	@FindBy(xpath ="//a[contains(text(),'DERIVATIVE [1]')]")
	WebElement DERIVATIVE;

	@FindBy(xpath ="//a[contains(text(),'COLLAR [3]')]")
	WebElement LONGCOLLAR;

	@FindBy(xpath ="//a[contains(text(),'FUNDAMENTAL [4]')]")
	WebElement FUNDAMENTAL;

	@FindBy(xpath ="//a[contains(text(),'SYNTHETIC SHORT FUTURE [2]')]")
	WebElement SYNTHETICSHORFUTURE;

	@FindBy(xpath ="//a[contains(text(),'SHORT IRON BUTTERFLY [4]')]")
	WebElement SHORTIRONBUTTERFLY;
//-------------------------all methods------------------------------------

	/*
	 * public void CheckAllButtons() { boolean arr[] = new boolean[] {
	 * Calls.isDisplayed(), DERIVATIVE.isDisplayed(), LONGCOLLAR.isDisplayed(),
	 * FUNDAMENTAL.isDisplayed(), SYNTHETICSHORFUTURE.isDisplayed(),
	 * SHORTIRONBUTTERFLY.isDisplayed() };
	 * 
	 * try { for (int i = 0; i < arr.length; i++) {
	 * 
	 * Assert.assertEquals(arr[i], true);
	 * 
	 * }
	 * 
	 * } catch (Throwable e) { collector.addError(e);
	 * System.out.println("Button are all display"); } }
	 */
	
	@FindBy(xpath="//*[@class='grey-arrow-list']")
	List<WebElement>alllinks;
	public void CheckAllButtons() {
		
		try {
			for (int i = 0; i < alllinks.size(); i++) {

				Assert.assertEquals(alllinks.get(i).isDisplayed(), true);

			}

		} catch (Throwable e) {
			collector.addError(e);
			System.out.println("Button are all display");
		}
	}
}