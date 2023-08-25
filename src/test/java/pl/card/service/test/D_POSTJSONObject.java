package pl.card.service.test;

import org.json.JSONObject;
import org.junit.Test;

public class D_POSTJSONObject {
    private final ServiceHelper serviceHelper = new ServiceHelper();

    @Test
    public void addItemBodyJsonObject() {
        JSONObject bodyRequest = new JSONObject();
        bodyRequest
                .put("product_id", 140)
                .put("quantity", 42)
                .put("return_cart", true);

        String endpoint = "/cocart/v1/add-item";

        serviceHelper.sendPostRequest(bodyRequest.toString(), endpoint);
    }

    @Test
    public void calculateItemBodyJsonObject() {
        JSONObject bodyRequest = new JSONObject();
        bodyRequest
                .put("calculate", true);


        String endpoint = "/cocart/v1/calculate";

        serviceHelper.sendPostRequest(bodyRequest.toString(), endpoint);
    }
}
