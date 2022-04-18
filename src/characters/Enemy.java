package characters;

import characters.Character;

public class Enemy extends Character {

    public Enemy(int hp, int attackDamage, int defendValue) {

        super(hp, attackDamage,defendValue);
    }

    @Override
    public void attack() {
        System.out.println("Enemy Attack!");
    }

    public void spAttack(){
        System.out.println("Used Special Attack for " + spAttackDamage + " damage");
    }


}
