package restAssureScripts;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Script007HamcrestValidateMethods {

	
	// Hamcrest dependency ahs been added to your POM file
	// This dependency provides us many validation methods that help us to validate the response code
	// equalTo() Hamcrest method
	
	@Test(priority = '1')
	public void validateResponsebody() {
		
		String pmapikey = "PMAK-65447daff6b22900315d1f53-3a7eed328be6720d75306bd35189e087ad";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key" , pmapikey )
		.when().get()
		.then().statusCode(200)
		.body("workspaces[3].id" , equalTo("da7ffc89-bafb-44a2-96c1-318ae5b6a48b"),
				"workspaces[3].name" , equalTo("My Workspace 06 Nov"),
				"workspaces[3].type" , equalTo("personal"));
		
	}
	
	
	@Test(priority = '2')
	public void validateResponsebodyequalItems() {
		
		given().baseUri("https://petstore.swagger.io")
		.basePath("/v2/user/Uname001")
		.when().get()
		.then().statusCode(200)
		.body("username" , equalTo("Uname001"),
				"email",equalTo("Positive@Attitude.com"),
				"userStatus" , equalTo(1));
		
	}
	
	@Test(priority = '3')
	public void validateResponseBody_HasItems() {
		
		String pmapikey = "PMAK-65447daff6b22900315d1f53-3a7eed328be6720d75306bd35189e087ad";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key" , pmapikey )
		.when().get()
		.then().statusCode(200)
		// fetch the repsonse body and validate if response includes corrrect values or not
	    .body("workspaces.name" , hasItems("My Workspace","API Testing"),
	    		"workspaces.type" , hasItems("personal"));
		
	}
	
	
}
