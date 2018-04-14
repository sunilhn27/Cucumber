package com.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Recruitmentsteps {
	WebDriver d;

	@Given("^User should be login$")
	public void user_should_be_login() {
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://opensource.demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		System.out.println("tesing");
	}

	@Then("^Enter username and password$")
	public void enter_username_and_password(DataTable cred) {
		List<List<String>> data = cred.raw();
		d.findElement(By.id("txtUsername")).sendKeys(data.get(0).get(0));
		System.out.println("username is " + data.get(0).get(0));
		d.findElement(By.id("txtPassword")).sendKeys(data.get(0).get(1));
		System.out.println("passwiord is " + data.get(0).get(1));
	}

	@Then("^Click on login$")
	public void click_on_login() {
		d.findElement(By.id("btnLogin")).click();

	}

	@Then("^Click on Recruitment button$")
	public void click_on_Recruitment_button() throws InterruptedException {
		d.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
		Thread.sleep(2000);
	}

	@Then("^Click on Add button$")
	public void click_on_Add_button() throws InterruptedException {
		d.findElement(By.id("btnAdd")).click();
		Thread.sleep(2000);
	}

	@Then("^enter firstname middlename lastname email phno$")
	public void enter_firstname_middlename_lastname_email_phno(DataTable details) {

		List<List<String>> info = details.raw();

		d.findElement(By.name("addCandidate[firstName]")).sendKeys(info.get(0).get(0));
		d.findElement(By.name("addCandidate[middleName]")).sendKeys(info.get(0).get(1));
		d.findElement(By.name("addCandidate[lastName]")).sendKeys(info.get(0).get(2));
		d.findElement(By.name("addCandidate[email]")).sendKeys(info.get(0).get(3));
		d.findElement(By.name("addCandidate[contactNo]")).sendKeys(info.get(0).get(4));
		d.findElement(By.id("btnSave")).click();
		Recruitmentsteps r = new Recruitmentsteps();
		r.output(info);

	}

	public void output(List<List<String>> info) {
		System.out.println("firstname" + info.get(0).get(0));
		System.out.println("firstname" + info.get(0).get(1));
		System.out.println("firstname" + info.get(0).get(2));
		System.out.println("firstname" + info.get(0).get(3));
		System.out.println("firstname" + info.get(0).get(4));
		System.out.println("*********************SUCCESFULLY PASSED**********************");
//		d.close();
	}
}
