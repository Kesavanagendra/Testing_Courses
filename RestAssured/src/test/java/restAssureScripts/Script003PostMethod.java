package restAssureScripts;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Script003PostMethod {

	@Test
	public void postMethod() {
		
		HashMap<String , String> map = new HashMap<>();
		map.put("name", "John");
		map.put("job", "Tester");
		
		RestAssured
		.given().baseUri("https://reqres.in")
		.basePath("/api/users")
		.contentType("application/json")    // what type of content body we are sending - JSON
		.body(map)
		.when().post()
		.then().statusCode(201)
		.log().all();
		
	}
}
