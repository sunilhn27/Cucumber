$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/Selenium The Grand Final/BDD/src/Features/login1.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "",
  "description": "\tlogin with valid Credintials ",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "lauch the browser",
  "keyword": "Given "
});
formatter.step({
  "name": "user should be in loginpage",
  "keyword": "When "
});
formatter.step({
  "name": "Enter username \"\u003cusername\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter password \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Click on login button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "sunil",
        "sunil123"
      ]
    },
    {
      "cells": [
        "sunil2",
        "sunil321"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "\tlogin with valid Credintials ",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "lauch the browser",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should be in loginpage",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Enter username \"sunil\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Enter password \"sunil123\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click on login button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "",
  "description": "\tlogin with valid Credintials ",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "lauch the browser",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user should be in loginpage",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Enter username \"sunil2\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Enter password \"sunil321\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click on login button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});