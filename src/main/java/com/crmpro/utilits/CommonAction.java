package com.crmpro.utilits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.crmpro.ParentPageClass.BasePage;

public abstract class CommonAction extends BasePage {
	
	public static void click(WebElement element) {
		element.click();
	}
	
	public static void clickByJavaScript(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		
	}
	
	public static void sendKeys(WebElement element, String string) {
		element.sendKeys(string);
	}
	
	public static String get_pageTitle() {
		return driver.getTitle();
	}

	public static void switchToFrame(String frameNameORid) {
		driver.switchTo().frame(frameNameORid);
	}
	
	public static void implicitlyWait(int Implicitly_Wait) {
		driver.manage().timeouts().implicitlyWait(Implicitly_Wait, TimeUnit.SECONDS);
	}
	
	public static void pageLoadTimeout(int Page_Load_TimeOut) {
		driver.manage().timeouts().pageLoadTimeout(Page_Load_TimeOut, TimeUnit.SECONDS);
	}
	
	public static void window_Maximize() {
		driver.manage().window().maximize(); 
	}
	
	public static void deleteAllCookies() {
		driver.manage().deleteAllCookies();	
	}

}
