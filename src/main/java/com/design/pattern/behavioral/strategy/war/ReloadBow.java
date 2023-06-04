package com.design.pattern.behavioral.strategy.war;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReloadBow implements IReloadable {
    @Override
    public void reload() {
        log.info(this.getClass().getTypeName()+"> take an arrow and place it in the bow");
    }
}
