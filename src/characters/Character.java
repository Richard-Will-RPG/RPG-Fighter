package characters;

<<<<<<< HEAD
public abstract class Character implements Attackable, Defendable {
=======
import util.Input;

public abstract class Character implements Attackable, Defendable, Rollable {
>>>>>>> 0fd2ad5f8c7a4db57a3f6295a10765424700e482

    //    PROPERTIES ALL CHARACTERS SHARE
    protected int hp;
    protected int attackDamage = 0;
    protected int spAttackDamage = 20;
    protected int defendValue;
    protected int spDefendValue = 25;


<<<<<<< HEAD
    public Character(int hp, int attackDamage, int defendValue) {
        this.hp = hp;
        this.attackDamage = attackDamage;
        this.defendValue = defendValue;
=======
    public Character(int hp, int attackDamage) {
        this.hp = hp;
        this.attackDamage = attackDamage;

>>>>>>> 0fd2ad5f8c7a4db57a3f6295a10765424700e482
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {

        this.hp = hp;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = spAttackDamage;
    }



    //    BEHAVIORS THAT ALL CHARACTERS SHARE
    public void attack() {
        if (attackDamage > baseAttackDamage) {
            System.out.println("Attacked for " + attackDamage + " damage");
        } else {
            System.out.println("Attacked for " + baseAttackDamage + " damage");
        }
    }

    @Override
    public void defend() {

        System.out.println("Defense used against attack");
    }
    @Override
    public void spDefend() {
        System.out.println("Special defense used against attack");
    }
}
