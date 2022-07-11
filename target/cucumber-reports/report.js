$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/smartbear.feature");
formatter.feature({
  "name": "Smart Bear Website",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SmartBearSteps.userIsOn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate valid login attempt",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user enters username as \"Tester\"",
  "keyword": "When "
});
formatter.match({
  "location": "SmartBearSteps.userEntersUsernameAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password as \"test\"",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userEntersPasswordAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userClicksOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be routed to \"http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SmartBearSteps.userShouldBeRoutedTo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SmartBearSteps.userIsOn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate \"Web Orders\" menu items",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user enters username as \"Tester\"",
  "keyword": "When "
});
formatter.match({
  "location": "SmartBearSteps.userEntersUsernameAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password as \"test\"",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userEntersPasswordAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userClicksOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be routed to \"http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SmartBearSteps.userShouldBeRoutedTo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate below menu items are displayed",
  "rows": [
    {
      "cells": [
        "View all orders",
        "View all products",
        "Order"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.validateBelowMenuItemsAreDisplayed(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SmartBearSteps.userIsOn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate \"Check All\" and \"Uncheck All\" links",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user enters username as \"Tester\"",
  "keyword": "When "
});
formatter.match({
  "location": "SmartBearSteps.userEntersUsernameAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password as \"test\"",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userEntersPasswordAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userClicksOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be routed to \"http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SmartBearSteps.userShouldBeRoutedTo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Check All\" button",
  "keyword": "When "
});
formatter.match({
  "location": "SmartBearSteps.userClicksOnButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "all rows should be checked",
  "keyword": "Then "
});
formatter.match({
  "location": "SmartBearSteps.allRowsShouldBeChecked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Uncheck All\" button",
  "keyword": "When "
});
formatter.match({
  "location": "SmartBearSteps.userClicksOnButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "all rows should be unchecked",
  "keyword": "Then "
});
formatter.match({
  "location": "SmartBearSteps.allRowsShouldBeUnchecked()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SmartBearSteps.userIsOn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate adding new order",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user enters username as \"Tester\"",
  "keyword": "When "
});
formatter.match({
  "location": "SmartBearSteps.userEntersUsernameAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password as \"test\"",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userEntersPasswordAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userClicksOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be routed to \"http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SmartBearSteps.userShouldBeRoutedTo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Order\" menu item",
  "keyword": "When "
});
formatter.match({
  "location": "SmartBearSteps.userClicksOnMenuItem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects \"FamilyAlbum\" as product",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userSelectsAsProduct(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters 2 as quantity",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userEntersAsQuantity(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters all address information",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userEntersAllAddressInformation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters all payment information",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userEntersAllPaymentInformation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Process\" button",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userClicksOnButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"View all orders\" menu item",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userClicksOnMenuItem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see their order displayed in the \"List of All Orders\" table",
  "keyword": "Then "
});
formatter.match({
  "location": "SmartBearSteps.userShouldSeeTheirOrderDisplayedInTheTable(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate all information entered displayed correct with the order",
  "rows": [
    {
      "cells": [
        "",
        "Barney Lemon",
        "FamilyAlbum",
        "2",
        "07/10/2022",
        "123 Main St",
        "Long Grove, IL",
        "US",
        "60047",
        "Visa",
        "000000000",
        "12/29",
        ""
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.validateAllInformationEnteredDisplayedCorrectWithTheOrder(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SmartBearSteps.userIsOn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate \"Delete Selected\" button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user enters username as \"Tester\"",
  "keyword": "When "
});
formatter.match({
  "location": "SmartBearSteps.userEntersUsernameAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password as \"test\"",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userEntersPasswordAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userClicksOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be routed to \"http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SmartBearSteps.userShouldBeRoutedTo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Check All\" button",
  "keyword": "When "
});
formatter.match({
  "location": "SmartBearSteps.userClicksOnButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Delete Selected\" button",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.userClicksOnButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate all orders are deleted from the \"List of All Orders\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SmartBearSteps.validateAllOrdersAreDeletedFromThe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate user sees \"List of orders is empty. In order to add new order use this link.\" Message",
  "keyword": "And "
});
formatter.match({
  "location": "SmartBearSteps.validateUserSeesMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});