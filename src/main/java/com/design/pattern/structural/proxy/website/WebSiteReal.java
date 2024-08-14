package com.design.pattern.structural.proxy.website;

import lombok.extern.slf4j.Slf4j;

@Slf4j
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
        log.info("Load from the site: " + siteName);
    }
}
