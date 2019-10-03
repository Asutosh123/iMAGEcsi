$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Verify_IO_Lead_Create_Case_Functonlity.feature");
formatter.feature({
  "line": 1,
  "name": "To Verify Case Complete flow from Creation to Completion",
  "description": "",
  "id": "to-verify-case-complete-flow-from-creation-to-completion",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": ": Verify Io lead should be able to create a Case",
  "description": "",
  "id": "to-verify-case-complete-flow-from-creation-to-completion;:-verify-io-lead-should-be-able-to-create-a-case",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@smoke"
    },
    {
      "line": 7,
      "name": "@createCase"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "IO Lead enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" in login page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Verify Dashboard page is display",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click on New Case in Dashboard page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Verify the Create New Case page is display",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "IO lead entres all case details to create New Case",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Click on Save Button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Verify case created success message",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Verify case status should be in \"\u003cdraft\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User clicks on Logout button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "IO Lead enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" in login page",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User clicks on View Details link in card layout in dashboard for the created case",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Verify user should be navigate to the case details page of particular case",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User clicks on Submit button",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Verify error message for registering a case it must have minimum 4 fish eye image is mandatory",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Upload fisheye images",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Click on Submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Verify Evidence Images or Sketches are not uploaded alert message",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User click on Proceed Button in pop up",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Click on Back button",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Verify case status should be in \"\u003cRegistered\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User clicks on View Details link in card layout in dashboard for the created case",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User selects Reporting lead from the dropdown \"\u003creportingLead\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "User clicks on Assign Button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Verify the Case is Assigned To \"\u003creportingLead\u003e\" Reporting Lead",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "User clicks on Logout button",
  "keyword": "When "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "to-verify-case-complete-flow-from-creation-to-completion;:-verify-io-lead-should-be-able-to-create-a-case;",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password",
        "",
        "draft",
        "",
        "Registered",
        "",
        "reportingLead",
        "",
        "ioMember"
      ],
      "line": 38,
      "id": "to-verify-case-complete-flow-from-creation-to-completion;:-verify-io-lead-should-be-able-to-create-a-case;;1"
    },
    {
      "cells": [
        "email462@mailinator.com",
        "",
        "Test@123",
        "",
        "Draft",
        "",
        "Registered",
        "",
        "Srini Reporting Lead",
        "",
        "srinivasiomember@yopmail.com"
      ],
      "line": 39,
      "id": "to-verify-case-complete-flow-from-creation-to-completion;:-verify-io-lead-should-be-able-to-create-a-case;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3958105352,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User navigates to iMAGENEcsi SIT portal login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Verify the title of the imagenecsi application",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_navigates_to_the_SIT_page()"
});
formatter.result({
  "duration": 3329301906,
  "status": "passed"
});
formatter.match({
  "location": "Login.verify_the_title_of_the_imagenecsi_application()"
});
formatter.result({
  "duration": 10809,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": ": Verify Io lead should be able to create a Case",
  "description": "",
  "id": "to-verify-case-complete-flow-from-creation-to-completion;:-verify-io-lead-should-be-able-to-create-a-case;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@smoke"
    },
    {
      "line": 7,
      "name": "@createCase"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "IO Lead enters \"email462@mailinator.com\" and \"Test@123\" in login page",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Verify Dashboard page is display",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click on New Case in Dashboard page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Verify the Create New Case page is display",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "IO lead entres all case details to create New Case",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Click on Save Button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Verify case created success message",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Verify case status should be in \"Draft\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User clicks on Logout button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "IO Lead enters \"email462@mailinator.com\" and \"Test@123\" in login page",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User clicks on View Details link in card layout in dashboard for the created case",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Verify user should be navigate to the case details page of particular case",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User clicks on Submit button",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Verify error message for registering a case it must have minimum 4 fish eye image is mandatory",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Upload fisheye images",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Click on Submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Verify Evidence Images or Sketches are not uploaded alert message",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User click on Proceed Button in pop up",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Click on Back button",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Verify case status should be in \"Registered\"",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User clicks on View Details link in card layout in dashboard for the created case",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User selects Reporting lead from the dropdown \"Srini Reporting Lead\"",
  "matchedColumns": [
    8
  ],
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "User clicks on Assign Button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Verify the Case is Assigned To \"Srini Reporting Lead\" Reporting Lead",
  "matchedColumns": [
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "User clicks on Logout button",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "email462@mailinator.com",
      "offset": 16
    },
    {
      "val": "Test@123",
      "offset": 46
    }
  ],
  "location": "Login.io_lead_enters_and_to_login_page(String,String)"
});
formatter.result({
  "duration": 397762505,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 114237627,
  "status": "passed"
});
formatter.match({
  "location": "Dashboard.verifyDashboardPageIsDisplay()"
});
formatter.result({
  "duration": 1571090001,
  "status": "passed"
});
formatter.match({
  "location": "Dashboard.clickNewCaseButton()"
});
formatter.result({
  "duration": 222645570,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCase.verify_the_Create_New_Case_page_is_displayed()"
});
formatter.result({
  "duration": 110088155,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCase.ioLeadCaseDetails()"
});
formatter.result({
  "duration": 10817554360,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div/label[text()\u003d\u0027Date *\u0027]/parent::div//div/input\"}\n  (Session info: chrome\u003d72.0.3626.109)\n  (Driver info: chromedriver\u003d2.45.615291 (ec3682e3c9061c10f26ea9e5cdcf3c53f3f74387),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027BT-INDIA-COM9\u0027, ip: \u0027172.25.10.72\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.45.615291 (ec3682e3c9061c..., userDataDir: C:\\Users\\Mohit\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:65088}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 72.0.3626.109, webStorageEnabled: true}\nSession ID: 1e4d2afd8e12cf92269683c5acadcc4e\n*** Element info: {Using\u003dxpath, value\u003d//div/label[text()\u003d\u0027Date *\u0027]/parent::div//div/input}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat PageObjects.BrowserBot.getElement(BrowserBot.java:97)\r\n\tat PageObjects.BrowserBot.getAttributeValue(BrowserBot.java:119)\r\n\tat PageObjects.CreateNewCasePage.verifyCurrentDate(CreateNewCasePage.java:56)\r\n\tat PageObjects.CreateNewCasePage.enterIOLeadCaseDetails(CreateNewCasePage.java:105)\r\n\tat step_definitions.CreateNewCase.ioLeadCaseDetails(CreateNewCase.java:35)\r\n\tat ✽.When IO lead entres all case details to create New Case(features/Verify_IO_Lead_Create_Case_Functonlity.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CreateNewCase.user_clicks_on_Save_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateNewCase.verify_case_created_success_Message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Draft",
      "offset": 33
    }
  ],
  "location": "Dashboard.verifyStatus(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.User_clicks_on_logout_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "email462@mailinator.com",
      "offset": 16
    },
    {
      "val": "Test@123",
      "offset": 46
    }
  ],
  "location": "Login.io_lead_enters_and_to_login_page(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Dashboard.clickOnViewDetailsButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CaseDetails.verifyCaseDetails()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CaseDetails.clickOnSubmitButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CaseDetails.verifyFourFishEyeImagesMandatoryErrorMsg()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CaseDetails.uploadFishEyeImages()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CaseDetails.clickOnploadButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CaseDetails.verifyAlertMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CaseDetails.clickOnProcessedButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CaseDetails.selectBackButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Registered",
      "offset": 33
    }
  ],
  "location": "Dashboard.verifyStatus(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Dashboard.clickOnViewDetailsButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Srini Reporting Lead",
      "offset": 47
    }
  ],
  "location": "CaseDetails.selectReportingLead(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CaseDetails.selectAssign()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Srini Reporting Lead",
      "offset": 32
    }
  ],
  "location": "CaseDetails.verifyAssignedReportingLead(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.User_clicks_on_logout_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 522154790,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1567271907,
  "status": "passed"
});
});