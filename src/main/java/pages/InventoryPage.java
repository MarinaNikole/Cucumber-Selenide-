package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class InventoryPage {
    public SelenideElement inventoryList = $(byClassName("inventory_list"));

    public ElementsCollection inventoryItems = $$(byClassName("inventory_item"));
    public ElementsCollection inventoryNames = $$(byClassName("inventory_item_name"));
    public SelenideElement sortDropdown = $(byClassName("product_sort_container"));
    public SelenideElement nameAtoZ = $(byCssSelector("[value='az']"));
    public SelenideElement nameZtoA = $(By.cssSelector("[value='za']"));
    public SelenideElement priceLowToHigh = $(By.cssSelector("[value='lohi']"));
    public SelenideElement priceHighToLow = $(By.cssSelector("[value='hilo']"));
    public ElementsCollection inventoryItemPrice = $$(By.cssSelector("[class='inventory_item_price']"));

    public SelenideElement backPackAddToCartButton = $(byId("add-to-cart-sauce-labs-backpack"));
    public SelenideElement bikeLightAddToCartButton = $(byId("add-to-cart-sauce-labs-bike-light"));





   // public List<SelenideElement> inventoryItemPrice2 = $$(By.cssSelector("[class='inventory_item_price']"));

  //public List<SelenideElement> inventoryItems2 = $$(By.className("inventory_item"));


}
