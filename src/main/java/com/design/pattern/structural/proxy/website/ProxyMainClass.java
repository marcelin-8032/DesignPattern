package com.design.pattern.structural.proxy.website;

public class ProxyMainClass {

    public static void main(String[] args) {
        IWebSite webSite = new WebSiteProxy("www.yahoo.fr");
        webSite.access();

        System.out.println("");

        webSite.access();
    }
}
