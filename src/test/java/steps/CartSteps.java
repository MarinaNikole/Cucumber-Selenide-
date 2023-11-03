package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartSteps extends BaseSteps{
    @Then("^I am in Cart Page$")
    public void iAmInCartPage() {
        cartPage.checkOutButton.shouldBe(Condition.visible);
    }

    @When("^I push Checkout Button$")
    public void iPushCheckoutButton() {
        cartPage.checkOutButton.click();
    }

}
