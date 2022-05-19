package Starter.Ratings;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.RestRequests.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class GetProductRating {

    String base_url = "https://be-qa.alta.id/api/";

    @Step("I set endpoint for get product rating")
    public String getEndpointRating(){
        return base_url + "products/1997/ratings/";
    }

    @Step("I request get product rating")
    public void requestGetRatings(){
        given().when().get(getEndpointRating());
    }

    @Step("I get validate status code is {int}")
    public void getValidateStatusCode(int Codex){
        then().statusCode(equalTo(Codex));
    }
}
