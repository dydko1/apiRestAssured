package pl.card.service.test;

import io.restassured.response.Response;
import org.junit.Test;

public class F_GetMethod {

    private final ServiceHelper serviceHelper = new ServiceHelper();

    @Test
    public void getCardContents() {
        String endpoint = "/cocart/v1/get-cart";
        Response response = serviceHelper.sentGetRequest(endpoint);

        response.getBody().prettyPeek();
    }

    @Test
    public void countItems() {
        String endpoint = "/cocart/v1/count-items";
        Response response = serviceHelper.sentGetRequest(endpoint);

        response.getBody().print();
    }

    @Test
    public void restoreItemToCartWithParameters() {
        String endpoint = "/cocart/v1/item";
        String parameters = "?cart_item_key=a8baa56554f96369ab93e4f3bb068c22&return_cart=true";
        Response response = serviceHelper.sentGetRequest(endpoint + parameters);

        response.getBody().prettyPeek();
    }

    @Test
    public void restoreItemToCartBody() {
        String bodyRequest = "{\n" +
                "    \"cart_item_key\": \"a8baa56554f96369ab93e4f3bb068c22\",\n" +
                "    \"return_cart\": false\n" +
                "}";
        String endpoint = "/cocart/v1/item";

        Response response = serviceHelper.sentGetRequestBody(bodyRequest, endpoint);

        response.getBody().prettyPeek();
    }
}
