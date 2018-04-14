package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {


	@Given("^lauch the browser$")
	public void lauch_the_browser() {
		System.out.println("laucning");
	}

	@When("^user should be in loginpage$")
	public void user_should_be_in_loginpage() {
		System.out.println("in loginpage");
	}

	@Then("^Enter username \"([^\"]*)\"$")
	public void enter_username(String username) {
		System.out.println("entered username" + username);
	}

	@Then("^Enter password \"([^\"]*)\"$")
	public void enter_password(String password) {
		System.out.println("entered password" + password);
	}

	@Then("^Click on login button$")
	public void click_on_login_button() {
		System.out.println("clciked");
	}

}
