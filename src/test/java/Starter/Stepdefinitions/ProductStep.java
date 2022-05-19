package Starter.Stepdefinitions;

import Starter.Products.GetAllProduct;
import Starter.Products.GetProductByID;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class ProductStep {
    @Steps
    GetAllProduct getAllProduct;

    @Steps
    GetProductByID getById;

    //Get All Product
    @Given("I set endpoint for get list product")
    public void iSetEndpointForGetListProduct(){
        getAllProduct.getEndpointProductAll();
    }

    @When("I request get list product")
    public void iRequestGetListProduct(){
        getAllProduct.requestGetList();
    }

    @Then("Validate status code is {int}")
    public void validateStatusCodeIs(int Code){
        getAllProduct.validateStatusCode(Code);
        getById.validateStatusCodeIs(Code);
    }

    //Get Product By ID
    @Given("I set endpoint for get by id product")
    public void iSetEndpointForGetByIdProduct(){
        getById.getEndpointProductID();
    }
    @When("I request get product by id")
    public void iRequestGetProductById() throws IOException {
        getById.requestGetProductId();
    }
}
