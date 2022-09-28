package pom;

import Baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class QuotesPage extends BaseClass {

private static WebDriver driver;
	
	public QuotesPage(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(@class,'policyouterblock')]")
	private List<WebElement> policy_list;

	public List<WebElement> policy_list() {
		return policy_list;
	}

	public List<WebElement> get_policy_list() {
		waitforElementVisiblity(policy_list.get(0));
		return policy_list;
	}
	
	
	
	@FindBy(xpath = "//div[contains(@class,'policyouterblock')]//button[contains(@class,'addcompareblock')]")
	private List<WebElement> premium_list;

	public List<WebElement> get_premium_list() {
		waitforElementVisiblity(premium_list.get(0));
		return premium_list;
	}
	

}
