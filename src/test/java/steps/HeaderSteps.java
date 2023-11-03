package steps;

import cucumber.api.java.en.And;

import static com.codeborne.selenide.Condition.*;

public class HeaderSteps extends BaseSteps {
    @And("^I press Cart icon$")
    public void iPressCartIcon() {
        headerPage.shoppingCartIcon.shouldBe(visible).click();
    }
}
