package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class exampleSteps1 {
    @Given("user navigates to facebook website")
    public void user_navigates_to_facebook_website() {
        System.out.println("user_navigates_to_facebook_website");
    }
    @When("user validates the home page title")
    public void user_validates_the_home_page_title() {
        System.out.println("user_validates_the_home_page_title");
    }
    @Then("^user entered \"([a-zA-Z]{1,})\" username$")
    public void user_entered_valid_username(String username) {
        System.out.println("user entered "+username+" username");
    }
    @Then("^user entered \"([a-zA-Z]{1,})\" password$")
    public void user_entered_valid_password(String password) {
        System.out.println("user entered "+password+" password");
    }
    @Then("^user \"([a-zA-Z]{1,})\" successfully logged in$")
    public void user_should_be_succesfully_logged_in(String validateLogin) {
        System.out.println("user "+validateLogin+" successfully logged in");
    }

    @Then("user entered {string} for registration")
    public void user_entered_for_registration(String username) {
        System.out.println("user_entered_"+username+"for_registration");
    }
    @Then("^user entered \"([^\"]*)\" for next step as registration")
    public void user_entered_for_next_step_as_registration(String password) {
        System.out.println("user_entered_"+password+"for_next_step_as_registration");
    }
    @Then("^user \"([^\"]*)\" successfully completed the registration")
    public void user_successfully_completed_the_registration(String loginType) {
        System.out.println("user"+loginType+"_successfully_completed_the_registration");
    }
    @Then("user select the age category")
    public void user_select_the_age_category(DataTable table) {
        List<Map<String,String>> data = table.asMaps(String.class,String.class);
        for (Map<String, String> obj:data) {
            System.out.println("user_select_the_age_category "+obj.get("Age")+" Location as ------ "+obj.get("Location"));
        }
    }
    @Then("user select the height category")
    public void user_select_the_height_category(List<String> list) {
        for (String obj:list) {
            System.out.println("user_select_the_age_category "+obj);
        }
    }
}
