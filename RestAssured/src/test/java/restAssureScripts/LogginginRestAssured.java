package restAssureScripts;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class LogginginRestAssured {

	@Test
	public void loggingMethods() {
		String pmapikey = "PMAK-65447daff6b22900315d1f53-3a7eed328be6720d75306bd35189e087ad";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key" , pmapikey )
		.when().get()
		.then().statusCode(200).log().headers();
//		.then().log().ifError();
//		.then().statusCode(200).log().cookies();
//		.then().statusCode(200).log().all();
		
	}
}
