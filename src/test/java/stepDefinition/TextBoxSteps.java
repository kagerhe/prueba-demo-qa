package stepDefinition;

import io.cucumber.java.en.*;

import org.junit.Assert;
import pages.TextBoxPage;
import utility.Hooks;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class TextBoxSteps {

	private TextBoxPage textBoxPage = new TextBoxPage(Hooks.getDriver());

	@When("The user selects the TextBox option")
	public void theUserSelectsTheTextBoxOption() {
		textBoxPage.clickTextBoxOption();
	}

	@When("The user fills in the fields with name {string}, email {string}, address {string}, and secondary address {string}")
	public void theUserFillsInTheFields(String name, String email, String address, String secondaryAddress) {
		textBoxPage.fillForm(name, email, address, secondaryAddress);
	}

	@And("The user clicks on the Submit button")
	public void theUserClicksOnTheSubmitButton() {
		textBoxPage.clickSubmitButton();
	}

	@Then("The form should display the entered data below in the output")
	public void theFormShouldDisplayTheEnteredDataBelowInTheOutput() {
		String expectedName = "Karina Gerdez";
		String expectedEmail = "kagerhe@gmail.com";
		String expectedAddress = "avenida 40 Bello";
		String expectedSecondaryAddress = "Avenida 50 Medellín";
		String actualOutput = textBoxPage.getOutputText();
		Assert.assertTrue("The output does not contain the expected name.", actualOutput.contains(expectedName));
		Assert.assertTrue("The output does not contain the expected email.", actualOutput.contains(expectedEmail));
		Assert.assertTrue("The output does not contain the expected address.", actualOutput.contains(expectedAddress));
		Assert.assertTrue("The output does not contain the expected secondary address.",
				actualOutput.contains(expectedSecondaryAddress));
	}
}