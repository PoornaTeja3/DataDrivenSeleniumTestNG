package stepdefinitions;

import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class DataTableSteps {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("User opened login page");
    }

    @When("user enters credentials")
    public void user_enters_credentials(DataTable dataTable) {

        List<Map<String, String>> users =
                dataTable.asMaps(String.class, String.class);

        for (Map<String, String> user : users) {

            String username = user.get("username");
            String password = user.get("password");

            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        }
    }

    @Then("user should see homepage")
    public void user_should_see_homepage() {
        System.out.println("Login successful");
    }
}