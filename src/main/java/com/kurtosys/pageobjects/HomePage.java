package com.kurtosys.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kurtoys.actiondriver.Action;
import com.kurtoys.base.BaseClass;

public class HomePage extends BaseClass {

	Action action = new Action();

	@FindBy(xpath = "//a[@href='https://www.kurtosys.com/resources/']"
			+ "//div[@class='kurtosys-menu-item-wrapper']//div[@class='kurtosys-menu-title']")

	WebElement InsightBtn;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnInsightBtn() {
		Action.mouseHoverByJavaScript(InsightBtn);
	}

	public String varifyWhitePaperTitle() {
		String whitePageURL = driver.getTitle();
		return whitePageURL;
	}

	public WhitePapersPage selectOptionFromDropdown(String value) {
		List<WebElement> Alloptions = driver.findElements(By.xpath("//*[@id=\"kurtosys-menu-item-75710\"]/"
				+ "div/div/div/div/section/div/div/div/div/div/div/div/ul/li[3]/a"));

		System.out.println(Alloptions);
		for (WebElement option : Alloptions) {
			if (option.getText().equals(value)) {
				option.click();
				break;
			}
		}

		return new WhitePapersPage();
	}

}
