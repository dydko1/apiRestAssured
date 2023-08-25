package pl.card.service.test;

import org.junit.Test;

public class G_GetMethod {

    private final ServiceHelper serviceHelper = new ServiceHelper();

    @Test
    public void getCardContents() {
        String endpoint = "/cocart/v1/get-cart";
        serviceHelper.sentGetRequest(endpoint);
    }
}
