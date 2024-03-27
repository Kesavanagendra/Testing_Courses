package phaseEndProject;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RestAssuredAss004 {

	@Test
	public void authenticate() {
		
		String username = "Uname001";
		String password = "@tt!tude";
		
		RestAssured.given()
		.baseUri("https://petstore.swagger.io")
		.basePath("/v2/user/login")
		.auth().preemptive().basic(username, password)
		.param("grant_type", "client_credentials")
		.when().get()
		.then().statusCode(200)
		.body("message", Matchers.containsString("logged in user session"))
		.log().all();
	}
}
