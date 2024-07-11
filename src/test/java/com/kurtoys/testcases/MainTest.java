package com.kurtoys.testcases;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kurtosys.pageobjects.HomePage;
import com.kurtosys.pageobjects.UCITSWhitepaperPage;
import com.kurtosys.pageobjects.WhitePapersPage;
import com.kurtoys.actiondriver.Action;
import com.kurtoys.base.BaseClass;

public class MainTest extends BaseClass {

	HomePage homepage;
	WhitePapersPage whitePapersPage;
	UCITSWhitepaperPage ucitsSWhitepaperPage;

	@BeforeClass
	public void setUp() {
		launchApp();
	}

	public void tearDowb() {
		driver.quit();

	}

	@Test
	public void selectDropdown() throws InterruptedException {
		homepage = new HomePage();
		whitePapersPage = new WhitePapersPage();

		ucitsSWhitepaperPage = new UCITSWhitepaperPage();
		homepage.clickOnInsightBtn();
		Thread.sleep(3000);
		homepage.selectOptionFromDropdown("White Papers & eBooks");

		String actualUrl = homepage.varifyWhitePaperTitle();
		String expectedUrl = "White Papers | Kurtosys";
		Assert.assertEquals(actualUrl, expectedUrl);

		Thread.sleep(5000);
		whitePapersPage.clickOnUCITSWhitePaperlink();
		String actualString = whitePapersPage.varifyWhitePaperPage();
		String expected = "UCITS White Paper | Kurtosys";

		Assert.assertEquals(actualString, expected);
		Thread.sleep(2000);

		ucitsSWhitepaperPage.acceptCookies();
		Thread.sleep(2000);

		ucitsSWhitepaperPage.EnterFistName("Vrushali");

		ucitsSWhitepaperPage.EnterLastName("Patil");
		ucitsSWhitepaperPage.EnterCompanyName("IBM");
		ucitsSWhitepaperPage.EnterIndustryName("IT");
		ucitsSWhitepaperPage.clickonSendCoopyButton();
		ucitsSWhitepaperPage.takescreenShot();

		WebElement errorMsg = driver.findElement(By.xpath("//p[contains(text(),'Please correct')]"));
		String actualErrormsg = errorMsg.getText();
		String expectedErrormsg = "Please correct the errors below:";

	}

}
