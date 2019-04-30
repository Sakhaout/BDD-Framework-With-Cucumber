package com.crmpro.stepDefinitions;

import org.openqa.selenium.By;

import com.crmpro.Base_Page.BasePage;
import com.crmpro.Page_Class.HomePage;
import com.crmpro.Page_Class.LogInPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefinition extends BasePage {
	
	private HomePage homepage_obj = new HomePage();
	private LogInPage loginpage_obj = new LogInPage();
	
	@When("^user will enters username and password$")
	public void user_will_enters_username_and_password(){
		loginpage_obj.logInFunction("sakhaout", "Sakhaout8");
	}
	
	@Then ("^user will get data from time schedule table$")
	public void user_will_get_data_from_time_schedule_table() {
		homepage_obj.getTable();
	}
	
	@Then ("^user will loged out$")
	public void user_will_logedout() {
		homepage_obj.logout();
	}

}
