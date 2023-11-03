package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.Then;

public class CheckoutCompleteSteps extends BaseSteps{
    @Then("^I am in Complete Page$")
    public void iAmInCompletePage() {
        checkoutCompletePage.CongratMessage.shouldHave(Condition.text("Thank you for your order!"));
    }
}
