package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class InventoryPage {
    public SelenideElement inventoryList = $(byClassName("inventory_list"));

    public ElementsCollection inventoryItems = $$(By.className("inventory_item"));
    public ElementsCollection inventoryNames = $$(By.className("inventory_item_name"));

    public SelenideElement sortDropdown = $(By.className("product_sort_container"));
    public SelenideElement nameAtoZ = $(By.cssSelector("[value='az']"));




  //public List<SelenideElement> inventoryItems2 = $$(By.className("inventory_item"));


}
