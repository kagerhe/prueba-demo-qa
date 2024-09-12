package stepDefinition;
import io.cucumber.java.en.*;
import pages.HomePage;
import utility.Hooks;


public class HomeSteps {
	private HomePage homePage = new HomePage(Hooks.getDriver());

    @Given("The user is on the home page")
    public void theUserIsOnTheHomePage() {
        Hooks.getDriver().get("https://demoqa.com/"); 
    }

    @When("The user clicks on the Elements option")
    public void theUserClicksOnTheElementsOption() {
        homePage.clickOnElements();
    }

}

