package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	
public WebDriver driver;
	
	
	public landingPage(WebDriver driver) { //bringing driver to life
		this.driver=driver; //passing driver as a argument as constructing a constructor "Landing Page (lp)"
	}
	
	By consent = By.xpath("//span[text() = 'I agree']"); // located elements from maps stored VfPpkd-dgl2Hf-ppHlrf-sM5MNb
	
	By searchBox = By.cssSelector("#searchboxinput");
	
	By searchButton = By.xpath("//button[@id='searchbox-searchbutton']");
	
	By dublinTxt = By.xpath("//span[text() = 'Dublin']");
	
	By directionButton = By.xpath("//button[@data-value = 'Directions']");
	
	By destText = By.xpath("//div[@id='directions-searchbox-1']//input");
	
	public WebElement searchbox() {											// Created WebElement for each located element
		return driver.findElement(searchBox);
	}
	
	public WebElement consent() {
		return driver.findElement(consent);
	}
	
	public WebElement Searchbtn() {
		return driver.findElement(searchButton);
	}
	
	public WebElement Dublintxt() {
		return driver.findElement(dublinTxt);
	}
	
	public WebElement DirBtn() {
		return driver.findElement(directionButton);
	}
	
	public WebElement Desttxt() {
		return driver.findElement(destText);
	}
	


}
