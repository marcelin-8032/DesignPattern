package com.design.pattern.creational.prototype.book;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrototypeMainClass {

    public static void main(String[] args) throws CloneNotSupportedException {
        var bs = new BookShop();
        bs.setShopName("Nathalia shop");
        bs.loadData();

        var bs1 = bs.clone();
        bs.getBooks().remove(2);
        bs1.setShopName("Mohsen shop");

        log.info("bs", bs);
        log.info("bs1", bs1);
    }

}
