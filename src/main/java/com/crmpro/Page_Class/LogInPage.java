package com.crmpro.Page_Class;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crmpro.ParentPageClass.BasePage;
import com.crmpro.utilits.CommonAction;




public class LogInPage extends BasePage {
	
	
	
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement userName;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement logIn_button;
	
	public LogInPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	

	
	public void logInFunction(String userID, String pass){
		try {
			userName.sendKeys(userID);
			password.sendKeys(pass);
			logIn_button.click();
		}catch(Exception ex) {
			ex.getStackTrace();
		}
		
	}
	
	public void enterUserName_Password(String userID, String pass){
		CommonAction.sendKeys(userName, userID);
		CommonAction.sendKeys(password, pass);
	}
	
	public void clickOnLogin_button() {
		CommonAction.click(logIn_button);
	}

}
