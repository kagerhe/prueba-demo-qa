package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class BasePage {

	protected WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	protected void click(By elementLocation) {
		driver.findElement(elementLocation).click();
	}
	protected void scrollToElement(By locator) {
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    protected void clickElement(By locator) {
        scrollToElement(locator);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        try {
            element.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }
    }
	protected void writeText(By elementLocation, String text) {
		driver.findElement(elementLocation).sendKeys(text);
	}

	protected String readText(By elementLocation) {
		return driver.findElement(elementLocation).getText();
	}
	 public void type(By locator, String text) {
	        WebElement element = driver.findElement(locator);
	        element.clear();  
	        element.sendKeys(text);  
	    }
}