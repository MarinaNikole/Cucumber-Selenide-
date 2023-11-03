package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutYourInformationPage {
    public SelenideElement firstNameInput = $(byId("first-name"));
    public SelenideElement lastNameInput = $(byId("last-name"));
    public SelenideElement postalCodeInput = $(byId("postal-code"));
    public SelenideElement  continueButton = $(byId("continue"));







}
