package database;

import org.testng.annotations.Test;

public class DatabaseSmokeTest {

    @Test
    public void databaseLayerPlaceholderShouldRun() {
        String databaseLayer = "JDBC validation layer placeholder";

        if (databaseLayer.isBlank()) {
            throw new AssertionError("Database layer placeholder is blank");
        }
    }
}
