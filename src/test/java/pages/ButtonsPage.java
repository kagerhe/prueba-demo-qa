package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonsPage extends BasePage {

	private By doubleClickButton = By.id("doubleClickBtn");
	private By rightClickButton = By.id("rightClickBtn");

	public ButtonsPage(WebDriver driver) {
		super(driver);
	}

	public By getSimpleButton() {
		return getSimpleButton();
	}

	public By getDoubleClickButton() {
		return doubleClickButton;
	}

	public By getRightClickButton() {
		return rightClickButton;
	}

	public By getOutput() {
		return getOutput();
	}
}