package steps;

import org.hamcrest.Matchers;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;

public class CapstoneProjectSteps {

	@Given("User sends a Get Request to retrieve the list of products")
	public void user_sends_a_get_request_to_retrieve_the_list_of_products() {
	    
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-shoes")
		.when().get()
		.then().statusCode(200)
		.body("shoes.id[0]", Matchers.equalTo(101))
		.log().all();
		
	}

	@Given("User sends a Get Request to retrieve the all registered users")
	public void user_sends_a_get_request_to_retrieve_the_all_registered_users() {
	    
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-users")
		.when().get()
		.then().statusCode(200)
		.body("code", Matchers.equalTo(101))
		.log().all();
		
	}

	@Given("User sends a Post Request to add the product.")
	public void user_sends_a_post_request_to_add_the_product() {
	    
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

	@Given("User sends a Put Request to update the product details")
	public void user_sends_a_put_request_to_update_the_product_details() {
	    
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

	@Given("User sends a Delete Request to delete the product")
	public void user_sends_a_delete_request_to_delete_the_product() {
	    
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
