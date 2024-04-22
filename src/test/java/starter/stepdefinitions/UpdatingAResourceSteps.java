package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.admin.UpdatingAResource;

public class UpdatingAResourceSteps {
    @Steps
    UpdatingAResource updatingAResource;

    @Given("I set API endpoint for updating a resource")
    public void setApiEndpoint() {
        updatingAResource.setApiEndpoint();
    }

    @When("I send a PUT request with valid JSON data and ID")
    public void sendUpdatingResourceRequest() {
        updatingAResource.sendUpdatingResourceRequest();
    }

    @And("I receive an updated list")
    public void receiveUpdatedList() {
        updatingAResource.receiveUpdatedList();
    }

    @When("I send a PUT request without JSON data")
    public void sendUpdatingResourceRequestWithoutData() {
        updatingAResource.sendUpdatingResourceRequestWithoutData();
    }
}
