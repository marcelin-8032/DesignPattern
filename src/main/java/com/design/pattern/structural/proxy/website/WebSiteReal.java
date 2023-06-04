package com.design.pattern.structural.proxy.website;

public class WebSiteReal implements IWebSite {

    private String siteName;

    public WebSiteReal(String siteName) {
        this.siteName = siteName;
    }

    @Override
    public void access() {
        loadFromTheSite(this.siteName);
    }

    private void loadFromTheSite(String siteName) {
        System.out.println("Load from the site: " + siteName);
    }




}
