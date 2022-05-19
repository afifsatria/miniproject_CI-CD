package Starter.Stepdefinitions;
import Starter.Authentication.Login;
import Starter.Authentication.Register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterStep {

    public String Email;

    @Steps
    Register register;

    @Given("I set an endpoint for register user")
    public void iSetAnEndpointForRegisterUser() {
        register.setEndpointRegister();
    }
    @When("I input {string} with {string} with {string}")
    public void iInputNullField(String fullname, String email, String password) {
        register.inputNullField(fullname, email, password);
    }

    @And("I request detail account user")
    public void iRequestDetailEmail() {
        this.Email = register.getEmailUser();
    }

    @Then("I validate status code is {int}")
    public void iValidateStatusCodeIsStatuscode(int arg0) {
        register.validateStatuscode(arg0);
    }

    @And("validate the data detail after create user")
    public void validateTheDataDetailAfterCreateUser(String message) {
        register.validateDataDetail(message);
    }

}
