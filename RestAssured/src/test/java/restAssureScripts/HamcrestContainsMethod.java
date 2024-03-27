package restAssureScripts;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

public class HamcrestContainsMethod {

	@Test
	public void containsMethod() {
		
		RestAssured.given()
		.baseUri("https://api.postman.com")
		.header("x-Api-key","PMAK-65447daff6b22900315d1f53-3a7eed328be6720d75306bd35189e087ad")
		.when()
		.get("/workspaces").
		then()
		.statusCode(200)
			// matches all the items in the response and in strict order
			// change order or remove one item.. method fails
		.body("workspaces.name", contains("My Workspace", "API Testing"," My Workspace 06 Nov"));
	}
}
