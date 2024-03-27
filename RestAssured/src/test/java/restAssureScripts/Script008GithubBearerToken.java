package restAssureScripts;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import io.restassured.response.*;
import org.testng.annotations.Test;


public class Script008GithubBearerToken {

	@Test(priority ='1')
	public void authorizationBearerToken() {
		
		Response res = given().baseUri("https://api.github.com")
		.basePath("/user/repos")
		.header("Authorization","Bearer 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")
		.when().get()
		.then().statusCode(200)
		.extract().response();
		
		 res.prettyPrint();
	}
	
	@Test(priority ='2')
	public void authorization_BearerToken_Specificrepo() {
		
		Response res = given().baseUri("https://api.github.com")
		.basePath("/repos/Kesavanagendra/project1")
		.header("Authorization","Bearer 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")
		.when().get()
		.then().statusCode(200)
		.extract().response();
		
		 res.prettyPrint();
	}
}
