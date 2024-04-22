package starter.admin;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class CreatingAResource {
    private static String url = "https://jsonplaceholder.typicode.com";

    @Step("I set API endpoint for creating a resource")
    public String setApiEndpoint() {
        return url + "/posts";
    }

    @Step("I send a POST request with valid JSON data")
    public void sendCreatingResourceRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("title", "foo");
        requestBody.put("body", "bar");
        requestBody.put("userID", 1);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setApiEndpoint());
    }

    @Step("I receive status code 201")
    public void receiveStatusCode201() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("the resource is created successfully")
    public void resourceCreatedSuccessfully() {
        restAssuredThat(response -> response.body("'id'", notNullValue()));
        restAssuredThat(response -> response.body("'title'", equalTo("foo")));
        restAssuredThat(response -> response.body("'body'", equalTo("bar")));
        restAssuredThat(response -> response.body("'userID'", equalTo(1)));
    }

    @Step("I send a POST request without JSON data")
    public void sendCreatingResourceRequestWithoutData() {
        SerenityRest.given()
                .get(setApiEndpoint());
    }
}
