package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.*;

public class SideBarPage {
    public SelenideElement burgerMenuButton = $(id("react-burger-menu-btn"));
    public SelenideElement logOutLink = $(id("logout_sidebar_link"));

}
