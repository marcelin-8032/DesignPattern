package com.design.pattern.structural.flyweight.texeditor;


import lombok.extern.slf4j.Slf4j;

@Slf4j
class ConcreteCharacter implements Character {

    private char character;

    public ConcreteCharacter(char character) {
        this.character = character;
    }

    @Override
    public void display(String font) {
        log.info("Character: " + character + ", Font: " + font);
    }
}
