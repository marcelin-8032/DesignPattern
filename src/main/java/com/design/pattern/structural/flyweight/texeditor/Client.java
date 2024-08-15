package com.design.pattern.structural.flyweight.texeditor;

class Client {

    public static void main(String[] args) {

        var characterFactory = new CharacterFactory();
        var character1 = characterFactory.getCharacter('A');
        character1.display("Arial");

        var character2 = characterFactory.getCharacter('B');
        character2.display("Times New Roman");

        var character3 = characterFactory.getCharacter('A');
        character3.display("Calibri");
    }
}
