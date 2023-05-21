package com.design.pattern.structural.proxy.website;

public class WebSiteProxy implements IWebSite {

    private String siteName;

    private WebSiteReal webSiteReal;

    public WebSiteProxy(String siteName) {
        this.siteName = siteName;
        webSiteReal = new WebSiteReal(this.siteName);
    }

    @Override
    public void access() {
        if (webSiteReal == null) {
            webSiteReal = new WebSiteReal(this.siteName);
        }
        webSiteReal.access();
    }
}
