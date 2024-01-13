package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import pages.TestBase;
import org.openqa.selenium.interactions.Actions;


public class ListAccountPage {
	WebDriver driver;
	String expected = "Account List";

	public ListAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[text()='List Accounts']")
	WebElement listAccountElement;
	@FindBy(how = How.XPATH, using = "//*[text()='Account List']")
	WebElement accountListElement;
	@FindBy(how = How.XPATH, using = "//*[text()='Add Account']")
	WebElement addAccountButtonElement;
	@FindBy(how = How.XPATH, using = "//*[@id='accountModal']/div/div")
	WebElement formWindowElement;
	@FindBy(how = How.XPATH, using = "//*[@id='account_name']")
	WebElement accountNameElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	WebElement descriptionElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	WebElement initialBalanceElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement accountNumberElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	WebElement contactPersonElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"accountSave\"]")
	WebElement saveButtonElement;
	@FindBy(how = How.XPATH, using = "//*[text()='Account Added Successfully.']")
	WebElement successAddAccountAlertElement;


	// Intractable methods
	public void clikOnListAccount() {
		listAccountElement.click();
	}

	public void clikOnaddAccountButton() {
		addAccountButtonElement.click();
	}

	public void insertAccountName(String accountName) {
		accountNameElement.sendKeys(accountName + TestBase.random(2));
	}
	public void insertDescription(String description) {
		descriptionElement.sendKeys(description);
	}
	public void insertInitialBalance(String initialBalance) {
		initialBalanceElement.sendKeys(initialBalance);
	}
	public void insertAccountNumber(String accountNum) {
		accountNumberElement.sendKeys(accountNum);
	}
	public void insertContactPerson(String contactPerson) {
		contactPersonElement.sendKeys(contactPerson);
	}
	public void clikOnsaveButton() {
		saveButtonElement.click();
	}
	public void validateListAccountPage(String msg) {
		TestBase.validateAssertionElement(msg, accountListElement, expected);
	}
	public void validateAddAccountForm(String msg) {
		TestBase.waitMethod();
		TestBase.validateDisplayElement(msg, formWindowElement);
	}
	
	public void validateAddAlertPopup(String msg) {
		TestBase.waitMethod();
		TestBase.validateDisplayElement(msg, successAddAccountAlertElement);

	}
	
//	public void validateIfAccountWasCreated(String msg, String accountName) {
//		Actions action = new Actions(driver);
//		action.sendKeys(Keys.F5).build().perform();
//		TestBase.waitMethod();
//		Assert.assertTrue(msg, driver.getPageSource().contains(accountName));
//	}
	


}
