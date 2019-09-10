package com.crmpro.ParentPageClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crmpro.utilits.CommonAction;



public class BasePage {
	public static WebDriver driver; 
	public static Properties properties_obj;
	public static String currentDirectory = System.getProperty("user.dir");

	
	public BasePage() {
		try {
			String properties_path = currentDirectory + "/src/resource/java/properties/config.properties";
			properties_obj = new Properties();
			FileInputStream file_input = new FileInputStream(properties_path);
			properties_obj.load(file_input);
		}
		catch(IOException ex) {
			ex.getStackTrace();
		}
	}
//	@Parameters("browser")
	public static void initialition() {
		System.out.println("Driver is opening !!");
		String browser = properties_obj.getProperty("browser"); //Get properties from properties file.
		String path_gekoDriiver = currentDirectory + "/src/resource/drivers/com/crmpro/driver/geckodriver.exe";
		String path_chromeDriver = currentDirectory + "/src/resource/drivers/com/crmpro/driver/chromedriver.exe";
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", path_chromeDriver);
			if(driver == null) {
				driver = new ChromeDriver();
			}
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", path_gekoDriiver);
			if(driver == null) {
				driver = new FirefoxDriver();
			}
		}
		
		CommonAction.window_Maximize();  //Windows will maximize.
		CommonAction.deleteAllCookies();	//Delete all cookies.
		CommonAction.pageLoadTimeout(30); //Wait untile page are fully loeaded.
		CommonAction.implicitlyWait(10); //Wait until element is found, but wait until a time.
		driver.get(properties_obj.getProperty("url")); //Lunch the url.		
		
	}


}
