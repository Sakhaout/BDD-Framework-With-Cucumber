package com.crmpro.Base_Page;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BasePage {
	public static WebDriver driver; 
	public static Properties properties_obj;
	public static int Page_Load_TimeOut = 30;
	public static int Implicitly_Wait = 20;
	
	public BasePage() {
		try {
			String properties_path = "C:\\Users\\Hossain Sakhaout\\Desktop\\MavenProject\\BDD-Framework-With-Cucumber\\src\\main\\java\\properties\\config.properties";
			properties_obj = new Properties();
			FileInputStream file_input = new FileInputStream(properties_path);
			properties_obj.load(file_input);
		}
		catch(IOException ex) {
			ex.getStackTrace();
		}
	}
	
	public static void initialition() {
		String browser = properties_obj.getProperty("browser"); //Get properties from properties file.
		String path_gekoDriiver = "C:\\Users\\Hossain Sakhaout\\Desktop\\MavenProject\\BDD-Framework-With-Cucumber\\src\\resource\\drivers\\com\\crmpro\\driver\\geckodriver.exe";
		String path_chromeDriver = "C:\\Users\\Hossain Sakhaout\\Desktop\\MavenProject\\BDD-Framework-With-Cucumber\\src\\resource\\drivers\\com\\crmpro\\driver\\chromedriver.exe";
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", path_chromeDriver);
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", path_gekoDriiver);
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();  //Windows will maximize.
		driver.manage().deleteAllCookies();		//Delete all cookies.
		driver.manage().timeouts().pageLoadTimeout(Page_Load_TimeOut, TimeUnit.SECONDS); //Wait untile page are fully loeaded.
		driver.manage().timeouts().implicitlyWait(Implicitly_Wait, TimeUnit.SECONDS); //Wait until element is found, but wait until a time.
		driver.get(properties_obj.getProperty("url")); //Lunch the url.		
		
	}


}
