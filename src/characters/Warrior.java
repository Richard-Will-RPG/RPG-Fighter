package oop.characters;

import oop.characters.Character;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(150, 25, name);
    }

    public void printDialogue(String wordsToSay){
        System.out.println("boom");
    }

}
