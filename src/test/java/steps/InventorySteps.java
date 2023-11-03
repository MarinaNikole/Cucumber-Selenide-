package steps;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.InventoryPage;

import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static java.lang.Double.parseDouble;
import static java.util.Collections.reverseOrder;
import static java.util.Collections.sort;

public class InventorySteps extends BaseSteps{

        @Then("^I am on the page Inventory$")
        public void iAmOnThePageInventory() {
            inventoryPage.inventoryList.shouldBe(visible, Duration.ofSeconds(10));
        }

    @Then("^(\\d+) inventory items are displayed$")
    public void inventoryItemsAreDisplayed(int expectedQuantity) {
//            for (SelenideElement item : inventoryPage.inventoryItems){
//                item.shouldBe(visible);
//            }
          inventoryPage.inventoryItems.filter(visible).shouldHave(size(expectedQuantity));
    }

    @When("^I push sort dropdown button$")
    public void iFollowSortLink() {
            inventoryPage.sortDropdown.shouldBe(visible).click();
    }

    @And("^I select Sorting by name A-Z$")
    public void selectSortingByNameAZ() {
            inventoryPage.nameAtoZ.shouldBe(visible).click();
    }

    @Then("^I see sorted inventory items$")
    public void iSeeSortedInventoryItems() {
        List<String> actualNames = new ArrayList<>();
          for(SelenideElement name : inventoryPage.inventoryNames){
              actualNames.add(name.getText());
          }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames);

         inventoryPage.inventoryNames.shouldHave(exactTexts(expectedNames));
         //  inventoryPage.inventoryNames.shouldBe(exactTexts(expectedNames));
      // Assert.assertEquals("Items have NOT sorted in Z-A order", actualNames, expectedNames);
    }

    @And("^I select Sorting by name Z-A$")
    public void iSelectSortingByNameZA() {
            inventoryPage.nameZtoA.shouldBe(visible).click();
    }

    @Then("^I see sorted inventory items in Z-A order$")
    public void iSeeSortedInventoryItemsInZAOrder() {
        List<String> actualNames = new ArrayList<>();
        for(SelenideElement name : inventoryPage.inventoryNames){
            actualNames.add(name.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        expectedNames.sort(reverseOrder());
        Assert.assertEquals("Items have NOT sorted alphabetically", actualNames, expectedNames);
    }

    @And("^I select Sorting by price from low to high$")
    public void iSelectSortingByPriceFromLowToHigh() {
            inventoryPage.priceLowToHigh.shouldBe(visible).click();
    }


    @Then("^I see sorted by price from low to high inventory items$")
    public void iSeeSortedByPriceFromLowToHighInventoryItems() {
        List<Double> actualPrice = new ArrayList<>();
        for(WebElement price : inventoryPage.inventoryItemPrice){
            actualPrice.add(parseDouble(price.getText().substring(1)));
        }
        List<Double> expectedPrice = new ArrayList<>(actualPrice);
        sort(expectedPrice);
        Assert.assertEquals("Items have NOT sorted by price from low to high", actualPrice, expectedPrice);
    }

    @And("^I select Sorting by price from high to low$")
    public void iSelectSortingByPriceFromHighToLow() {
            inventoryPage.priceHighToLow.shouldBe(visible).click();
    }


    @Then("^I see sorted by price from high to low inventory items$")
    public void iSeeSortedByPriceFromHighToLowInventoryItems() {
        List<Double> actualPrices = new ArrayList<>();
        for(WebElement price : inventoryPage.inventoryItemPrice){
            actualPrices.add(parseDouble(price.getText().substring(1)));
        }
        List<Double> expectedPrices = new ArrayList<>(actualPrices);
        expectedPrices.sort(reverseOrder());
        Assert.assertEquals("Items have NOT sorted by price from high to low", actualPrices, expectedPrices);
    }

    @When("^I push Backpack Add to cart button$")
    public void iPushBackpackAddToCartButton() {
            inventoryPage.backPackAddToCartButton.shouldBe(visible).click();
    }


    @And("^I push Bike Light Add to cart button$")
    public void iPushBikeLightAddToCartButton() {
            inventoryPage.bikeLightAddToCartButton.shouldBe(visible).click();
    }

}
