package stepdefinations;

import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Flipkart {
	@Given("Flipkart Home Page mus Dispaly")
	public void flipkart_home_page_mus_dispaly() {
	
		Reporter.log("Flipkart Home page is Displayed");
	
	}

	@When("Search the data in the SearchBox {string}")
	public void search_the_data_in_the_search_box(String string) {
	
		Reporter.log("Searching phone"+string,true);
	
	}

	@Then("Multiple phone must display")
	public void multiple_phone_must_display() {
	
		Reporter.log("Phones are displayed",true);
	
	}

}
