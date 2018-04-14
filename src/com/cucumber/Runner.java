package com.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, monochrome = true, features = "F:\\Selenium The Grand Final\\BDD\\src\\Features\\login1.feature", glue = {
		"stepDefinitions" }, format = { "pretty", "html:test"})
public class Runner {

}
