package oop.characters;

public interface Attackable {

    int baseAttackDamage = 10;

    // we made attack return an int which we subtract from the defender's health
    int attack();
    // TODO: make spAttack() return an int
    void spAttack();
}
