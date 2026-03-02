package stepdefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("User opened login page");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("Entered credentials");
    }

    @Then("user should see homepage")
    public void user_should_see_homepage() {
        System.out.println("Login successful");
    }
}