package starter.admin;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class GettingAResource {
    private static String url = "https://jsonplaceholder.typicode.com";

    @Step("I set API endpoint for getting a resource")
    public String setApiEndpoint() {
        return url + "/posts/1 ";
    }

    @Step("I send a GET request with a valid resource ID")
    public void sendGettingResourceRequest() {
        SerenityRest.given()
                .get(setApiEndpoint());
    }

    @Step("I receive details of the resource")
    public void resourceCreatedSuccessfully() {
        restAssuredThat(response -> response.body("'id'", notNullValue()));
        restAssuredThat(response -> response.body("'title'", notNullValue()));
        restAssuredThat(response -> response.body("'body'", notNullValue()));
        restAssuredThat(response -> response.body("'userID'", nullValue()));
    }

    @Step("I set invalid API endpoint for getting a resource")
    public String setInvalidApiEndpoint() {
        return url + "/posts/999 ";
    }

    @Step("I send a GET request with a non-existent resource ID")
    public void sendInvalidGettingResourceRequest() {
        SerenityRest.given()
                .get(setApiEndpoint());
    }
}
