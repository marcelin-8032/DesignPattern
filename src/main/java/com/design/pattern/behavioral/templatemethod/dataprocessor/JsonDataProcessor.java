package com.design.pattern.behavioral.templatemethod.dataprocessor;

public class JsonDataProcessor extends DataProcessor {

    @Override
    protected void loadData() {
        System.out.println("Loading data from JSON...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing JSON data...");
    }
}