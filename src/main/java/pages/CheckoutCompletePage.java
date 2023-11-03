package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutCompletePage {
   public SelenideElement CongratMessage = $(By.cssSelector("[class=\"complete-header\"]")) ;
}
