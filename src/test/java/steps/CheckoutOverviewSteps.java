package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckoutOverviewSteps extends BaseSteps{
    @Then("^I am in Checkout Page$")
    public void iAmInCheckoutPage() {
        checkoutOverviewPage.finishButton.shouldBe(Condition.visible);
    }

    @When("^I push Finish Button$")
    public void iPushFinishButton() {
        checkoutOverviewPage.finishButton.click();
    }
}
