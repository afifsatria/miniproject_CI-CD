package Starter.Products;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.RestRequests.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class GetAllProduct {
    String base_url = "https://be-qa.alta.id/api/";
    @Step("I set endpoint for get list product")
    public String getEndpointProductAll(){
        return base_url + "products/";
    }

    @Step("I request get list product")
    public void requestGetList(){
        given().when().get(getEndpointProductAll());
    }

    @Step("Validate status code is {int}")
    public void validateStatusCode(int Code){
        then().statusCode(equalTo(Code));
    }
}
