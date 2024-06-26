package restAssureScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script009PaypalOAuth2 {
	
	String accessToken;

	@Test(priority = '1')
	public void getAccessToken() {
		
		String clientID = "ARusOV9piJu7WnUWqcEFKsaG36cWGUQymrb6zNg67evPQYXwNusFwdphkHSwhtC1vXZ-R4tU1OTmaJGg";
		String clinetSecret = "EJuqVbnoVWwHT7l4dhdRSQCIZDK0HUCUkVeQ51RufPlA4Fp2NIVJPaiB3V-H5mAyJyEXFZlenVyosRWO";
		
		Response res = RestAssured.given()
		.baseUri("https://api-m.sandbox.paypal.com")
		.basePath("/v1/oauth2/token")
		.auth().preemptive().basic(clientID, clinetSecret)
		.param("grant_type", "client_credentials")
		.when().post();
		
		Assert.assertEquals(res.statusCode(), 200);
		
		accessToken = res.getBody().path("access_token");
		
	}
	
	
	@Test(priority='2')
	public void paypalTestAPI()
	{
		Response res =	RestAssured.given()
		.baseUri("https://api-m.sandbox.paypal.com")
		.basePath("/v1/invoicing/invoices")
		.queryParam("page", "3")
		.queryParam("page_size", "4")
		.queryParam("total_count_required", true)
		.auth().oauth2(accessToken)
		.when().get();
	
		res.prettyPrint();
	}
}







/*
 package restassureScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

// Create credentials for https://developer.paypal.com/

// loginto the paypal webpage.
// go to developer dashboard -> bring cursor to your name --> click on dashboard
// make sure you have sandbox enabled.
// click on Apps & Credentials
// Click on Create an APP --> select Platform app > Click on Create APP

// Click on APIs and SDKs  --> click on Rest API
// Scroll down to postman section

// 

public class Script009PAyPalOauth2 {

	String  accessToken;
	
	@Test(priority='1')
	public void GetAccessToekn()
	{
String clientID = "ARusOV9piJu7WnUWqcEFKsaG36cWGUQymrb6zNg67evPQYXwNusFwdphkHSwhtC1vXZ-R4tU1OTmaJGg";
String clinetsecret = "EJuqVbnoVWwHT7l4dhdRSQCIZDK0HUCUkVeQ51RufPlA4Fp2NIVJPaiB3V-H5mAyJyEXFZlenVyosRWO";


              Response res = RestAssured.given()
            		  .baseUri("https://api-m.sandbox.paypal.com")
            		  .basePath("/v1/oauth2/token")
            		  .auth().preemptive().basic(clientID, clinetsecret)
            		  .param("grant_type", "client_credentials")
            		  .when().post();
              
             // res.prettyPrint();
              
              Assert.assertEquals(res.statusCode(), 200);
              
            // In the repsonse we got the token, fetch the token from repsonse body and save it in a string
              
              accessToken = res.getBody().path("access_token");
              
              System.out.println(accessToken);
              
	}
	
	
	@Test(priority='2')
	public void paypalTestAPI()
	{
	Response res =	RestAssured.given()
		.baseUri("https://api-m.sandbox.paypal.com")
		.basePath("/v1/invoicing/invoices")
		.queryParam("page", "3")
		.queryParam("page_size", "4")
		.queryParam("total_count_required", true)
		.auth().oauth2(accessToken)
		.when().get();
	
	res.prettyPrint();
		
		
		
		
		
		
	}

}
 */
