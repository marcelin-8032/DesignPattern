package com.design.pattern.structural.proxy.databaseconnection;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DataBaseClient {

    public static void main(String[] args) {
        try {
            // User with appropriate permissions
            IDatabaseConnection adminConnection = new DatabaseConnectionProxy("admin");
            adminConnection.connect();
            adminConnection.executeQuery("SELECT * FROM users");
            adminConnection.disconnect();

            // User without appropriate permissions
            IDatabaseConnection guestConnection = new DatabaseConnectionProxy("guest");
            guestConnection.connect();  // Should throw an exception
        } catch (SecurityException e) {
            log.error(e.getMessage());
        }


        //using real database connection

        IDatabaseConnection databaseConnection = new RealDatabaseConnection();
        databaseConnection.connect();
        databaseConnection.executeQuery("something");
        databaseConnection.disconnect();
    }
}
