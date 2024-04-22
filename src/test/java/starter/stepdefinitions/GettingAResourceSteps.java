package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.admin.GettingAResource;

public class GettingAResourceSteps {
    @Steps
    GettingAResource gettingAResource;

    @Given("I set API endpoint for getting a resource")
    public void setApiEndpoint() {
        gettingAResource.setApiEndpoint();
    }

    @When("I send a GET request with a valid resource ID")
    public void sendGettingResourceRequest() {
        gettingAResource.sendGettingResourceRequest();
    }

    @And("I receive details of the resource")
    public void resourceCreatedSuccessfully() {
        gettingAResource.resourceCreatedSuccessfully();
    }

    @Given("I set invalid API endpoint for getting a resource")
    public void setInvalidApiEndpoint() {
        gettingAResource.setInvalidApiEndpoint();
    }

    @When("I send a GET request with a non-existent resource ID")
    public void sendInvalidGettingResourceRequest() {
        gettingAResource.sendInvalidGettingResourceRequest();
    }
}
