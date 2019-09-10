$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ContactsPage.feature");
formatter.feature({
  "line": 2,
  "name": "CRMPRO ContactsPage future",
  "description": "",
  "id": "crmpro-contactspage-future",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ContactsPageFuture"
    }
  ]
});
formatter.before({
  "duration": 34173954400,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User able to click on ContactsPage",
  "description": "",
  "id": "crmpro-contactspage-future;user-able-to-click-on-contactspage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user will login into loginPage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user will landing to HomePage",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user will click on Contacts",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "varify user is in ContactsPage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition_contactsPage.user_will_login_into_loginPage()"
});
formatter.result({
  "duration": 14417753100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_contactsPage.user_will_landing_to_HomePage()"
});
formatter.result({
  "duration": 74864400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_contactsPage.user_will_click_on_Contacts()"
});
formatter.result({
  "duration": 2540224400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_contactsPage.varify_user_is_in_ContactsPage()"
});
formatter.result({
  "duration": 13865900,
  "status": "passed"
});
formatter.after({
  "duration": 169600,
  "status": "passed"
});
});