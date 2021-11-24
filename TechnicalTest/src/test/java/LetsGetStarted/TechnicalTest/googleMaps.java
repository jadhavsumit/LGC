/*package LetsGetStarted.TechnicalTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import PageObjects.landingPage;
import junit.framework.Assert;
import resources.base;

public class googleMaps extends base {

	public WebDriver driver;

	@SuppressWarnings("deprecation")
	@Test
	public void google() throws IOException, InterruptedException {
		driver = initializeDriver();
		String url = prop.getProperty("url");
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		landingPage lp = new landingPage(driver); // creating object from landing page
		lp.consent().click(); // Clicking on google consent "I Agree"
		lp.searchbox().sendKeys("Dublin");
		lp.Searchbtn().click();
		String dbtext = lp.Dublintxt().getText();
		Assert.assertEquals("Dublin", dbtext); // Verifying the "Dublin" text with assertequals function
		lp.DirBtn().click();
		lp.Desttxt().click();
		String dbtext1 = lp.Desttxt().getAttribute("value");
		Assert.assertEquals("Dublin", dbtext1); // Verifying the "Dublin" text with assertequals function
		driver.quit();
	}

}*/
