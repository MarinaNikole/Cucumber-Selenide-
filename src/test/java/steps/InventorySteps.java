package steps;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.InventoryPage;

import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
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

    @When("^I follow sort link$")
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
        Assert.assertEquals(actualNames, expectedNames);
    }
}
