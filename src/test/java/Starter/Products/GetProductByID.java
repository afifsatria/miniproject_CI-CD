package Starter.Products;

import net.thucydides.core.annotations.Step;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static net.serenitybdd.rest.RestRequests.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class GetProductByID {
    String base_url = "https://be-qa.alta.id/api/";

    @Step("I set endpoint for get by id product")
    public String getEndpointProductID(){
        return base_url + "products/{idProduct.json}";
    }

    @Step("I request get product by id")
    public void requestGetProductId() throws IOException {
        String idProduct = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "//src//test//resources//filejson//idProduct.json"), StandardCharsets.UTF_8);
        given()
                .pathParam("idProduct.json", idProduct).when().get(getEndpointProductID());
    }
    @Step("Validate status code is {int}")
    public void validateStatusCodeIs(int Code){
        then().statusCode(equalTo(Code));
    }
}
