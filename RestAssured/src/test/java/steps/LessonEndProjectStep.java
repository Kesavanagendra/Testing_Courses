package steps;

import org.json.JSONObject;


import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class LessonEndProjectStep {

	
	@Given("User send a post request to create a user and validates status")
	public void user_send_a_post_request_to_create_a_user_and_validates_status() {
	    
		JSONObject body = new JSONObject();
		body.put("name", "TOM123");
		body.put("Job", "Tester");
		
		RestAssured.given()
		.baseUri("https://reqres.in")
		.basePath("/api/users")
		.contentType(ContentType.JSON)
		.body(body.toString())
		.when().post()
		.then().statusCode(201).log().all();
	}
		
	@Given("User send a post request to create a user credentials and validates status")
	public void user_send_a_post_request_to_create_a_user_credentials_and_validates_status() {
	  
		JSONObject body1 = new JSONObject();
		body1.put("email", "eve.holt@reqres.in");
		body1.put("password", "pistol");
		
		RestAssured.given()
		.baseUri("https://reqres.in")
		.basePath("/api/register")
		.contentType(ContentType.JSON)
		.body(body1.toString())
		.when().post()
		.then().statusCode(200);
	}
	
	
	@Given("User sends a Get request to get list of users and validates status")
	public void user_sends_a_get_request_to_get_list_of_users_and_validates_status() {
		
		RestAssured.given()
		.baseUri("https://reqres.in")
		.basePath("/api/unknown")
		.when()
		.get()
		.then().statusCode(200).log().all();
		
	}
}
