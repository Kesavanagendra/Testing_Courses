package com.sportyshoe.RestAssuredScripts;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class AddShoeProduct {

	@Test(priority = '1')
	public void addProduct() {
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/add-shoe")	
		.queryParam("id", "1103")
		.queryParam("image", "www.image.com")
		.queryParam("name", "Nike")
		.queryParam("category", "Running")
		.queryParam("sizes", "5,6,7")
		.queryParam("price", "1000")
		.when().post()
		.then().statusCode(200)
		.body("shoe", Matchers.hasEntry("category","Running"))
		.log().all();
	}
}
