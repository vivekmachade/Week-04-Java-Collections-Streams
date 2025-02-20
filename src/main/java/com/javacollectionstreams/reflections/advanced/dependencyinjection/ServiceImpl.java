package com.javacollectionstreams.reflections.advanced.dependencyinjection;

public class ServiceImpl implements Service {
    @Override
    public void execute() {
        System.out.println("Service Executed!");
    }
}
