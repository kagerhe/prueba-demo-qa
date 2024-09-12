package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import utility.BrowserDriver;

public class HomePage extends BasePage {
	private WebDriver driver = BrowserDriver.getDriver();
	private By elementsOption = By.xpath("//*[@id='app']/div/div/div[2]/div/div[1]");

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void clickOnElements() {
		WebElement element = driver.findElement(elementsOption);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}
}
