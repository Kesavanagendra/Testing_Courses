package com.sportyshoe.RestAssuredScripts;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

	public class GetUsers {

	@Test
	public void getAllRegisteredUsers() {
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-users")
		.when().get()
		.then().statusCode(200)
		.body("code", Matchers.equalTo(101))
		.log().all();
	}
}
