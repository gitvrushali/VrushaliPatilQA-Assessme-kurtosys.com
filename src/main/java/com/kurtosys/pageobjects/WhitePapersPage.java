package com.kurtosys.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kurtoys.actiondriver.Action;
import com.kurtoys.base.BaseClass;

public class WhitePapersPage extends BaseClass {

	Action action = new Action();

	@FindBy(xpath = "//a[contains(text(),'UCITS White Paper')]")

	WebElement UCITSWhitePaperlink;

	public WhitePapersPage() {
		PageFactory.initElements(driver, this);
	}

	public UCITSWhitepaperPage clickOnUCITSWhitePaperlink() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		// whitePapersPage.clickOnUCITSWhitePaperlink();

		driver.findElement(By.xpath("//a[contains(text(),'UCITS White Paper')]")).click();

		return new UCITSWhitepaperPage();

	}

	public String varifyWhitePaperPage() {
		String whitePaperPage = driver.getTitle();
		return whitePaperPage;
	}

}
