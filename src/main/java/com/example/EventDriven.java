package com.example;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

public class EventDriven {
    private static final EventBus bus = new EventBus();

    public static void publishEvent(String message) {
        bus.register(new EventDriven());
        bus.post(message);
    }

    @Subscribe
    public void handle(String message) {
        System.out.println("[Event] Triggering BouncyCastle padding oracle vuln...");
        EventVuln.run();
    }
}
