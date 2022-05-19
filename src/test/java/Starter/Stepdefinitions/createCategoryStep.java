package Starter.Stepdefinitions;
import Starter.Categories.createCategory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class createCategoryStep {

    public String name;
    @Steps
    createCategory createCategory;

    @Given("I set an endpoint for create category")
    public void iSetAnEndpointForCreateCategory() {
        createCategory.setEndpointCreateCategory();
    }
    @When("I input {string}")
    public void iInputStringField(String name) {
        createCategory.inputStringField(name);
    }

    @And("I request detail category")
    public void iRequestDetailCategory() {
        this.name = createCategory.getNameUser();
    }

    @Then("I validate {int}")
    public void validateField(int arg0) {
        createCategory.validateField(arg0);
    }

}
