package stepdefinitions;


import Baseclass.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pom.Vehicle_DetailsPage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class VehicleDetails extends BaseClass {
	Vehicle_DetailsPage vehicle_DetailsPage = null;
	
	@Then("^User lands in Choose your vehicle screen$")
	public void user_lands_in_Choose_your_vehicle_screen() throws Throwable {
		vehicle_DetailsPage = new Vehicle_DetailsPage(BaseClass.driver);
	    Assert.assertEquals(vehicle_DetailsPage.getChooseYourVehicleHeading(),"Choose your vehicle");
	    test.info("User landed in \"Choose your vehicle\" screen");
	}

	@When("^User edits the expiry date to plus (\\d+) days$")
	public void user_edits_the_expiry_date_to_plus_days(int arg1) throws Throwable {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String str_date = sdf.format(date).replaceAll("/", "-");
		if(Integer.parseInt(str_date.split("-")[0])<=25) {
			Integer i = Integer.parseInt(str_date.split("-")[0]) + 5;
			str_date = i.toString() +"-"+ str_date.split("-")[1] +"-"+ str_date.split("-")[2];
		}else {
			Integer diff = 30 - Integer.parseInt(str_date.split("-")[0]);
		}
		vehicle_DetailsPage.setPolicyExpiryDate(str_date);
		test.info("User edits the expiry date : "+arg1);
	}

	@When("^User click on PROCEED button$")
	public void user_click_on_PROCEED_button() throws Throwable {
		BaseClass.clickonWebelement(vehicle_DetailsPage.proceed_btn());
	    test.info("User click on PROCEED button");
	}
}
