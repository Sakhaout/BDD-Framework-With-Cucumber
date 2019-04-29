package com.crmpro.stepDefinitions;

import com.crmpro.Base_Page.BasePage;

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
                // Code to capture and embed images in test reports (if scenario fails)
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    @After
    public void closeDown() {
    	driver.close();
    }
}

