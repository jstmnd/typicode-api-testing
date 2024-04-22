package starter.admin;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class UpdatingAResource {
    private static String url = "https://jsonplaceholder.typicode.com";

    @Step("I set API endpoint for creating a resource")
    public String setApiEndpoint() {
        return url + "/posts/1";
    }

    @Step("I send a PUT request with valid JSON data and ID")
    public void sendUpdatingResourceRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("id", 1);
        requestBody.put("title", "foo");
        requestBody.put("body", "bar");
        requestBody.put("userId", 1);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put(setApiEndpoint());
    }

    @Step("I receive an updated list")
    public void receiveUpdatedList() {
        restAssuredThat(response -> response.body("'id'", equalTo(1)));
        restAssuredThat(response -> response.body("'title'", equalTo("foo")));
        restAssuredThat(response -> response.body("'body'", equalTo("bar")));
        restAssuredThat(response -> response.body("'userId'", equalTo(1)));
    }

    @Step("I send a PUT request without JSON data")
    public void sendUpdatingResourceRequestWithoutData() {
        SerenityRest.given()
                .get(setApiEndpoint());
    }
}
