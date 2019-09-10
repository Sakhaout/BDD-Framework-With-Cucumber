package com.crmpro.Page_Class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crmpro.ParentPageClass.BasePage;
import com.crmpro.utilits.CommonAction;

public class ContactsPage extends BasePage {
	@FindBy(xpath = "//a[@title = 'Contacts']")
	private WebElement contactsLink;
	
	
	public ContactsPage(){
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnContatsLink() {
		CommonAction.click(contactsLink);
	}

}
