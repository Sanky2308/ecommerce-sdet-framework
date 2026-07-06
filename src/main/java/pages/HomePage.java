package pages;

public class HomePage {
    private final String url;

    public HomePage(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public boolean isApplicationUrlConfigured() {
        return url != null && !url.isBlank();
    }
}
