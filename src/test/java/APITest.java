import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.net.http.HttpResponse;

public class APITest {
    @Test
    void trelloAPITest(){

        RestAssured.baseURI ="https://api.trello.com/1/boards/";
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");
        request.body(body);
        Response response = RestAssured.post();

        System.out.println("Status Code : " + response.getStatusCode());
        System.out.println("Response : " + response.asString());
        System.out.println("Body : " + response.getBody());
    }
}
