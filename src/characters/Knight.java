package oop.characters;

public class Knight extends Hero{

    public Knight(String name) {
        super(150, 9, name);
    }

    @Override
    public void spAttack(){
        System.out.println("Used Knight's Special Attack for " + spAttackDamage + " damage");
    }

    public void printDialogue(String wordsToSay){
        System.out.println(wordsToSay);
    }

}
