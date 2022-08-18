package org.step;

import org.base.BaseClass;
import org.pojo.Pojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationClass extends BaseClass {


@Given("^user has to launch the chrome browser and pass the url$")
public void user_has_to_launch_the_chrome_browser_and_pass_the_url() throws Throwable {
	
	launchBrowser();
	maxBrowser();
	passUrl("https://en-gb.facebook.com/");
}


@When("^user has to enter the values in username and password$")
public void user_has_to_enter_the_values_in_username_and_password() throws Throwable {
	Pojo p=new Pojo();
	toInput(p.getTxtpass(), "seeniujm");
	toInput(p.getTxtpass(), "gshsjs");
	
}

@When("^user has to click the login button$")
public void user_has_to_click_the_login_button() throws Throwable {
	
	Pojo p=new Pojo();
	btnClick(p.getClkbtn());
	
	
}

@Then("^user has to navigate the error page$")
public void user_has_to_navigate_the_error_page() throws Throwable {

	System.out.println("Homepage");
}
}