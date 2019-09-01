package com.qa.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.qa.util.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "F:\\Salenium Project\\com.ShearkhanPom\\src\\main\\java\\com\\qa\\feature", // the path of
		glue = { "com\\qa\\stepdefination" }, // the path of the step definition files
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },

		// format= {"pretty","html:test-outout", "json:json_output/cucumber.json",
		// "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		// monochrome = true, //display the console output in a proper readable format
		// strict = true, //it will check if any step is not defined in step definition
		// file
		dryRun = false// to check the mapping is proper between feature file and step def file
        // tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}
)

public class TestRunner {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}

}