package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (snippets = SnippetType.CAMELCASE, strict = true, dryRun = false, plugin = { "pretty",
		"json:target/cucumber.json" }, monochrome = true, features = "src/test/resources", glue = "com.stepdefinition")

public class TestRunner {

	@AfterClass

	public static void afterClass() {
		Reporting.generate_jvmReport(System.getProperty("user.dir") + "\\target\\cucumber.json");

	}
}
