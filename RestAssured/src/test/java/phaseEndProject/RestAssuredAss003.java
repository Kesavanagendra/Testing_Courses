package phaseEndProject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class RestAssuredAss003 {


	@Test()
	public void validateResponsebodyequalItems() {
		
		given().baseUri("https://petstore.swagger.io")
		.basePath("/v2/user/Uname001")
		.when().get()
		.then().statusCode(200)
		.log().all()
		.body("username" , equalTo("Uname001"),
				"email",equalTo("Positive@Attitude.com"),
				"userStatus" , equalTo(1));
		
	}
}
