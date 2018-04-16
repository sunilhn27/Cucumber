package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class steps {

	WebDriver d;

	@Given("^Testing with valid credintials$")
	public void testing_with_valid_credintials() {
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://opensource.demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		System.out.println("tesing");
	}

	@Then("^Enter username as \"([^\"]*)\"$")
	public void enter_username_as(String username) {
		System.out.println("username*****************" + username);
		d.findElement(By.id("txtUsername")).sendKeys(username);
	}

	@Then("^Enter  password as \"([^\"]*)\"$")
	public void enter_password_as(String password) {
		d.findElement(By.id("txtPassword")).sendKeys(password);
		System.out.println("username******************" + password);

	}

	@Then("^Click on login$")
	public void click_on_login() {
		d.findElement(By.id("btnLogin")).click();
		System.out.println("clicked");
		
	}

}
