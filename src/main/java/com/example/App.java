package com.example;

public class App {
    public static void main(String[] args) {
        if (Config.FEATURE_FLAG) {
            System.out.println("[Feature Flag] Executing vulnerable commons-collections code...");
            FeatureFlagVuln.run();
        }

        DiService service = DiContainer.getService();
        service.execute();

        EventDriven.publishEvent("trigger");

        System.out.println("App execution complete.");
    }
}
