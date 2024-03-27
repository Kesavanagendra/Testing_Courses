package phaseEndProject;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RestAssuredAss002 {

	Logger logger = LogManager.getLogger(RestAssuredAss002.class);
	
	@Test(priority = '1')
	public void petCreation() {
		
		logger.info("Course End project - Assignment002 - POST request");
		File file = new File("resources/dataput002.json");
		RestAssured.given().
		baseUri("https://petstore.swagger.io")
		.basePath("/v2/pet")
		.contentType(ContentType.JSON)
		.accept("application/json")
		.body(file)
		.when().post()
		.then().statusCode(200)
		.body("id", Matchers.equalTo(344))
		.log().all();
		
		logger.trace("The status code is checked");
		logger.trace("Id has been captured and validated");
		
	}
	
	
	@Test(priority='2')
	public void assignment002Put()
	{
		File file = new File("resources/dataput002.json");
	int id = RestAssured.given()
		.baseUri("https://petstore.swagger.io/v2/pet/")
		.contentType(ContentType.JSON)
		.body(file)
		.when()
		.post()
		.then()
		.statusCode(200)
		.log().all()
		.body("status", Matchers.equalTo("available_QA")).extract().path("id");
	
	System.out.println(id);
		
		
	}
}
