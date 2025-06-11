package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class ReachabilityTest {
    @Test
    public void testJacksonVuln() throws Exception {
        System.out.println("[Test Code] Triggering Jackson deserialization vuln...");
        String json = "[\"java.lang.Exception\",\"Exploit\"]";
        ObjectMapper mapper = new ObjectMapper();
        Object obj = mapper.readValue(json, Object.class);
        System.out.println("Deserialized: " + obj);
    }
}
