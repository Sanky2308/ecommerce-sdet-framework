package api;

import org.testng.annotations.Test;

public class ApiEndpointTest {

    @Test
    public void productListEndpointShouldBeDefined() {
        if (!ApiEndpoints.PRODUCTS_LIST.equals("/api/productsList")) {
            throw new AssertionError("Product list endpoint is incorrect");
        }
    }
}
