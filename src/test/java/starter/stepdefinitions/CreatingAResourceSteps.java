package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.admin.CreatingAResource;

public class CreatingAResourceSteps {
    @Steps
    CreatingAResource creatingAResource;

    @Given("I set API endpoint for creating a resource")
    public void setApiEndpoint() {
        creatingAResource.setApiEndpoint();
    }

    @When("I send a POST request with valid JSON data")
    public void sendCreatingResourceRequest() {
        creatingAResource.sendCreatingResourceRequest();
    }

    @Then("I receive status code 201")
    public void receiveStatusCode201() {
        creatingAResource.receiveStatusCode201();
    }

    @And("the resource is created successfully")
    public void resourceCreatedSuccessfully() {
        creatingAResource.resourceCreatedSuccessfully();
    }

    @When("I send a POST request without JSON data")
    public void sendCreatingResourceRequestWithoutData() {
        creatingAResource.sendCreatingResourceRequestWithoutData();
    }
}
