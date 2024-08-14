package com.design.pattern.behavioral.templatemethod.dataprocessor;

public abstract class DataProcessor {

    // Abstract methods to be implemented by subclasses

    public final void processData1() {
        loadData();
        processData();
        saveData();
    }

    protected abstract void loadData();

    protected abstract void processData();

    // Concrete method
    protected void saveData() {
        System.out.println("Saving data...");
    }

    public static void main(String[] args) {
        System.out.println("CsvDataProcessor");
        DataProcessor dataProcessor = new CsvDataProcessor();
        dataProcessor.processData1();

        System.out.println("JsonDataProcessor");
        DataProcessor dataProcessor2 = new JsonDataProcessor();
        dataProcessor.processData1();
    }
}
