package com.crmpro.test.hooks;

import com.crmpro.ParentPageClass.BasePage;
import com.crmpro.utilits.Utils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class ServiceHook extends BasePage {
	
	@Before
    public void initializeTest(){
        initialition();
    }
 
    @After
    public void embedScreenshot(Scenario scenario) {

        if (scenario.isFailed()) {
            try {
            	Utils.takeScreenshot(scenario.getName());
                // Code to capture and embed images in test reports (if scenario fails)
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
//    @AfterSuite
//    public void closeDown() {
//    	driver.close();
//    }
}

