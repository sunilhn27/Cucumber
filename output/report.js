$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/Selenium The Grand Final/BDD/src/com/testing/rec.feature");
formatter.feature({
  "name": "Testing Add in recruitment",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Testing Recruitment feature",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User should be login",
  "keyword": "Given "
});
formatter.match({
  "location": "Recruitmentsteps.user_should_be_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter username and password",
  "rows": [
    {
      "cells": [
        "Admin",
        "admin"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Recruitmentsteps.enter_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "Then "
});
formatter.match({
  "location": "Recruitmentsteps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Recruitment button",
  "keyword": "Then "
});
formatter.match({
  "location": "Recruitmentsteps.click_on_Recruitment_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add button",
  "keyword": "Then "
});
formatter.match({
  "location": "Recruitmentsteps.click_on_Add_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter firstname middlename lastname email phno",
  "rows": [
    {
      "cells": [
        "sunil",
        "shetty",
        "john",
        "sunilh.27@gmail.com",
        "7411161889"
      ]
    },
    {
      "cells": [
        "sagar",
        "john",
        "mary",
        "sagar.27@gmail.com",
        "7464646889"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Recruitmentsteps.enter_firstname_middlename_lastname_email_phno(DataTable)"
});
formatter.result({
  "status": "passed"
});
});