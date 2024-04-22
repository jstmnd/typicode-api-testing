package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.admin.DeletingAResource;

public class DeletingAResourceSteps {
    @Steps
    DeletingAResource deletingAResource;

    @Given("I set API endpoint for deleting a resource")
    public void setApiEndpoint() {
        deletingAResource.setApiEndpoint();
    }

    @When("I send a DELETE request with a valid resource ID")
    public void sendDeletingResourceRequest() {
        deletingAResource.sendDeletingResourcesRequest();
    }

    @When("I send a DELETE request with an invalid resource ID")
    public void setDeleteApiEndpoint() {
        deletingAResource.setDeleteApiEndpoint();
    }
}
