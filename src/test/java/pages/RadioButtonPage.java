package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage extends BasePage {
	private By radioButtonOption = By.id("item-2");
	private By yesRadioButton = By.xpath("//label[text()='Yes']");
	private By impressiveRadioButton = By.xpath("//label[text()='Impressive']");
	private By outputText = By.className("text-success"); 

	public RadioButtonPage(WebDriver driver) {
		super(driver);
	}

	public void clickRadioButtonOption() {
		scrollToElement(radioButtonOption); 
		click(radioButtonOption); 
	}

	public void clickYesRadioButton() {
		scrollToElement(yesRadioButton); 
		click(yesRadioButton);
	}

	public void clickImpressiveRadioButton() {
		scrollToElement(impressiveRadioButton); 
		click(impressiveRadioButton); 
	}

	public String getOutputText() {
		return driver.findElement(outputText).getText();
	}
}