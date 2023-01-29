package com.designpattern.creational.factory;

/*In the Factory pattern, we don't expose the creation logic to the client
and refer the created object using a standard interface.
The Factory Pattern is also known a Virtual Constructor.
 */


 class FactoryPatternMainClass {

    public static void main(String[] args) {
        var professionFactory = new ProfessionFactory();
        Profession doc = professionFactory.getProfession("Doctor");
        doc.print();
    }
}
