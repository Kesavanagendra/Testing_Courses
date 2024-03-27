package com.sportyshoe.RestAssuredScripts;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteProduct {

	@Test
	public void deleteShoeProduct() {
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/delete-shoe")	
		.queryParam("id", "1103")
		.when().delete()
		.then().statusCode(200)
		.body("message", Matchers.equalTo("Shoe with ID 1103 Deleted Successfully."))
		.log().all();
	}
}
