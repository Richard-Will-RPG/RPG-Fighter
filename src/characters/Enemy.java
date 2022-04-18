package oop.characters;

import oop.characters.Character;

public class Enemy extends Character {

    public Enemy(int hp, int attackDamage) {
        super(hp, attackDamage);
    }

    public void spAttack(){
        System.out.println("Used Special Attack for " + spAttackDamage + " damage");
    }

}
