package com.crmpro.stepDefinitions;

import org.testng.Assert;

import com.crmpro.Page_Class.LogInPage;
import com.crmpro.ParentPageClass.BasePage;
import com.crmpro.utilits.CommonAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class StepDefinition_Login extends BasePage {
	
	private LogInPage loginPage_obj = new LogInPage();

	@Given("^user is already on Login Page$")
	public void user_atready_on_Login_Page() {
		String expectedTitle = "CRMPRO - CRM software for customer relationship management, sales, and support.";
		 String actualTitle = driver.getTitle();
	     System.out.println(actualTitle);
		 Assert.assertEquals(actualTitle, expectedTitle);
	}
	

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		loginPage_obj.enterUserName_Password("USER_NAME", "PSSWORD");
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button(){
		loginPage_obj.clickOnLogin_button();
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page(){
		String expectedTitle = "CRMPRO";
		String actualTitle = CommonAction.get_pageTitle();
		System.out.println("Home Page title ::"+ actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	

}
