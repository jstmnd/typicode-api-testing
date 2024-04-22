package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.admin.ListingAllResources;

public class ListingAllResourcesSteps {
    @Steps
    ListingAllResources listingAllResources;

    @Given("I set API endpoint for listing all resources")
    public void setApiEndpoint() {
        listingAllResources.setApiEndpoint();
    }

    @When("I send a GET request to the endpoint")
    public void sendListingAllResourcesRequest() {
        listingAllResources.sendListingAllResourcesRequest();
    }

    @Then("I receive status code 200")
    public void receiveStatusCode200() {
        listingAllResources.receiveStatusCode200();
    }

    @And("I receive a list of resources")
    public void receiveListOfResources() {
        listingAllResources.receiveListOfResources();
    }

    @When("I send a GET request with incorrect ID")
    public void sendListingAllResourceIncorrectIdRequest() {
        listingAllResources.sendListingAllResourceIncorrectIdRequest();
    }

    @Then("I receive a error message")
    public void receiveErrorMessage() {
        listingAllResources.receiveErrorMessage();
    }
}
