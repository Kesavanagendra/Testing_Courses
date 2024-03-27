package steps;

import static io.restassured.RestAssured.*;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class GithubSteps {
	
	Response res;

	@Given("Users enter github base URL and Authorization")
	public void users_enter_github_base_url_and_authorization() {
	   
		given().baseUri("https://api.github.com")
		.basePath("/user/repos")
		.header("Authorization","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");
		
	}
	
	@When("User executes HTTP get method")
	public void user_executes_http_get_method() {
		res=given().baseUri("https://api.github.com")
			.basePath("/user/repos")
			.header("Authorization","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")
			.when().get();
		
	}
	
	@Then("Validate the response status code.")
	public void validate_the_response_status_code() {
	    
		res.prettyPrint();
		Assert.assertEquals(res.statusCode(), 200);
		
	}
}
