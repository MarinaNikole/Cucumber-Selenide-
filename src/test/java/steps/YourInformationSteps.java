package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.*;

public class YourInformationSteps extends BaseSteps{
    @Then("^I am in Your Information Page$")
    public void iAmInYourInformationPage() {
        yourInformationPage.continueButton.shouldBe(visible);
    }

    @When("^I input \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iInputMyAnd(String name, String lastName, String zip)  {
        yourInformationPage.firstNameInput.shouldBe(visible).setValue(name);
        yourInformationPage.lastNameInput.shouldBe(visible).setValue(lastName);
        yourInformationPage.postalCodeInput.shouldBe(visible).setValue(zip);
    }

    @And("^I push the Continue Button$")
    public void iPushTheContinueButton() {
        yourInformationPage.continueButton.click();
    }
}
