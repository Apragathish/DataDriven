package pom;

import Baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vehicle_DetailsPage extends BaseClass {

	private static WebDriver driver;

	public Vehicle_DetailsPage(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Choose your vehicle']")
	private WebElement choose_vehicle_text;

	public WebElement chooseYourVehicle() {
		return choose_vehicle_text;
	}

	public String getChooseYourVehicleHeading() {
		waitforElementVisiblity(choose_vehicle_text);
		return choose_vehicle_text.getText();
	}

	@FindBy(xpath = "//label[text()='Manufacture Year']/following::input[1]")
	private WebElement manufacture_year_input;

	public WebElement manufacture_year_input() {
		return manufacture_year_input;
	}

	public void setManufactureYear(String value) {
		waitforElementVisiblity(manufacture_year_input);
		manufacture_year_input.sendKeys(value);
	}

	@FindBy(xpath = "//label[text()='Registration Date']/following::input[1]")
	private WebElement registration_date_input;

	public WebElement registration_date_input() {
		return registration_date_input;
	}

	public void setRegistrationDate(String value) {
		waitforElementVisiblity(registration_date_input);
		registration_date_input.sendKeys(value);
	}

	@FindBy(xpath = "//label[text()='Policy Expiry Date']/following::input[1]")
	private WebElement policyExpiry_date_input;

	public WebElement policyExpiry_date_input() {
		return policyExpiry_date_input;
	}

	public void setPolicyExpiryDate(String value) {
		waitforElementVisiblity(policyExpiry_date_input);
		policyExpiry_date_input.clear();
		policyExpiry_date_input.click();
		for (int i = 0; i < value.split("-").length; i++) {
			try {
				Thread.sleep(300);
				policyExpiry_date_input.sendKeys(value.split("-")[i]);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@FindBy(xpath = "//button[text()='PROCEED']")
	private WebElement proceed_btn;

	public WebElement proceed_btn() {
		return proceed_btn;
	}

	public void clickProceedButon() {
		waitforElementVisiblity(proceed_btn);
		proceed_btn.click();
	}

}
