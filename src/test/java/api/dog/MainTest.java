package api.dog;/* Created by user on 21.02.20 */

import api.dog.config.TestConfig;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class MainTest extends TestConfig {

    @Test
    public void getAllBreeds() {
        given()
                .when().get(Endpoints.LIST_ALL_BREEDS)
                .then()
                .body(ResponseMessage.getSTATUS(), equalTo(ResponseMessage.getSuccessStatus()));
    }
//    TODO: Do I have to provide the negative validation??? Issue should be discussed
//    @Test
//    public void getErrorOfAllBreeds() {
//        given()
//                .when().get(Endpoints.getListAllBreeds() + "gg")
//                .then()
//                .statusCode(404)
//                .body(ResponseMessage.getSTATUS(), equalTo(ResponseMessage.getSuccessStatus()));
//    }

    @Test
    public void getRandomImage() {
        given()
                .when().get(Endpoints.RANDOM_IMAGE)
                .then()
                .body(ResponseMessage.getSTATUS(), equalTo(ResponseMessage.getSuccessStatus()));
    }

    @Test
    public void getImageByBreed() {
        given()
                .when().get(Endpoints.BY_BREED)
                .then()
                .body(ResponseMessage.getSTATUS(), equalTo(ResponseMessage.getSuccessStatus()));
    }

    @Test
    public void getBySubBreed() {
        given()
                .when().get(Endpoints.BY_SUB_BREED)
                .then()
                .body(ResponseMessage.getSTATUS(), equalTo(ResponseMessage.getSuccessStatus()));
    }
}
