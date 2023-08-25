package pl.card.service.test;

import net.minidev.json.JSONObject;
import org.junit.Test;

import static utils.JsonRequestBodyHelper.getJsonFromFile;

public class E_POST_Method_Body_FROM_FILE {
    private final ServiceHelper serviceHelper = new ServiceHelper();

    @Test
    public void addITemBodyFromFile() {
        JSONObject bodyRequest = getJsonFromFile("request-shop-add-item-tocatd", "add_item_body");

        String endpoint = "/cocart/v1/add-item";
        serviceHelper.sendPostRequest(bodyRequest.toJSONString(), endpoint);

    }
}
