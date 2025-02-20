package com.javacollectionstreams.annotations.usedesprecated;

public class Main {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        api.oldFeature(); // Should show a warning during compilation
        api.newFeature();
    }
}