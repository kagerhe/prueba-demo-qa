package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage extends BasePage {

	private By textBoxOption = By.xpath("//span[text()='Text Box']");
	private By fullNameField = By.id("userName");
	private By emailField = By.id("userEmail");
	private By currentAddressField = By.id("currentAddress");
	private By permanentAddressField = By.id("permanentAddress");
	private By submitButton = By.id("submit");
	private By output = By.id("output");

	public TextBoxPage(WebDriver driver) {
		super(driver);
	}

	public void clickTextBoxOption() {
		WebElement textBoxOptionElement = driver.findElement(textBoxOption);
		textBoxOptionElement.click();
	}

	public void fillForm(String name, String email, String address, String secondaryAddress) {
		WebElement fullNameElement = driver.findElement(fullNameField);
		WebElement emailElement = driver.findElement(emailField);
		WebElement currentAddressElement = driver.findElement(currentAddressField);
		WebElement permanentAddressElement = driver.findElement(permanentAddressField);

		fullNameElement.sendKeys(name);
		emailElement.sendKeys(email);
		currentAddressElement.sendKeys(address);
		permanentAddressElement.sendKeys(secondaryAddress);
		clickSubmitButton();
	}

	public String getSubmissionMessage() {
		By messageLocator = By.id("messageId");
		WebElement messageElement = driver.findElement(messageLocator);
		return messageElement.getText();
	}

	public void scrollToElement(By locator) {
		WebElement element = driver.findElement(locator);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void clickSubmitButton() {
		scrollToElement(submitButton);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement submitButtonElement = wait.until(ExpectedConditions.elementToBeClickable(submitButton));
		try {
			submitButtonElement.click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitButtonElement);
		}
	}

	public String getOutputText() {
		WebElement outputElement = driver.findElement(output);
		return outputElement.getText();
	}
}
