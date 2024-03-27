package com.sportyshoe.RestAssuredScripts;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdateProduct {

	@Test
	public void updateShoeProduct() {
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/update-shoe")	
		.queryParam("id", "1103")
		.queryParam("image", "www.image.com")
		.queryParam("name", "Puma")
		.queryParam("category", "Sports")
		.queryParam("sizes", "5,6,7")
		.queryParam("price", "1500")
		.when().put()
		.then().statusCode(200)
		.body("shoe.name", Matchers.equalTo("Puma"))
		.body("shoe.sizes" ,Matchers.equalTo("5,6,7"))
		.log().all();
	}
}
