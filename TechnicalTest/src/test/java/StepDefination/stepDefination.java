package StepDefination;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import PageObjects.landingPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import resources.base;

@SuppressWarnings("deprecation")
public class stepDefination extends base {

	public WebDriver driver;
	public landingPage lp;

	@Before
	public void startDriver() throws IOException {
		driver = initializeDriver();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void closeDriver() {
		driver.quit();
	}

	@Given("^User is on google maps landing page$")
	public void user_is_on_google_maps_landing_page() throws Throwable {
		driver.get(prop.getProperty("url"));
		lp = new landingPage(driver);
		lp.consent().click();
	}

	@When("^User enters Dublin text in searchbox$")
	public void user_enters_dublin_text_in_searchbox() throws Throwable {
		lp.searchbox().sendKeys("Dublin");
	}

	@Then("^User clicks on search button$")
	public void user_click_directions() throws Throwable {
		lp.Searchbtn().click();
	}

	@And("^Verify left panel has Dublin as a headline text$")
	public void verify_destination_field_as_dublin() throws Throwable {
		String dbtext = lp.Dublintxt().getText();
		Assert.assertEquals("Dublin", dbtext);
	}

	@When("^User Click directions$")
	public void verify_left_panel_has_dublin_as_a_headline_text() throws Throwable {
		lp.DirBtn().click();
	}
	
	@Then("^verify destination field as Dublin$")
	public void verify_destination_field_as_Dublin() throws Throwable {
		lp.Desttxt().click();
		String dbtext1 = lp.Desttxt().getAttribute("value");
		Assert.assertEquals("Dublin", dbtext1);
	}

	
}
