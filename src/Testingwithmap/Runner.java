package Testingwithmap;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "F:\\Selenium The Grand Final\\BDD\\src\\Testingwithmap\\regwithmap.feature", 
glue= {"F:\\Selenium The Grand Final\\BDD\\src\\Testingwithmap\\regwithmapstepdefinition.java"}, dryRun = true, monochrome = false,
format= {"html:output"})
public class Runner {

}
