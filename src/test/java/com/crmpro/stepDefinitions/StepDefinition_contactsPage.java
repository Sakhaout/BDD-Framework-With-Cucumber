package com.crmpro.stepDefinitions;

import org.testng.Assert;

import com.crmpro.Page_Class.ContactsPage;
import com.crmpro.Page_Class.LogInPage;
import com.crmpro.ParentPageClass.BasePage;
import com.crmpro.utilits.CommonAction;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition_contactsPage extends BasePage {
	
	private LogInPage loginpage_obj = new LogInPage();
	private ContactsPage contactsPage_Obj = new ContactsPage();

	
	@When("^user will login into loginPage$")
	public void user_will_login_into_loginPage(){
		loginpage_obj.logInFunction("USER_NAME", "PASSWORD");

	}
	
	
	@And("^user will landing to HomePage$")
	public void user_will_landing_to_HomePage() {
		String actualTitle = "CRMPRO";
		String expectedTitle = CommonAction.get_pageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Then("^user will click on Contacts$")
	public void user_will_click_on_Contacts(){
		CommonAction.switchToFrame("mainpanel");
		contactsPage_Obj.clickOnContatsLink();

	}

	@Then("^varify user is in ContactsPage$")
	public void varify_user_is_in_ContactsPage(){
		String actualTitle = "CRMPRO";
		String expectedTitle = CommonAction.get_pageTitle();
		System.out.println("Current Title=> "+expectedTitle);
		Assert.assertEquals(actualTitle, expectedTitle);		

	}

}
