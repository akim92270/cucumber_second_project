package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.SmartBearHomePage;
import pages.SmartBearOrderPage;
import pages.SmartBearWebOrdersPage;
import utilities.Driver;
import utilities.DropdownHandler;

import java.util.List;
import java.util.NoSuchElementException;

public class SmartBearSteps {

    WebDriver driver;
    SmartBearHomePage smartBearHomePage;
    SmartBearOrderPage smartBearOrderPage;
    SmartBearWebOrdersPage smartBearWebOrdersPage;

    @Before
    public void setup() {
        driver = Driver.getDriver();
        smartBearHomePage = new SmartBearHomePage(driver);
        smartBearOrderPage = new SmartBearOrderPage(driver);
        smartBearWebOrdersPage = new SmartBearWebOrdersPage(driver);
    }

    @Given("user is on {string}")
    public void userIsOn(String url) {
        driver.get(url);
    }

    @When("user enters username as {string}")
    public void userEntersUsernameAs(String username) {
        smartBearHomePage.usernameInputBox.sendKeys(username);

    }

    @And("user enters password as {string}")
    public void userEntersPasswordAs(String password) {
        smartBearHomePage.passwordInputBox.sendKeys(password);
    }

    @And("user clicks on Login button")
    public void userClicksOnLoginButton() {
        smartBearHomePage.loginButton.click();
    }

    @Then("user should see {string} Message")
    public void userShouldSeeMessage(String text) {
        Assert.assertEquals(text, smartBearHomePage.errorMessage.getText());
    }

    @Then("user should be routed to {string}")
    public void userShouldBeRoutedTo(String link) {
        Assert.assertEquals(link, driver.getCurrentUrl());
    }

    @And("validate below menu items are displayed")
    public void validateBelowMenuItemsAreDisplayed(DataTable dataTable) {
        for (int i = 0; i < dataTable.asList().size(); i++) {
            Assert.assertTrue(smartBearWebOrdersPage.orderMenuLinks.get(i).isDisplayed());
        }
    }

    @When("user clicks on {string} button")
    public void userClicksOnButton(String checkOrUncheck) {
        switch (checkOrUncheck) {
            case "Check All":
                smartBearWebOrdersPage.checkUncheckLinks.get(0).click();
                break;
            case "Uncheck All":
                smartBearWebOrdersPage.checkUncheckLinks.get(1).click();
                break;
            case "Delete Selected":
                smartBearWebOrdersPage.deleteSelectedButton.click();
                break;
            case "Process":
                smartBearWebOrdersPage.processButton.click();
        }
    }

    @Then("all rows should be checked")
    public void allRowsShouldBeChecked() {
        Assert.assertTrue(smartBearWebOrdersPage.checkUncheckLinks.get(0).isEnabled());
    }

    @Then("all rows should be unchecked")
    public void allRowsShouldBeUnchecked() {
        Assert.assertTrue(smartBearWebOrdersPage.checkUncheckLinks.get(1).isEnabled());
    }

    @When("user clicks on {string} menu item")
    public void userClicksOnMenuItem(String order) {
        smartBearWebOrdersPage.clickOnMenuLink(order);
    }

    @And("user selects {string} as product")
    public void userSelectsAsProduct(String product) {
        DropdownHandler.selectOptionByVisibleText(smartBearOrderPage.listOfProduct, product);
    }

    @And("user enters {int} as quantity")
    public void userEntersAsQuantity(int n) {
        smartBearOrderPage.quantity.sendKeys(String.valueOf(n));
    }

    @And("user enters all address information")
    public void userEntersAllAddressInformation() {
        smartBearOrderPage.listOfAddressInfoInputBox.get(0).sendKeys("Barney Lemon");
        smartBearOrderPage.listOfAddressInfoInputBox.get(1).sendKeys("123 Main St");
        smartBearOrderPage.listOfAddressInfoInputBox.get(2).sendKeys("Long Grove");
        smartBearOrderPage.listOfAddressInfoInputBox.get(3).sendKeys("IL");
        smartBearOrderPage.listOfAddressInfoInputBox.get(4).sendKeys("60047");
    }

    @And("user enters all payment information")
    public void userEntersAllPaymentInformation() {
        smartBearOrderPage.listOfCardPayment.get(0).click();
        smartBearOrderPage.cardNumberInputBox.sendKeys("000000000");
        smartBearOrderPage.expiryDateInputBox.sendKeys("12/29");
    }

    @Then("user should see their order displayed in the {string} table")
    public void userShouldSeeTheirOrderDisplayedInTheTable(String string) {
        for (int i = 1; i < smartBearWebOrdersPage.firstRowCheck.size() - 1; i++) {
            Assert.assertTrue(smartBearWebOrdersPage.firstRowCheck.get(i).isDisplayed());
        }
    }

    @And("validate all information entered displayed correct with the order")
    public void validateAllInformationEnteredDisplayedCorrectWithTheOrder(DataTable dataTable) {
        for (int i = 1; i < smartBearWebOrdersPage.firstRowCheck.size(); i++) {
            Assert.assertEquals(dataTable.asList().get(i), smartBearWebOrdersPage.firstRowCheck.get(i).getText());
        }
    }

    @Then("validate all orders are deleted from the {string}")
    public void validateAllOrdersAreDeletedFromThe(String validateOrders) {
        Assert.assertNotNull(validateOrders);
    }

    @And("validate user sees {string} Message")
    public void validateUserSeesMessage(String message) {
        Assert.assertEquals(message, smartBearWebOrdersPage.orderMessageText.getText().trim());
    }
}
