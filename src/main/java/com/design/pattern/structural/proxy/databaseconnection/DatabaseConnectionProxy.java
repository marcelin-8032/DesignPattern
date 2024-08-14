package com.design.pattern.structural.proxy.databaseconnection;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DatabaseConnectionProxy implements IDatabaseConnection {

    private RealDatabaseConnection realDatabaseConnection;

    private String userRole;

    public DatabaseConnectionProxy(String userRole) {
        this.userRole = userRole;
    }

    private void ensurePermission() {
        if (!"admin".equals(userRole)) {
            throw new SecurityException("Access denied. You do not have permission to access the database.");
        }
    }

    @Override
    public void connect() {
        if (realDatabaseConnection == null) {
            realDatabaseConnection = new RealDatabaseConnection();
        }
        log.info("Proxy: Checking permissions before connecting.");
        ensurePermission();
        realDatabaseConnection.connect();
    }

    @Override
    public void disconnect() {
        if (realDatabaseConnection != null) {
            realDatabaseConnection.disconnect();
        }
    }

    @Override
    public void executeQuery(String query) {
        log.info("Proxy: Logging query execution.");
        if (realDatabaseConnection == null) {
            realDatabaseConnection = new RealDatabaseConnection();
        }
        realDatabaseConnection.executeQuery(query);
    }
}
