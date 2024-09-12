package utility;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
	 private static WebDriver driver;

	    public static void initializeDriver() {
	        if (driver == null) {
	            // Usa el path adecuado para tu chromedriver
	            String path = new File("src/test/resources/driver/chromedriver.exe").getAbsolutePath();
	            System.setProperty("webdriver.chrome.driver", path);
	            driver = new ChromeDriver();
	            driver.manage().window().maximize();
	        }
	    }

	    public static WebDriver getDriver() {
	        if (driver == null) {
	            initializeDriver();
	        }
	        return driver;
	    }
	 /*private static WebDriver driver;
	    private static ChromeOptions options;

	    public BrowserDriver() {
	        if (driver == null) {
	            options = new ChromeOptions();
	            options.addArguments("--remote-allow-origins=*"); // Opcional, puede ser necesario dependiendo del entorno
	            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/driver/chromedriver.exe");
	            driver = new ChromeDriver(options);
	        }
	        driver.manage().window().maximize();
	    }

	    public static WebDriver getDriver() {
	        return driver;
	    }

	    public void close() {
	        if (driver != null) {
	           // driver.quit();
	            driver = null;
	        }
	    }
	    public void navigateTo(String url) {
	        driver.get(url);
	    }
	    */
	    
	    
	    
}
