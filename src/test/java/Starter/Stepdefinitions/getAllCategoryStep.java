package Starter.Stepdefinitions;

import Starter.Categories.getAllCategory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class getAllCategoryStep {

    @Steps
    getAllCategory getCategory;

    @Given("I set an endpoint for get all categories")
    public void iSetAnEndpointForGetAllCategories(){
        getCategory.setAnEndpointForGetCategories();
    }

    @When("I request GET category list")
    public void iRequestGETCategoryList(){
        getCategory.requestGetCategoryList();
    }


    @Then("I validate the status code is {int}")
    public void iValidateTheStatusCodeIs(int code){
        getCategory.setValidateTheStatusCodeIs(code);
    }
}
