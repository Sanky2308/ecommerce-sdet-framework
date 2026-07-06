package ui;

import config.ConfigManager;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest {

    @Test
    public void applicationUrlShouldBeConfigured() {
        HomePage homePage = new HomePage(ConfigManager.get("base.url"));

        if (!homePage.isApplicationUrlConfigured()) {
            throw new AssertionError("Application base URL is not configured");
        }
    }
}
