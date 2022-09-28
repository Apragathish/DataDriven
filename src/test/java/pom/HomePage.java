package pom;


import Baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Baseclass.BaseClass.waitforElementVisiblity;

public class HomePage extends BaseClass {
	private static WebDriver driver;
	
	public HomePage(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//section[contains(@class,'ListOfProdcutsContainer')]//div[@id='homepagecar']")
	private WebElement carSection_btn;


	public WebElement carSection() {
		return carSection_btn;
	}

	public void clickCarSection() {
		waitforElementVisiblity(carSection_btn);
		carSection_btn.click();
	}
	
	@FindBy(xpath = "//section[contains(@class,'ListOfProdcutsContainer')]//div[@id='homepagebike']")
	private WebElement bikeSection_btn;


	public WebElement bikeSection() {
		return bikeSection_btn;
	}
	public void clickbikeSection() {
		waitforElementVisiblity(bikeSection_btn);
		bikeSection_btn.click();
	}
	@FindBy(xpath = "//input[@id='homecarno'][@placeholder='Please type car number']")
	private WebElement search_input;

	public WebElement search_input() {
		return search_input;
	}
	public void set_search_input(String value) {
		waitforElementVisiblity(search_input);
		search_input.sendKeys(value);
	}
	@FindBy(xpath = "//button[text()='Clear']")
	private WebElement clear_btn ;

	public WebElement clear_btn() {
		return clear_btn;
	}
	public void click_clear_btn() {
		waitforElementVisiblity(clear_btn);
		clear_btn.click();
	}
	
	@FindBy(xpath = "//button[text()='Get Quotes >']")
	private WebElement get_quote_btn ;

	public WebElement quote_btn() {
		return get_quote_btn;
	}
	public Vehicle_DetailsPage click_get_quote() {
		waitforElementVisiblity(get_quote_btn);
		get_quote_btn.click();
		return new Vehicle_DetailsPage(driver);
		
	}

	
}
