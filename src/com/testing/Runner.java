package com.testing;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "F:\\Selenium The Grand Final\\BDD\\src\\com\\testing\\rec.feature", dryRun = false, monochrome = true,
format= {"html:output"})
public class Runner {

}
