package com.crmpro.stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.crmpro.Base_Page.BasePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends BasePage {
	
//	public WebDriver driver = new ChromeDriver();

	
	@Given("^user is already on Login Page$")
	public void user_atready_on_Login_Page() {
		BasePage.initialition();
	}
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM(){
		 String title = driver.getTitle();
	     System.out.println(title);
		 Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);	}
	
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(){
		driver.findElement(By.name("username")).sendKeys("sakhaout");
		driver.findElement(By.name("password")).sendKeys("Sakhaout8");
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button(){
		WebElement loginBtn =driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page(){
		String title = driver.getTitle();
		System.out.println("Home Page title ::"+ title);
		Assert.assertEquals("CRMPRO", title);
	}
	

}
