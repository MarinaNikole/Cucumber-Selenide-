package steps;

import pages.InventoryPage;
import pages.LoginPage;
import pages.SideBarPage;

public class BaseSteps {
    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();
    SideBarPage sideBarPage = new SideBarPage();
}
