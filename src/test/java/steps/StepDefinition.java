package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DatabasePage;
import pages.ListAccountPage;
import pages.LoginPage;
import pages.TestBase;

public class StepDefinition extends TestBase {
	LoginPage loginPage;
	ListAccountPage listAccountPage;
	DatabasePage databasePage;
	String accountName;

	@Before
	public void beforeRun() {
		init();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		listAccountPage = PageFactory.initElements(driver, ListAccountPage.class);
		databasePage = new DatabasePage();

	}

	@When("User clicks on list account button")
	public void user_clicks_on_list_account_button() {
		listAccountPage.clikOnListAccount();
	}

	@Then("User should be able to land on list account page")
	public void user_should_be_able_to_land_on_list_account_page() {

		listAccountPage.validateListAccountPage("Page not landed on List Account Page");
	}

	@When("User clicks on add account button")
	public void user_clicks_on_add_account_button() {
		listAccountPage.clikOnaddAccountButton();
		takeScreenshot(driver);
	}

	@Then("User should be able to land on the add account form")
	public void user_should_be_able_to_land_on_the_add_account_form() {
		listAccountPage.validateAddAccountForm("Account form window is not displayed");
	}

	@When("User enters account accountName as {string}")
	public String user_enters_account_accountName_as(String string) {
		accountName = string + random(5);
		listAccountPage.insertAccountName(string);
		takeScreenshot(driver);
		return accountName;
	}

	@When("User enters account description as {string}")
	public void user_enters_account_description_as(String string) {
		listAccountPage.insertDescription(string + random(2));
	}

	@Then("User enters account initialBalance as {string}")
	public void user_enters_account_initialBalance_as(String string) {
		listAccountPage.insertInitialBalance(string);
	}

	@When("User enters account accountNumber as {string}")
	public void user_enters_account_accountNumber_as(String string) {
		listAccountPage.insertAccountNumber(string);
	}

	@When("User enters account contactPerson as {string}")
	public void user_enters_account_contactPerson_as(String string) {
		listAccountPage.insertContactPerson(string);
	}

	@When("User should be able to click on save button")
	public void user_should_be_able_to_click_on_save_button() {
		listAccountPage.clikOnsaveButton();
	}

	@And("User should be able to see the success alert pop-pup")
	public void user_should_be_able_to_see_the_success_alert_pop_pup() {
		listAccountPage.validateAddAlertPopup("Alert pop-pup not displayed");
	}

//	@Then("User should be able to check if account is successfuly created")
//	public void user_should_be_able_to_check_if_account_is_successfuly_created() {
//		listAccountPage.validateIfAccountWasCreated("Account unsuccessfuly created",accountName);
//	}

	@Given("User is on the codefios login page")
	public void user_is_on_the_codefios_login_page() {
		driver.get("https://qa.codefios.com/login");
	}

	@And("User clicks on sign in button")
	public void user_clicks_on_the_signin_button() {
		// Write code here that turns the phrase above into concrete actions
		loginPage.clickOnSigninButton();
	}

	@Then("User should be able to land on dashboard page")
	public void user_should_be_able_to_land_on_dashboard_page() {
		takeScreenshot(driver);
		String expectedTitle = "Codefios QA";
		String actualTitle = getPageTitle();
		loginPage.validateDashboardPage("Page not landed on Dashboard Page", expectedTitle, actualTitle);
	}

	@When("User enters {string} from mysql database")
	public void user_enters_from_mysql_database(String loginData) {
		switch (loginData) {
		case "username":
			loginPage.insertUsername(databasePage.getDataFromDatabase("user_name"));
			System.out.println("Username from DB: " + databasePage.getDataFromDatabase("user_name"));
			break;
		case "password":
			loginPage.insertPassword(databasePage.getDataFromDatabase("user_password"));
			System.out.println("Password from DB: " + databasePage.getDataFromDatabase("user_name"));

			break;
		default:
			System.out.println("Unable to find Login Data" + loginData);
		}
	}

//driver.switchTo().alert().getText();
	@After
	public void afterRun() {
		driver.close();
		driver.quit();
	}

}
