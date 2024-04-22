package starter.admin;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeletingAResource {
    private static String url = "https://jsonplaceholder.typicode.com";

    @Step("I set API endpoint for creating a resource")
    public String setApiEndpoint() {
        return url + "/posts/1";
    }

    @Step("I send a DELETE request with a valid resource ID")
    public void sendDeletingResourcesRequest() {
        SerenityRest.given()
                .delete(setDeleteApiEndpoint());
    }

    @Step("I send a DELETE request with an invalid resource ID")
    public String setDeleteApiEndpoint() {
        return url + "/posts/9999";
    }
}
