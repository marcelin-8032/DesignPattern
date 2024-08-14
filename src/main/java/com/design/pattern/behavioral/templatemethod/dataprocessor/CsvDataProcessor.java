package com.design.pattern.behavioral.templatemethod.dataprocessor;

public class CsvDataProcessor extends DataProcessor{

    @Override
    protected void loadData() {
        System.out.println("Loading data from CSV...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing CSV data...");
    }
}
