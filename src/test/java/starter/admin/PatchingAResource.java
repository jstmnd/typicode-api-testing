package starter.admin;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class PatchingAResource {
    private static String url = "https://jsonplaceholder.typicode.com";

    @Step("I set API endpoint for patching a resources")
    public String setApiEndpoint() {
        return url + "/posts/1";
    }

    @Step("I send a PATCH request to the endpoint")
    public void sendPatchingAResourcesRequest() {
        SerenityRest.given()
                .get(setApiEndpoint());
    }

    @Step("I receive the resources")
    public void receiveTheResources() {
        restAssuredThat(response -> response.body("'id'", notNullValue()));
        restAssuredThat(response -> response.body("'title'", notNullValue()));
        restAssuredThat(response -> response.body("'body'", notNullValue()));
        restAssuredThat(response -> response.body("'userId'", notNullValue()));
    }
}
