// --------- Base Class ---------

//This base class initializes the chrome driver so that the driver is initialised once

package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/java/resources/data.properties"); // with usr.dir we can avoid hardcoding the path
		prop.load(fis);
		String browserName = prop.getProperty("browser");   // getting browser information from data.properties file

		if (browserName.equals("chrome")) {					// defining browser properties 

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/main/java/resources/chromedriver");
		
			
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--diable-notifications");
			ops.addArguments("--start-maximized");
			ops.addArguments("--use-fake-ui-for-media-stream");
			ops.addArguments("ignore-certificate-errors");
			ops.addArguments("--disable-user-media-security=true");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			return driver;

		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"System.getProperty(\"user.dir\") + \"/src/main/java/resources/geckodriver");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}

		return driver;
	}

}
