package com.crmpro.runnerClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\Hossain Sakhaout\\Desktop\\MavenProject\\BDD-Framework-With-Cucumber\\src\\feature_file\\com\\crmpro\\features\\LoginPage.feature",
		glue = {"C:\\Users\\Hossain Sakhaout\\Desktop\\MavenProject\\BDD-Framework-With-Cucumber\\src\\feature_file\\com\\crmpro\\stepDefinitions\\LoginStepDefinition"},
		tags = {"@UATTesting"})

public class RunnerClass {
	private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		
	}
	@Test(groups = "cucumber", description = "Runs cucumber feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}
	@DataProvider
	public Object[][] features(){
		return testNGCucumberRunner.provideFeatures();
	}
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		testNGCucumberRunner.finish();
	}

}
