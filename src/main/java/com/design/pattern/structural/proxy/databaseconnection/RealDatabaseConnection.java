package com.design.pattern.structural.proxy.databaseconnection;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealDatabaseConnection implements IDatabaseConnection {

    @Override
    public void connect() {
        log.info("Connecting to the database...");
    }

    @Override
    public void disconnect() {
        log.info("Disconnecting from the database...");
    }

    @Override
    public void executeQuery(String query) {
        log.info("Executing query: " + query);
    }
}
