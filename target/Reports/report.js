$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFile/login.feature");
formatter.feature({
  "line": 1,
  "name": "To validate the login functionality of facebook application",
  "description": "",
  "id": "to-validate-the-login-functionality-of-facebook-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "To validate login with Invalid username and invalid password",
  "id": "to-validate-the-login-functionality-of-facebook-application;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user has to launch the chrome browser and pass the url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user has to enter the values in username and password",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user has to click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user has to navigate the error page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinationClass.user_has_to_launch_the_chrome_browser_and_pass_the_url()"
});
formatter.result({
  "duration": 6650180600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationClass.user_has_to_enter_the_values_in_username_and_password()"
});
formatter.result({
  "duration": 303327100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationClass.user_has_to_click_the_login_button()"
});
formatter.result({
  "duration": 75373300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationClass.user_has_to_navigate_the_error_page()"
});
formatter.result({
  "duration": 119000,
  "status": "passed"
});
});