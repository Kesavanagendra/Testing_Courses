package phaseEndProject;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RestAssuredAss005 {

	@Test
	public void petFindByStatus() {
		
		RestAssured.given()
		.baseUri("https://petstore.swagger.io")
		.basePath("/v2/pet/findByStatus")
//		.param("status", "available")
		//.queryParam("status", "pending")
		.queryParam("status", "sold")
		.when().get()
		.then().statusCode(200)
		.log().all();
		
	}
}
