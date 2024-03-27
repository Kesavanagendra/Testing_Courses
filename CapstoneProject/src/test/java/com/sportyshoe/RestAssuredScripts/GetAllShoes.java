package com.sportyshoe.RestAssuredScripts;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllShoes {

	@Test()
	public void getAllShoes() { 
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-shoes")
		.when().get()
		.then().statusCode(200)
		.body("shoes.id[0]", Matchers.equalTo(101))
		.log().all();
	}
}
