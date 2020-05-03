package com.cybertek.step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class homepage_step_definition {

    @Given("user on the login page")
    public void user_on_the_login_page() {
        System.out.println(" aom going to login page ");
    }

    @When("user logs in as a team lead")
    public void user_logs_in_as_a_team_lead() {
       System.out.println(" i am loing in ");
    }

    @Then("homepage should be displayed")
    public void homepage_should_be_displayed() {
      System.out.println("can seet homepage");
    }

}
