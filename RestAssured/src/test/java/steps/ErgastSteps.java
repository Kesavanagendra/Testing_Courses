package steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class ErgastSteps extends TestBase {

	Response res;
	
	@Given("User enters Ergast link")
	public void user_enters_ergast_link() {
	    
		 r = RestAssured.given().baseUri("http://ergast.com")
		.basePath("/api/f1/2018/circuits.json");
	}

	@When("User executes the HTTP Get method")
	public void user_executes_the_http_get_method() {
	    
		 res = r.when().get();
		 
		  System.out.println(res.getBody().asPrettyString());
	}

	@Then("User validate the response code")
	public void user_validate_the_response_code() {
	    int Actualcode = res.getStatusCode();
	    System.out.println(Actualcode);
	    int Expectedcode = 200;
	    Assert.assertEquals(Actualcode, Expectedcode);
	    
	  
		
	}
}
