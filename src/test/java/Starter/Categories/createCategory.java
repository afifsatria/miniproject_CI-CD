package Starter.Categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static org.hamcrest.Matchers.equalTo;

public class createCategory {

    String name;

    String baseUrl = "https://be-qa.alta.id/api/";

    @Step("I set an endpoint for create category")
    public String setEndpointCreateCategory(){
        return baseUrl + "categories/";
    }

    @Step("I input {string}")
    public void inputStringField(String name) {
        JSONObject requestData = new JSONObject();

        requestData.put("name", name);

        SerenityRest.given().header("Content-Type", "application/json").body(requestData.toJSONString());
        SerenityRest.when().post(setEndpointCreateCategory());
    }

    @Step("I request detail category")
    public String getNameUser() {
        return this.name;
    }

    @Step("I validate {int}")
    public void validateField(int statusCode) {
        SerenityRest.then().statusCode(statusCode);
    }

    @Step("validate the data detail after create category")
    public void validateDataDetailAfterCreateCategory(String message) {
        if (message.equals("success")) {
            SerenityRest.then().body("name", equalTo(this.name));
        } else {
            SerenityRest.then().body("name", equalTo(null));
        }
    }
}
