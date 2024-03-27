package phaseEndProject;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestAssuredAss001 {


	@Test(priority = '1')
	public void petCreation() {
		
/*		String jsonbody = "{\r\n"
				+ "\"id\": 344,\r\n"
				+ "\"category\": {\r\n"
				+ " \"id\": 0,\r\n"
				+ " \"name\": \"string\"\r\n"
				+ "},\r\n"
				+ "\"name\": \"Doggie\",\r\n"
				+ "\"photoUrls\": [\r\n"
				+ " \"string\"\r\n"
				+ "],\r\n"
				+ "\"tags\": [\r\n"
				+ " {\r\n"
				+ " \"id\": 0,\r\n"
				+ " \"name\": \"string\"\r\n"
				+ " }\r\n"
				+ "],\r\n"
				+ "\"status\": \"available\"\r\n"
				+ "}";*/
		
		File file = new File("resources/data.json");
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
		
		
	}
	

	@Test(priority = '2' , dependsOnMethods = "petCreation")
	public void getPetWithID() {
		
		RestAssured.given().
		baseUri("https://petstore.swagger.io")
		.basePath("/v2/pet/344")
		.when().get()
		.then().statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.body("status",Matchers.equalTo("available"))
		.body("category",Matchers.hasKey("id"))
		.log().all();
	}
	

	@Test(priority = '3' , dependsOnMethods = "getPetWithID")
	public void deletePetWithID() {
		RestAssured.given()
		.baseUri("https://petstore.swagger.io")
		.basePath("/v2/pet/344")
		.when().delete()
		.then().statusCode(200).log().all()
		.body("code", Matchers.equalTo(200))
		.body("type", Matchers.equalTo("unknown"))
		.body("message", Matchers.equalTo("344"));
	}
}
