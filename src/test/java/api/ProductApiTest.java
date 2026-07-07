package api;

import config.ConfigManager;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductApiTest {

    @Test
    public void userShouldGetProductsList() {
        String responseBody =
                RestAssured
                        .given()
                        .baseUri(ConfigManager.get("api.base.url"))
                        .when()
                        .get(ApiEndpoints.PRODUCTS_LIST)
                        .then()
                        .statusCode(200)
                        .extract()
                        .asString();

        Assert.assertTrue(
                responseBody.contains("products"),
                "Expected products response to contain products key"
        );
    }
}