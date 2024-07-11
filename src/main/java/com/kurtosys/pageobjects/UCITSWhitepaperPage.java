package com.kurtosys.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kurtoys.actiondriver.Action;
import com.kurtoys.base.BaseClass;

public class UCITSWhitepaperPage  extends BaseClass {
	
	Action action= new Action();
	
	
	@FindBy(xpath ="//*[@id=\"18882_231669pi_18882_231669\"]")
	
	WebElement FirstName;
	

	@FindBy(id ="18882_231671pi_18882_231671")
	
	WebElement LastName;
	
	
	@FindBy(id ="18882_231675pi_18882_231675")
	
	WebElement Company ;
	
	
    @FindBy(id ="18882_231677pi_18882_231677")
	
	WebElement Industry ;
    
    @FindBy(xpath ="//input[@type='submit' and @accesskey='s' and @value='Send me a copy']")
	
	WebElement SendCoppyBtn;
    
    
    @FindBy(xpath="//button[contains(text(),'Accept All Cookies')]")
    WebElement cookies;
    
	
	
	public   UCITSWhitepaperPage () 
	{
		PageFactory.initElements(driver, this);  
	}
	
	public void EnterFistName(String firstname)
	
	{
		
		action.type(FirstName, firstname);
		
	}
	
	public void EnterLastName(String lastname)
	{
		action.type(LastName, lastname);
		
		
	
	
	}
	
	public void EnterCompanyName(String companyname)
	{
		action.type(Company, companyname);
		
		}
	
	public void EnterIndustryName(String industryName)
	{
		action.type(Industry, industryName);                
		
		
	}
	public void clickonSendCoopyButton()
	{
		action.click(driver, SendCoppyBtn);
	}
	
	public void acceptCookies() {
		
		cookies.click();
		
	}
	
	public void takescreenShot()
	{
		action.screenShot(driver, "/KurtosysAssessmentUITest/ScreenShots/KurtosysAssessmentUITest");
	}
	
	
	
	

}
