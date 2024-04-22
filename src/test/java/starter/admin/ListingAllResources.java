package starter.admin;

import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class ListingAllResources {
    private static String url = "https://jsonplaceholder.typicode.com";

    @Step("I set API endpoint for listing all resources")
    public String setApiEndpoint() {
        return url + "/posts";
    }

    @Step("I send a GET request to the endpoint")
    public void sendListingAllResourcesRequest() {
        SerenityRest.given()
                .get(setApiEndpoint());
    }

    @Step("I receive status code 200")
    public void receiveStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive a list of resources")
    public void receiveListOfResources() {
        restAssuredThat(response -> response.body("'userId'", notNullValue()));
        restAssuredThat(response -> response.body("'id'", notNullValue()));
        restAssuredThat(response -> response.body("'title'", notNullValue()));
        restAssuredThat(response -> response.body("'body'", notNullValue()));
    }

    @Step("I send a GET request with incorrect ID")
    public void sendListingAllResourceIncorrectIdRequest() {
        SerenityRest.given()
                .get(setApiEndpoint());
    }

    @Step("I receive a error message")
    public void receiveErrorMessage() {
        SerenityRest.given()
                .get(setApiEndpoint());
    }
}