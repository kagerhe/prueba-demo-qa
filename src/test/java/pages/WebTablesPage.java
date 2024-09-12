package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebTablesPage extends BasePage {

	private By webTablesOption = By.id("item-3");
	private By addButton = By.id("addNewRecordButton");
	private By firstNameField = By.id("firstName");
	private By lastNameField = By.id("lastName");
	private By emailField = By.id("userEmail");
	private By ageField = By.id("age");
	private By salaryField = By.id("salary");
	private By departmentField = By.id("department");
	private By submitButton = By.id("submit");
	private By tableRows = By.cssSelector("table tbody tr");

	public WebTablesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickWebTablesOption() {
		click(webTablesOption);
	}

	public void clickAddButton() {
		click(addButton);
	}

	public void fillWebTableForm(String firstName, String lastName, String age, String email, String salary,
			String department) {
		type(firstNameField, firstName);
		type(lastNameField, lastName);
		type(ageField, age);
		type(emailField, email);
		type(salaryField, salary);
		type(departmentField, department);
	}

	public void submitForm() {
		click(submitButton);
	}

	public boolean isEntryInTable(String firstName, String lastName) {
		scrollToElement(tableRows);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(tableRows));
		// Esperar a que la tabla sea visible
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[1]")));
	    
	    // Obtener todas las filas de la tabla
	    List<WebElement> rows = driver.findElements(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[1]//tr"));
	    
	    // Verificar si hay filas en la tabla
	    if (rows.size() >= 4) {
	        WebElement targetRow = rows.get(3); // Obtener la cuarta fila (índice 3)
	        List<WebElement> cells = targetRow.findElements(By.tagName("td"));
	        
	        // Verificar si hay suficientes columnas en la fila
	        if (cells.size() >= 2) {
	            String firstNameCell = cells.get(0).getText().trim(); // Primera columna
	            String lastNameCell = cells.get(1).getText().trim();  // Segunda columna
	            
	            // Comparar los datos de la celda con los datos esperados
	            return firstNameCell.equals(firstName) && lastNameCell.equals(lastName);
	        }
	    }
	    return false;
	}
}
