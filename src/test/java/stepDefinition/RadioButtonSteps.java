package stepDefinition;
import org.junit.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RadioButtonPage;
import utility.Hooks;

public class RadioButtonSteps {
	 private RadioButtonPage radioButtonPage;

	    public RadioButtonSteps() {
	        this.radioButtonPage = new RadioButtonPage(Hooks.getDriver()); 
	    }

	    @When("The user selects the Radio Button option")
	    public void theUserSelectsTheRadioButtonOption() {
	        radioButtonPage.clickRadioButtonOption();
	    }

	    @When("The user selects the Yes radio button")
	    public void theUserSelectsTheYesRadioButton() {
	        radioButtonPage.clickYesRadioButton();
	    }

	    @When("The user selects the Impressive radio button")
	    public void theUserSelectsTheImpressiveRadioButton() {
	        radioButtonPage.clickImpressiveRadioButton();
	    }

	    @Then("The output should display {string}")
	    public void theOutputShouldDisplay(String expectedOutput) {
	        String actualOutput = radioButtonPage.getOutputText();
	        Assert.assertEquals("The output does not display the expected result", expectedOutput, actualOutput);
	    }
}
