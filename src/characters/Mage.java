package oop.characters;

public class Mage extends Hero{

    public Mage(int hp, int attackDamage, String name) {
        super(hp, attackDamage, name);
    }

    public void printDialogue(String wordsToSay){
        System.out.println("boom");
    }
}
