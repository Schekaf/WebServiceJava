import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.testng.annotations.Test;

import java.net.http.HttpResponse;

public class APITest {
    @Test
    void trelloAPITest(){
        Response response = RestAssured.get("https://api.trello.com/1/actions/1");
        System.out.println("Status Code : " + response.getStatusCode());
        System.out.println("Response : " + response.asString());
        System.out.println("Body : " + response.getBody());
    }
}
