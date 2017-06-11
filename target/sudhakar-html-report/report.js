$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("register.feature");
formatter.feature({
  "id": "as-a-user-i-need-to-order-pizza",
  "description": "as a customer\r\ni want order pizza so that\r\ni can order online",
  "name": "as a user i need to order pizza",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 10169878049,
  "status": "passed"
});
formatter.scenario({
  "id": "as-a-user-i-need-to-order-pizza;create-new-registration",
  "description": "",
  "name": "create new registration",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario"
});
formatter.step({
  "name": "I am navigative to dominos web page",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "i am click on register and enter fields",
  "keyword": "And ",
  "line": 8
});
formatter.step({
  "name": "I contacting by email or SMS",
  "keyword": "Then ",
  "line": 9
});
formatter.step({
  "name": "i conform the account and logout",
  "keyword": "And ",
  "line": 10
});
formatter.match({
  "location": "StepDef.i_am_navigative_to_dominos_web_page()"
});
formatter.result({
  "duration": 1593820216,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_am_click_on_register_and_enter_fields()"
});
formatter.result({
  "duration": 915963771,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_contacting_by_email_or_SMS()"
});
formatter.result({
  "duration": 6274772642,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_conform_the_account_and_logout()"
});
formatter.result({
  "duration": 2691196876,
  "status": "failed",
  "error_message": "org.junit.ComparisonFailure: expected:\u003craj[u]kumar\u003e but was:\u003craj[]kumar\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat checkingAC.accountvf(checkingAC.java:12)\r\n\tat StepDef.i_conform_the_account_and_logout(StepDef.java:33)\r\n\tat ✽.And i conform the account and logout(register.feature:10)\r\n"
});
});