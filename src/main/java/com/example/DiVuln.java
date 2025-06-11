package com.example;

import org.jsoup.Jsoup;

public class DiVuln {
    public static void execute() {
        String maliciousInput = "<img src=x onerror=alert('XSS')>";
        System.out.println("JSoup output: " + Jsoup.clean(maliciousInput, "", org.jsoup.safety.Safelist.none(), new org.jsoup.nodes.Document.OutputSettings().prettyPrint(false)));
    }
}
