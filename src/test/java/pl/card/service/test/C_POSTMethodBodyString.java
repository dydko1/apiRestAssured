package pl.card.service.test;

import org.junit.Test;

public class C_POSTMethodBodyString {
    private final ServiceHelper serviceHelper = new ServiceHelper();

    @Test
    public void addItemWithBodyString() {
        Integer productId = 142;
        Integer quantity = 100;
        Boolean returnCart = true;

        String bodyRequest = "{\n" +
                "    \"product_id\": " + productId + ",\n" +
                "    \"quantity\": " + quantity + ",\n" +
                "    \"return_cart\": " + returnCart + "\n" +
                "}";

        String endpoint = "/cocart/v1/add-item";

        serviceHelper.sendPostRequest(bodyRequest, endpoint);
    }

    @Test
    public void calculateItemWithBodyString() {


        String bodyRequest = "{\n" +
                "    \"calculate\":true\n" +
                "}";

        String endpoint = "/cocart/v1/calculate";

        serviceHelper.sendPostRequest(bodyRequest, endpoint);
    }
}
