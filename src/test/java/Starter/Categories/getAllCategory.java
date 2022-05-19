package Starter.Categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class getAllCategory {

    String baseUrl = "https://be-qa.alta.id/api/";

    @Step("I set an endpoint for get all categories")
    public String setAnEndpointForGetCategories(){
        return baseUrl + "categories";
    }

    @Step("I request GET category list")
    public void requestGetCategoryList(){
        SerenityRest.given().get(setAnEndpointForGetCategories());
    }

    @Step("I validate the status code is {int}")
    public void setValidateTheStatusCodeIs(int code) {
        SerenityRest.then().statusCode(code);
    }
}
