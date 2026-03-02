package stepdefinitions;

import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;

import java.util.List;

public class ListSteps {

    

    @When("user enters usernames")
    public void user_enters_usernames(DataTable dataTable) {

        List<String> usernames = dataTable.asList();

        for (String username : usernames) {
            System.out.println("Username: " + username);
        }
    }

    
}