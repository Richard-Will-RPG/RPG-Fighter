package oop.characters;

public abstract class Character implements Attackable, Defendable {

    //    PROPERTIES ALL CHARACTERS SHARE
    protected int hp;
    protected int attackDamage = 0;
    protected int spAttackDamage = 20;
    protected int spDefend = 20;
    // isAttacker will help us keep track of who is the current attacker
    // defaults to false
    protected boolean isAttacker = false;

    public Character(int hp, int attackDamage) {
        this.hp = hp;
        this.attackDamage = attackDamage;
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
        this.attackDamage = attackDamage;
    }

    // isAttacker() and setAttacker() let us get and set the value of isAttacker
    public boolean isAttacker() {
        return isAttacker;
    }

    public void setAttacker(boolean attacker) {
        isAttacker = attacker;
    }

    //    BEHAVIORS THAT ALL CHARACTERS SHARE
    public int attack() {
        if (attackDamage > baseAttackDamage) {
            System.out.println("Attacked for " + attackDamage + " damage");
            return attackDamage;
        } else {
            System.out.println("Attacked for " + baseAttackDamage + " damage");
            return baseAttackDamage;
        }
    }

    public void spAttack(){
        System.out.println("Used Special Attack for " + spAttackDamage + " damage");
    }

    public void defend(){
        System.out.println("Defended " + baseDefense + " against the attack");
    }

    public void spDefend(){
        System.out.println("Special Defense of " + spDefend + " against attack");
    }

}
