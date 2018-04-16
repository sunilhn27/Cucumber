package com.Runseperate;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "F:\\Selenium The Grand Final\\BDD\\src\\com\\Runseperate\\seperate.feature",
dryRun = false, monochrome = true,format ={"html:output1"},tags= {"@SomeTest" ,"~@Regression"})
public class Runner {

}
