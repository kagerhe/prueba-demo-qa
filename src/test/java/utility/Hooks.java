package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
	 private static WebDriver driver;

	    @Before
	    public void setUp() {
	        // Inicializa el navegador
	        driver = BrowserDriver.getDriver();
	    }

	    @After
	    public void tearDown() {
	        if (driver != null) {
	          //  driver.quit(); // Cierra el navegador
	        }
	    }

	    public static WebDriver getDriver() {
	        return driver;
	    }
}

