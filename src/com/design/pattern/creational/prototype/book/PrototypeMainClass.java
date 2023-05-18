package com.design.pattern.creational.prototype.book;

public class PrototypeMainClass {

    public static void main(String[] args) throws CloneNotSupportedException {
        var bs=new BookShop();
        bs.setShopName("Nathalia shop");
        bs.loadData();

        var bs1=bs.clone();
        bs.getBooks().remove(2);
        bs1.setShopName("Mohsen shop");

        System.out.println(bs);
        System.out.println(bs1);

    }

}
