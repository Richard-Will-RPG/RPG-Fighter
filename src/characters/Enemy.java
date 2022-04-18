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

<<<<<<< HEAD

=======
    @Override
    public void roll() {

    }

    @Override
    public void compare() {

    }

    @Override
    public void defend() {

    }

    @Override
    public void spDefend() {

    }
>>>>>>> 0fd2ad5f8c7a4db57a3f6295a10765424700e482
}
