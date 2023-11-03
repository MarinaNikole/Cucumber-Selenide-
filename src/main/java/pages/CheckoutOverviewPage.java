package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutOverviewPage {
    public SelenideElement finishButton = $(byId("finish"));

}
