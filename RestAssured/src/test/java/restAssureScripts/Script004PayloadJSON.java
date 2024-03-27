package restAssureScripts;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;

public class Script004PayloadJSON {

	// send the body with the Post request with content type as JSON
	
	// Sending JSON data directly from test method

	
	@Test
	public void postUsingJSON() {
		
		JSONObject body = new JSONObject();
		
		body.put("name", "TOM1234");
		body.put("Salary", "750000");
		body.put("age", "23");
		
		int responseid = RestAssured
		.given().baseUri("https://dummy.restapiexample.com")
		.basePath("/api/v1")
		.contentType(ContentType.JSON)
		.body(body.toString())
		.when().post("/create")
		.then().statusCode(200)
		.body("data.name",equalTo("TOM1234"))
		.extract().path("data.id");
		
		System.out.println(responseid);
		
	}
}
