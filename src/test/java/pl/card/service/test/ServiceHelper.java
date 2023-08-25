package pl.card.service.test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.GetPropertyValues;

import java.util.Map;

import static io.restassured.RestAssured.*;

public class ServiceHelper {

    GetPropertyValues getPropertyValues = new GetPropertyValues();
    private final String LOGIN = getPropertyValues.getPropValue("login");
    private final String PASSWORD = getPropertyValues.getPropValue("password");
    private final String BASE_URI = getPropertyValues.getPropValue("shopSeverURL");
    private final SampleRest SAMPLE_REST = new SampleRest();


    public void addItem(Integer productId, Integer quantity, Boolean returnCard, String endpoint) {
        Response response = given()
                .auth()
                .preemptive()
                .basic(LOGIN, PASSWORD)
                .queryParam("product_id", productId)
                .queryParam("quantity", quantity)
                .queryParam("return_cart", returnCard)
                .baseUri(BASE_URI)
                .post(endpoint);
    }

    public Response sendPostRequest(Map<String, Object> queryParamsBody, String endpoint) {
        SAMPLE_REST.response = given()
                .auth()
                .preemptive()
                .basic(LOGIN, PASSWORD)
                .queryParams(queryParamsBody)
                .baseUri(BASE_URI)
                .post(endpoint);

        return SAMPLE_REST.response;
    }

    public Response sendPostRequest(String body, String endpoint) {
        SAMPLE_REST.response = given()
                .auth()
                .preemptive()
                .basic(LOGIN, PASSWORD)
                .contentType(ContentType.JSON)
                .body(body)
                .baseUri(BASE_URI)
                .post(endpoint);

        return SAMPLE_REST.response;
    }

    public Response sentGetRequest(String endpoint) {
        return given()
                .auth()
                .preemptive()
                .basic(LOGIN, PASSWORD)
                .baseUri(BASE_URI)
                .get(endpoint);

        // return SAMPLE_REST.response;
    }

    public Response sentGetRequestBody(String body, String endpoint) {
        return given()
                .auth()
                .preemptive()
                .basic(LOGIN, PASSWORD)
                .contentType(ContentType.JSON)
                .body(body)
                .baseUri(BASE_URI)
                .get(endpoint);

        // return SAMPLE_REST.response;
    }

    public Response sendDeleteRequest(String endpoint){
        SAMPLE_REST.response = given()
                .auth()
                .preemptive()
                .basic(LOGIN, PASSWORD)
                .baseUri(BASE_URI)
                .delete(endpoint);

        return SAMPLE_REST.response;
    }

    public Response sendDeleteRequest(String body, String endpoint){
        SAMPLE_REST.response = given()
                .auth()
                .preemptive()
                .basic(LOGIN, PASSWORD)
                .body(body)
                .contentType(ContentType.JSON)
                .baseUri(BASE_URI)
                .delete(endpoint);

        return SAMPLE_REST.response;
    }
}


