package steps;

import com.github.javafaker.Faker;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.SmartBearLoginPage;
import pages.SmartBearOrderPage;
import pages.SmartBearWebOrdersPage;
import utilities.Driver;
import utilities.DropdownHandler;

import java.util.Scanner;

public class SmartBearSteps {

    WebDriver driver;
    SmartBearLoginPage smartBearLoginPage;
    SmartBearOrderPage smartBearOrderPage;
    SmartBearWebOrdersPage smartBearWebOrdersPage;
    Faker faker;
    String customerName;
    String street;
    String city;
    String state;
    String zipcode;
    String paymentType;
    String cardNo;
    String expDate;
    int numberOfOrders = 8;

    @Before
    public void setup() {
        driver = Driver.getDriver();
        faker = new Faker();
        customerName = faker.name().fullName();
        street = faker.address().streetAddress();
        city = faker.address().city();
        state = faker.address().state();
        zipcode = faker.address().zipCode().substring(0,5);
        paymentType = "Visa";
        cardNo = faker.business().creditCardNumber().replaceAll("-","");
        expDate = "12/27";
        smartBearLoginPage = new SmartBearLoginPage();
        smartBearOrderPage = new SmartBearOrderPage();
        smartBearWebOrdersPage = new SmartBearWebOrdersPage();
    }

    @Given("user is on {string}")
    public void userIsOn(String url) {
        driver.get(url);
    }

    @When("user enters username as {string}")
    public void userEntersUsernameAs(String username) {
        smartBearLoginPage.usernameInputBox.sendKeys(username);

    }

    @And("user enters password as {string}")
    public void userEntersPasswordAs(String password) {
        smartBearLoginPage.passwordInputBox.sendKeys(password);
    }

    @And("user clicks on Login button")
    public void userClicksOnLoginButton() {
        smartBearLoginPage.loginButton.click();
    }

    @Then("user should see {string} Message")
    public void userShouldSeeMessage(String text) {
        Assert.assertEquals(text, smartBearLoginPage.errorMessage.getText());
    }

    @Then("user should be routed to {string}")
    public void userShouldBeRoutedTo(String url) {
        Assert.assertEquals(url, driver.getCurrentUrl());
    }

    @And("validate below menu items are displayed")
    public void validateBelowMenuItemsAreDisplayed(DataTable dataTable) {
        for (int i = 0; i < dataTable.asList().size(); i++) {
            Assert.assertTrue(smartBearWebOrdersPage.webOrdersMenuItems.get(i).isDisplayed());
        }
    }

    @When("user clicks on {string} link")
    public void userClicksOnLink(String link) {
        WebElement linkToBeClicked = null;
        switch (link) {
            case "Check All":
                //linkToBeClicked = smartBearWebOrdersPage.checkUncheckLinks.get(0).click();
                smartBearWebOrdersPage.checkUncheckLinks.get(0).click();
                break;
            case "Uncheck All":
                //linkToBeClicked = smartBearWebOrdersPage.checkUncheckLinks.get(1).click();
                smartBearWebOrdersPage.checkUncheckLinks.get(1).click();
                break;
            case "Delete Selected":
                //linkToBeClicked = smartBearWebOrdersPage.deleteSelectedButton.click();
                smartBearWebOrdersPage.deleteSelectedButton.click();
                break;
            case "Process":
                smartBearWebOrdersPage.processButton.click();
                break;
            default:
                throw new NotFoundException("Link text is not properly defined in the feature file");
        }
    }

    @Then("all rows should be checked")
    public void allRowsShouldBeChecked() {
        for (WebElement checkBox : smartBearWebOrdersPage.checkUncheckLinks) {
            Assert.assertTrue(smartBearWebOrdersPage.checkUncheckLinks.get(0).isEnabled());
        }
    }

    @Then("all rows should be unchecked")
    public void allRowsShouldBeUnchecked() {
        Assert.assertTrue(smartBearWebOrdersPage.checkUncheckLinks.get(1).isEnabled());
    }

    @When("user clicks on {string} menu item")
    public void userClicksOnMenuItem(String menuText) {
        smartBearWebOrdersPage.clickOnMenuItem(smartBearWebOrdersPage.webOrdersMenuItems,menuText);
    }

    @And("user selects {string} as product")
    public void userSelectsAsProduct(String product) {
        DropdownHandler.selectOptionByVisibleText(smartBearOrderPage.listOfProduct, product);
    }

    @And("user enters {int} as quantity")
    public void userEntersAsQuantity(int quantity) {
        smartBearOrderPage.quantityInputBox.sendKeys("" + quantity);
    }

    @And("user enters all address information")
    public void userEntersAllAddressInformation() {
        smartBearOrderPage.customerNameInputBox.sendKeys(customerName);
        smartBearOrderPage.streetInputBox.sendKeys(street);
        smartBearOrderPage.cityInputBox.sendKeys(city);
        smartBearOrderPage.stateInputBox.sendKeys(state);
        smartBearOrderPage.zipInputBox.sendKeys(zipcode);
    }

    @And("user enters all payment information")
    public void userEntersAllPaymentInformation() {
        smartBearOrderPage.selectPaymentType(paymentType);
        smartBearOrderPage.cardNumberInputBox.sendKeys(cardNo);
        smartBearOrderPage.expiryDateInputBox.sendKeys(expDate);
    }

    @Then("user should see their order displayed in the List of All Orders table")
    public void userShouldSeeTheirOrderDisplayedInTheTable(String string) {
        int newTotal = smartBearWebOrdersPage.checkboxes.size();
        Assert.assertTrue((numberOfOrders + 1) == newTotal);
    }

    @And("validate all information entered displayed correct with the order")
    public void validateAllInformationEnteredDisplayedCorrectWithTheOrder(DataTable dataTable) {
        for (int i = 1; i < smartBearWebOrdersPage.checkboxes.size(); i++) {
            Assert.assertEquals(dataTable.asList().get(i), smartBearWebOrdersPage.checkboxes.get(i).getText());
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
