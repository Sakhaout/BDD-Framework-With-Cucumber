package com.crmpro.runnerClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		features = {"src/test/java/featureFile"},
		glue = {"com.crmpro.stepDefinitions", "com.crmpro.test.hooks"},
		tags = {"~@loginFeature, @ContactsPageFuture"},
		plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
		monochrome = true,
		strict = true,
		dryRun = false)

public class RunnerClass extends AbstractTestNGCucumberTests{
	private TestNGCucumberRunner testNGCucumberRunner;
//	@BeforeClass(alwaysRun = true)
//	public void setUpClass() {
//		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//		
//	}
//	@Test(groups = "cucumber", description = "Runs cucumber feature", dataProvider = "features")
//	public void feature(CucumberFeatureWrapper cucumberFeature) {
//		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
//	}
//	@DataProvider(parallel = true)
//	public Object[][] features(){
//		return testNGCucumberRunner.provideFeatures();
//	}
//	@AfterSuite
//	public void tearDown() {
//		testNGCucumberRunner.finish();
//	}

}
