package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class exampleSteps2 {
    @Given("User navigates to way2automation website")
    public void user_navigates_to_way2automation_website() {
        System.out.println("user_navigates_to_way2automation_website");
    }
    @When("User validates the homepage title")
    public void user_validates_the_homepage_title() {
        System.out.println("user_validates_the_homepage_title");
    }
    @Then("User navigates to Practice site one")
    public void user_navigates_to_practice_site_one() {
        System.out.println("user_navigates_to_practice_site_one");
    }
    @Then("User fill the dummy registration form")
    public void user_fill_the_dummy_registration_form() {
        System.out.println("user_fill_the_dummy_registration_form");
    }
    @Then("User click on submit")
    public void user_click_on_submit() {
        System.out.println("user_click_on_submit");
    }
    @When("user validates the home page title with age and locations")
    public void userValidatesTheHomePageTitleWithAgeAndLocations(DataTable table) {
        List<Map<String,String>> data = table.asMaps(String.class,String.class);
        for (Map<String, String> obj:data) {
            System.out.println("user_select_the_age_category "+obj.get("Age")+" Location as ------ "+obj.get("Location"));
        }
    }
}
