package stepDefinition;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.CheckBoxPage;
import utility.Hooks;
import org.junit.Assert;

public class CheckBoxSteps {

	private CheckBoxPage checkBoxPage = new CheckBoxPage(Hooks.getDriver());

	@When("The user selects the CheckBox option")
	public void theUserSelectsTheCheckBoxOption() {
		checkBoxPage.clickCheckBoxOption();
	}

	@When("The user selects Check Box Home")
	public void theUserSelectsCheckBoxHome() {
		checkBoxPage.clickCheckBoxHome();
	}

	@When("The user selects Check Box Desktop")
	public void theUserSelectsCheckBoxDesktop() {
		checkBoxPage.clicktCheckBoxDesktop();
	}

	@When("The user selects Check Box Notes")
	public void theUserSelectsCheckBoxNotes() {
		checkBoxPage.selectCheckBoxNotes();
	}

	@When("The user selects Check Box Documents")
	public void theUserSelectsCheckBoxDocuments() {
		checkBoxPage.clicktCheckBoxDocuments();
	}

	@When("The user selects Check Box Workspace")
	public void theUserSelectsCheckBoxWorkspace() {
		checkBoxPage.selectCheckBoxWorkspace();
	}

	@When("The user selects Check Box Office")
	public void theUserSelectsCheckBoxOffice() {
		checkBoxPage.selectCheckBoxOffice();
	}

	@When("The user selects Check Box Download")
	public void theUserSelectsCheckBoxDownload() {
		checkBoxPage.clicktCheckBoxDownoload();
	}

	@When("The user selects Check Box Word")
	public void theUserSelectsCheckBoxWord() {
		checkBoxPage.selectCheckBoxWord();
	}

	@Then("The output should display the selected checkboxes")
	public void theOutputShouldDisplayTheSelectedCheckboxes() {
		String expectedOutput = "You have selected : notes documents workspace react angular veu office public private classified general wordFile";
		String actualOutput = checkBoxPage.getOutputText();
		expectedOutput = expectedOutput.replaceAll("[\\n\\r]+", " ");
		actualOutput = actualOutput.replaceAll("[\\n\\r]+", " ");
		Assert.assertEquals("The output does not match the expected result.", expectedOutput, actualOutput);

	}
}