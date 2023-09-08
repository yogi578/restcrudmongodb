import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
//import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SampleTest {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "http://localhost:8089";
    }

    @Test
    public void getRequest() {
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/employee")
                .then()
                .extract().response();

        Assertions.assertEquals(200, response.statusCode());
        System.out.println("------------------------------- : Response Start : ------------------------------- ");
        System.out.println(response.asPrettyString());
        System.out.println("------------------------------- : Response End : ------------------------------- ");
        //System.out.println("Executed sample test!");
    }
}
