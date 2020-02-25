package api.dog.config;/* Created by user on 21.02.20 */

import io.restassured.RestAssured;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeAll;

public class TestConfig {
    private static final String basePath = "/api/";
    private static final String baseUri = "https://dog.ceo";

    @BeforeAll
    public static void setup() {

        RestAssured.baseURI = baseUri;
        RestAssured.basePath = basePath;

        RequestSpecification requestSpecification = new RequestSpecBuilder().setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON).build();

        ResponseSpecification responseSpecification = new ResponseSpecBuilder().expectStatusCode(200).build();

        RestAssured.requestSpecification = requestSpecification;
        RestAssured.responseSpecification = responseSpecification;


    }
}