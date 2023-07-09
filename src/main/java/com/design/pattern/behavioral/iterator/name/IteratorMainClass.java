package com.design.pattern.behavioral.iterator.name;

public class IteratorMainClass {

    public static void main(String[] args) {
        var collectionsOfNames = new CollectionsOfNames();

        for (Iterator iter = collectionsOfNames.getIterator(); iter.hasNext(); ) {
            var name = (String) iter.next();
            System.out.println("Name: " + name);
        }
    }
}
