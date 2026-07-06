package ui;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import config.ConfigManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageUiTest {

    @Test
    public void userShouldOpenHomePage() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions().setHeadless(true)
            );

            Page page = browser.newPage();
            page.navigate(ConfigManager.get("base.url"));

            String title = page.title();

            Assert.assertTrue(
                    title.toLowerCase().contains("automation"),
                    "Expected page title to contain automation but found: " + title
            );

            browser.close();
        }
    }
}