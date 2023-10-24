package steps;

import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.*;

public class SideBarSteps extends BaseSteps{
    @When("^I push burger menu$")
    public void iFollowBurgerMenuLink() {
        sideBarPage.burgerMenuButton.shouldBe(visible).click();
    }

    @When("^I follow logout link$")
    public void iFollowLogoutLink() {
        sideBarPage.logOutLink.shouldBe(visible).click();
    }

}
