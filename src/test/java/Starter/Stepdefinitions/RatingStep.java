package Starter.Stepdefinitions;

import Starter.Ratings.GetProductRating;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RatingStep {
    @Steps
    GetProductRating getProductRating;

    @Given("I set endpoint for get product rating")
    public void iSetEndpointForGetProductRating(){
        getProductRating.getEndpointRating();
    }

    @When("I request get product rating")
    public void iRequestGetProductRating(){
        getProductRating.requestGetRatings();
    }

    @Then("I get validate status code is {int}")
    public void iGetValidateStatusCodeIs(int codex){
        getProductRating.getValidateStatusCode(codex);
    }
}
