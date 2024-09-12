package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage extends BasePage {

	private By checkBoxOption = By.id("item-1"); //  
	private By checkBoxHome = By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"); 
	private By checkBoxDesktop = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button"); 
	private By checkBoxNotes = By.xpath("//label[@for='tree-node-notes']//span[@class='rct-checkbox']//*[name()='svg']"); 
	private By checkBoxDocuments = By.xpath("//li[@class='rct-node rct-node-parent rct-node-collapsed']//button[@title='Toggle']");
	private By checkBoxWorkspace = By.xpath("//label[@for='tree-node-workspace']//span[@class='rct-checkbox']//*[name()='svg']");
	private By checkBoxOffice = By.xpath("//label[@for='tree-node-office']//span[@class='rct-checkbox']//*[name()='svg']");
	private By checkBoxDownoload = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/button");
	private By checkBoxWord = By.xpath("//label[@for='tree-node-wordFile']//span[@class='rct-checkbox']//*[name()='svg']");
	
	private By result = By.id("result"); 

	public CheckBoxPage(WebDriver driver) {
		super(driver);
	}

	public void clickCheckBoxOption() {
		scrollToElement(checkBoxOption);
		WebElement checkBoxOptionElement = driver.findElement(checkBoxOption);
		checkBoxOptionElement.click();
	}

	public void clickCheckBoxHome() {
		scrollToElement(checkBoxHome);
		WebElement checkBox1Element = driver.findElement(checkBoxHome);
		checkBox1Element.click();
	}

	public void clicktCheckBoxDesktop()
	{scrollToElement(checkBoxDesktop);
		WebElement checkBox2Element = driver.findElement(checkBoxDesktop);
		checkBox2Element.click();
	}

	public void selectCheckBoxNotes() {
	WebElement checkBox3Element = driver.findElement(checkBoxNotes);
		checkBox3Element.click();
	}

	public void clicktCheckBoxDocuments() {
		WebElement checkBox4Element = driver.findElement(checkBoxDocuments);
		checkBox4Element.click();
	}
	public void selectCheckBoxWorkspace() {
		WebElement checkBox5Element = driver.findElement(checkBoxWorkspace);
		checkBox5Element.click();
	}
	public void selectCheckBoxWord() {
		WebElement checkBox6Element = driver.findElement(checkBoxWord);
		checkBox6Element.click();
	}
	public void clicktCheckBoxDownoload() {
		WebElement checkBox7Element = driver.findElement(checkBoxDownoload);
		checkBox7Element.click();
	}
	public void selectCheckBoxOffice() {
		scrollToElement(checkBoxOffice);
		WebElement checkBox8Element = driver.findElement(checkBoxOffice);
		checkBox8Element.click();
	}
	public String getOutputText() {
		WebElement outputElement = driver.findElement(result);
		return outputElement.getText();
	}

	
}
