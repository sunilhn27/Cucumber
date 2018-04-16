$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/Selenium The Grand Final/BDD/src/Testingwithmap/regwithmap.feature");
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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Enter username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click on login",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click on Recruitment button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click on Add button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "enter firstname middlename lastname email phno",
  "rows": [
    {
      "cells": [
        "FirstName",
        "Middlename",
        "lastname",
        "Emailid",
        "Phno"
      ]
    },
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
formatter.match({});
formatter.result({
  "status": "undefined"
});
});