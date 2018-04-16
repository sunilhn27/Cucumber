package TestingWithMapOrg;

import java.util.Map;

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
	public void enter_username_and_password(DataTable cred) throws InterruptedException {
		for (Map<String, String> data : cred.asMaps(String.class, String.class)) {
			Thread.sleep(20000);
			d.findElement(By.id("txtUsername")).sendKeys(data.get("username"));
			d.findElement(By.id("txtPassword")).sendKeys(data.get("password"));
			System.out.println("username is " + data.get("username") + "and" + "password is " + data.get("password"));
		}
	}

	@Then("^Click on login$")
	public void click_on_login() {
		d.findElement(By.id("btnLogin")).click();
		System.out.println("clicked");
	}

	@Then("^Click on Recruitment button$")
	public void click_on_Recruitment_button() throws InterruptedException {
		d.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
		Thread.sleep(2000);
	}

	@Then("^Click on Add button$")
	public void click_on_Add_button() throws InterruptedException {
		d.findElement(By.name("btnAdd")).click();
		Thread.sleep(2000);
	}

	@Then("^enter firstname middlename lastname email phno$")
	public void enter_firstname_middlename_lastname_email_phno(DataTable data1) {
		for (Map<String, String> info : data1.asMaps(String.class, String.class)) {
			d.findElement(By.name("addCandidate[firstName]")).sendKeys(info.get("FirstName"));
			d.findElement(By.name("addCandidate[middleName]")).sendKeys(info.get("Middlename"));
			d.findElement(By.name("addCandidate[lastName]")).sendKeys(info.get("lastname"));
			d.findElement(By.name("addCandidate[email]")).sendKeys(info.get("Emailid"));
			d.findElement(By.name("addCandidate[contactNo]")).sendKeys(info.get("Phno"));
		}
	}

	@Then("^click on save button$")
	public void click_on_save_button() {
		d.findElement(By.id("btnSave")).click();

	}
}
