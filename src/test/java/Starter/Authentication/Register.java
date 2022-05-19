package Starter.Authentication;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.json.simple.JSONObject;
import Util.Generate;
import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.Matchers.equalTo;

public class Register {

    String Email;

    @Steps
    Generate generate;


    String base_url = "https://be-qa.alta.id/api/";

    @Step("I set an endpoint for register user")
    public String setEndpointRegister() {
        return base_url + "auth/register/";
    }

    @Step("I input {string} with {string} with {string}")
    public void inputNullField(String fullname, String email, String password) {
        JSONObject requestData = new JSONObject();
        if (email.equals("tama")){
            this.Email = "yes";
        } else if(email.equals("tama12")){
            this.Email = generate.randomEmail();
            try (FileWriter file = new FileWriter("src//test//resources//filejson//email.json")) {
                file.write(this.Email);
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            this.Email = null;
        }
        requestData.put("fullname", fullname);
        requestData.put("email", this.Email);
        requestData.put("password", password);

        SerenityRest.given().header("Content-Type", "application/json").body(requestData.toJSONString());
        SerenityRest.when().post(setEndpointRegister());
    }

    @Step("I request detail account user")
    public String getEmailUser() {
        return this.Email;
    }

    @Step("I validate status code is {int}")
    public void validateStatuscode(int statusCode) {
        SerenityRest.then().statusCode(statusCode);
    }

    @Step("validate the data detail after create user")
    public void validateDataDetail(String message) {
        if (message.equals("success")) {
            SerenityRest.then().body("email", equalTo(this.Email));
        } else {
            SerenityRest.then().body("email", equalTo(null));
        }
    }
}
