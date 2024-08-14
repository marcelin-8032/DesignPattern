package com.design.pattern.structural.proxy.databaseconnection;


public interface IDatabaseConnection {

    void connect();

    void disconnect();

    void executeQuery(String query);
}
