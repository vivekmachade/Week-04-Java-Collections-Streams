package com.javacollectionstreams.reflections.advanced.dependencyinjection;

public class Client {
    @Inject
    public Service service;

    public void run() {
        service.execute();
    }
}
