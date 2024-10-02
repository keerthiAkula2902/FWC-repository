package org.cucumbertests;

import java.io.IOException;

import org.mytests.MyTests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends MyTests {

	@Given("Launch the Browser")
	public void Launch_the_Browser() {
		launch();

	}

	@Given("Provided with Username and Password")
	public void provided_with_username_and_password() {
		titleTest();

	}

	@When("login to the website")
	public void login_to_the_website() throws IOException, InterruptedException {
		loginTest();

	}

	@Then("add the items")
	public void add_the_items() throws IOException {
		addingItems();

	}

}
