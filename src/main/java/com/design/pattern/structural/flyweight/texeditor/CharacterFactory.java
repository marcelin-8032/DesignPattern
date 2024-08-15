package com.design.pattern.structural.flyweight.texeditor;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
class CharacterFactory {

    private Map<java.lang.Character, Character> characterCache;

    public CharacterFactory() {
        characterCache = new HashMap<>();
    }

    public Character getCharacter(char c) {
        Character character = characterCache.get(c);
        if (character == null) {
            character = new ConcreteCharacter(c);
            characterCache.put(c, character);
        }
        return character;
    }
}
