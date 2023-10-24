package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;

public class LoginSteps extends BaseSteps{

    @Given("^I open Login page$")
    public void iOpenLoginPage() {
        open("https://www.saucedemo.com/");
    }

    @When("^I input \"([^\"]*)\" to username field$")
    public void iInputToUsernameField(String usernameValue)  {
        loginPage.usernameInputField.setValue(usernameValue);
    }


    @And("^input \"([^\"]*)\" to password field$")
    public void inputToPasswordField(String passwordValue)  {
        loginPage.passwordInputField.setValue(passwordValue);
    }

    @When("^I push the Login button$")
    public void iPushTheLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("^I see error message that user has been locked out$")
    public void iSeeErrorMessageThatUserHasBeenLockedOut() {
        loginPage.errorMessage.shouldBe(visible).shouldHave(text("Epic sadface: Sorry, this user has been locked out."));
    }


//    @Then("^I see the message that password not valid$")
//    public void iSeeTheMessageThatPasswordNotValid() {
//        loginPage.errorMessage.shouldBe(visible).shouldHave(text("Epic sadface: Username and password do not match any user in this service"));
//    }

    @Then("^I see the message \"([^\"]*)\" is displayed$")
    public void iSeeTheMessageThatIsDisplayed(String expectedMessageText)  {
        loginPage.errorMessage.shouldBe(visible).shouldHave(text(expectedMessageText));
    }

    @Then("^I`m in login Page$")
    public void iMInLoginPage() {
        loginPage.loginButton.shouldBe(visible);
    }
}
