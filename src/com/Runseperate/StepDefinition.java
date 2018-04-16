package com.Runseperate;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class StepDefinition {

	@Before("@Third")
	public void beforevery() {
		System.out.println("(****************************Before  %%%%%%%%%%% Scaneriio***********************");
	}

	@After("@Third")
	public void Aftervery() {
		System.out.println("(****************************After %%%%%%% Scaneriio***********************");

	}

	@Before
	public void beforeveryScenario() {
		System.out.println("(****************************Before Every Scaneriio***********************");
	}

	@After
	public void AfterveryScenario() {
		System.out.println("(****************************After Every Scaneriio***********************");

	}

	@Given("^valid Credintials$")
	public void valid_Credintials() {
		System.out.println("valid Credintials");
	}

	@Given("^invalid Credintials$")
	public void invalid_Credintials() {
		System.out.println("invalid Credintials");

	}

	@Given("^Ckciked on Admin$")
	public void ckciked_on_Admin() {
		System.out.println("Cilck on admin");

	}

	@Given("^Clciked on Add$")
	public void clciked_on_Add() {
		System.out.println("Clcik on Add");

	}

	@Given("^FirstNam Entered$")
	public void firstnam_Entered() {
		System.out.println("Enter Firstname");

	}

	@Given("^Middle Entered$")
	public void middle_Entered() {
		System.out.println("Enter Middle name");

	}

	@Given("^lastName Entered$")
	public void lastname_Entered() {
		System.out.println("Enter lastname");

	}

	@Given("^Phno Entered$")
	public void phno_Entered() {
		System.out.println("Enter Phno");

	}

	@Given("^Email Entered$")
	public void email_Entered() {
		System.out.println("Enter Email");

	}

	@Given("^Country Entered$")
	public void country_Entered() {
		System.out.println("Enter Country");

	}

	@Given("^state Entered$")
	public void state_Entered() {
		System.out.println("Enter State");

	}

	@Given("^Pincode Entered$")
	public void pincode_Entered() {
		System.out.println("Enter PinCode");

	}

	@Given("^Save Clicked$")
	public void save_Clicked() {
		System.out.println("Clciked on SAVE");

	}

	@Given("^Submit Clicked$")
	public void submit_Clicked() {
		System.out.println("Clcikde submit");

	}

	@Given("^Clciked Logout Button$")
	public void clciked_Logout_Button() {
		System.out.println("Clcikde on logout");

	}

	@Given("^Clsoing the Browser$")
	public void clsoing_the_Browser() {
		System.out.println("Close the Browser");

	}

}
