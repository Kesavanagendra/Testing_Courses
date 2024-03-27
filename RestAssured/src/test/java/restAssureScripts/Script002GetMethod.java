package restAssureScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script002GetMethod {

	@Test(enabled = false)
	public void httpGetMethod() {
		
		Response res =  RestAssured.get("https://reqres.in/api/users?page=2");
		
//		System.out.println(res.asString());
		System.out.println(res.getStatusCode());
		
		System.out.println(res.getBody().asString());
		
		System.out.println(res.getTime());
		
		System.out.println(res.getHeader("Content-Type"));
		
		int expecteedStatusCode = 200;
		int actualStatusCode = res.getStatusCode();
		
		Assert.assertEquals(expecteedStatusCode, actualStatusCode);
	}
	
	@Test
	public void GetmethodBDDStyle() {
		
		RestAssured
		.given()   // give input for test as precondition
		.baseUri("https://reqres.in/api/users")
		.queryParam("page", "2")
		.when().get()
		.then()
		.statusCode(200)    // this method validate if the response status code is 200 or not
		.log().all();    // fetch the response and print it on console
		
	}
	
}
