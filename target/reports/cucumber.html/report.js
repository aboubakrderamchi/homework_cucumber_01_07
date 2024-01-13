$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/LoginWithDataFromMySqlDatabase.feature");
formatter.feature({
  "name": "Codefios page login functionality validation and adding account validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AddAccount"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User should be able to add an account",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User clicks on list account button",
  "keyword": "When "
});
formatter.step({
  "name": "User should be able to land on list account page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on add account button",
  "keyword": "When "
});
formatter.step({
  "name": "User should be able to land on the add account form",
  "keyword": "Then "
});
formatter.step({
  "name": "User enters account accountName as \"\u003caccoutnName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters account description as \"\u003cdescription\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters account initialBalance as \"\u003cinitialBalance\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "User enters account accountNumber as \"\u003caccoutnNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters account contactPerson as \"\u003ccontactPerson\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should be able to click on save button",
  "keyword": "When "
});
formatter.step({
  "name": "User should be able to see the success alert pop-pup",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able to check if account is successfuly created",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "accoutnName",
        "description",
        "initialBalance",
        "accoutnNumber",
        "contactPerson"
      ]
    },
    {
      "cells": [
        "Zoubir",
        "lorem",
        "100.00",
        "5479",
        "Zoubir_contact"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the codefios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.StepDefinition.user_is_on_the_codefios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"username\" from mysql database",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enters_from_mysql_database(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"password\" from mysql database",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enters_from_mysql_database(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.StepDefinition.user_clicks_on_the_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_be_able_to_land_on_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to add an account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddAccount"
    }
  ]
});
formatter.step({
  "name": "User clicks on list account button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_clicks_on_list_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to land on list account page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_be_able_to_land_on_list_account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on add account button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_clicks_on_add_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to land on the add account form",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_be_able_to_land_on_the_add_account_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters account accountName as \"Zoubir\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enters_account_accountName_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters account description as \"lorem\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enters_account_description_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters account initialBalance as \"100.00\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_enters_account_initialBalance_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters account accountNumber as \"5479\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enters_account_accountNumber_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters account contactPerson as \"Zoubir_contact\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enters_account_contactPerson_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to click on save button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_be_able_to_click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to see the success alert pop-pup",
  "keyword": "And "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_be_able_to_see_the_success_alert_pop_pup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to check if account is successfuly created",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});