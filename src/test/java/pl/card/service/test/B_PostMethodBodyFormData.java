package pl.card.service.test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class B_PostMethodBodyFormData {

    private final ServiceHelper serviceHelper = new ServiceHelper();

    @Test
    public void addItemWithBodyFormData() {
        Integer productId = 142;
        Integer quantity = 81;
        Boolean returnCard = true;

        String endpoint = "cocart/v1/add-item";

        serviceHelper.addItem(productId, quantity, returnCard, endpoint);

    }

    @Test
    public void task2() {
        Integer productId = 142;
        Integer quantity = 82;
        Boolean returnCard = true;

        Map<String, Object> queryParamsBodyAddItem = new HashMap<>();
        queryParamsBodyAddItem.put("product_id", productId);
        queryParamsBodyAddItem.put("quantity", quantity);
        queryParamsBodyAddItem.put("return_cart", returnCard);

        String endpointAddItem = "/cocart/v1/add-item";

        serviceHelper.sendPostRequest(queryParamsBodyAddItem, endpointAddItem);
    }

    @Test
    public void taskUpdate() {
        Integer productId = 142;
        Integer quantity = 990;
        Boolean returnCard = true;

        Map<String, Object> queryParamsBodyAddItem = new HashMap<>();
        queryParamsBodyAddItem.put("product_id", productId);
        queryParamsBodyAddItem.put("quantity", quantity);
        queryParamsBodyAddItem.put("return_cart", returnCard);
        queryParamsBodyAddItem.put("cart_item_key","a8baa56554f96369ab93e4f3bb068c22");

        String endpointAddItem = "/cocart/v1/item";

        serviceHelper.sendPostRequest(queryParamsBodyAddItem, endpointAddItem);
    }
}
