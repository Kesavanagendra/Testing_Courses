package restAssureScripts;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Script006PostmanAPIKey {

	@Test(priority = '1')
	public void postmanGetReq() {
		
		String pmapikey = "PMAK-65447daff6b22900315d1f53-3a7eed328be6720d75306bd35189e087ad";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key" , pmapikey )
		.when().get()
		.then().statusCode(200)
		.log().all();
	}
	
	@Test(priority = '2')
	public void extract_value_response() {
		
		String pmapikey = "PMAK-65447daff6b22900315d1f53-3a7eed328be6720d75306bd35189e087ad";
		String result = given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key" , pmapikey )
		.when().get()
		.then()
		.extract().path("workspaces[1].name");
		
		System.out.println("The name of the workspace extracted is "+result);
	}
	
	
	@Test(priority = '3')
	public void extract_response_JSONPath() {
		
		String pmapikey = "PMAK-65447daff6b22900315d1f53-3a7eed328be6720d75306bd35189e087ad";
		Response res = given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key" , pmapikey )
		.when().get()
		.then()
		.extract().response();
		
		JsonPath obj = new JsonPath(res.asString());
		
		System.out.println(obj.getString("workspaces[1]"));
	}
	
	
}
