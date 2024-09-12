package stepDefinition;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.WebTablesPage;
import utility.BrowserDriver;

public class WebTablesSteps {
	 WebTablesPage webTablesPage = new WebTablesPage(BrowserDriver.getDriver());

	 @When("The user selects the Web Table option")
	    public void theUserSelectsTheWebTableOption() {
	        webTablesPage.clickWebTablesOption();
	    }

	    @When("The user clicks on the {string} button")
	    public void theUserClicksOnTheButton(String button) {
	        if (button.equalsIgnoreCase("Add")) {
	            webTablesPage.clickAddButton();
	        }
	    }

	    @When("The user fills the web table form with first name {string}, last name {string}, age {string}, email {string}, salary {string}, and department {string}")
	    public void theUserFillsTheWebTableForm(String firstName, String lastName, String age, String email, String salary, String department) {
	        webTablesPage.fillWebTableForm(firstName, lastName, age, email, salary, department);
	    }

	    @When("The user submits the web table form")
	    public void theUserSubmitsTheWebTableForm() {
	        webTablesPage.submitForm();
	    }

	    @Then("The table should display an entry with the first name {string} and last name {string}")
	    public void theTableShouldDisplayAnEntryWithTheFirstNameAndLastName(String firstName, String lastName) {
	        Assert.assertTrue("The entry was not found in the table", webTablesPage.isEntryInTable(firstName, lastName));
	    }
	    
}
