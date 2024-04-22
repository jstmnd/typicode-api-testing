package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.admin.PatchingAResource;

public class PatchingAResourceSteps {
    @Steps
    PatchingAResource patchingAResource;

    @Given("I set API endpoint for patching a resources")
    public void setApiEndpoint() {
        patchingAResource.setApiEndpoint();
    }

    @When("I send a PATCH request to the endpoint")
    public void sendPathcingAResourcesRequest() {
        patchingAResource.sendPatchingAResourcesRequest();
    }

    @And("I receive the resources")
    public void receiveTheResources() {
        patchingAResource.receiveTheResources();
    }
}
