package com.design.pattern.structural.proxy.website;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProxyMainClass {

    public static void main(String[] args) {
        IWebSite webSite = new WebSiteProxy("www.yahoo.fr");
        webSite.access();

        log.info("");

        webSite.access();
    }
}
