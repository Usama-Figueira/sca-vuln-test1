package com.example;

public class DiService {
    public void execute() {
        System.out.println("[DI] Executing vulnerable jsoup code...");
        DiVuln.execute();
    }
}
