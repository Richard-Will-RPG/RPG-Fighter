package oop.game;

import oop.characters.*;
import oop.characters.Character;
import util.Input;

public class GamePlay {

    // initGame is what we call an 'orchestration method'
    // that is, it is responsible for pulling together all the pieces and
    // starting the actual game
    public static void initGame(){

        // get the hero type (knight, warrior, etc)
        Character hero = getUserCharacter();
        // instantiate a new opponent
        Character opponent = new Zombie();

        // roll to see who is the first attacker
        int heroFirstRoll = RollHelper.getRoll();
        int opponentFirstRoll = RollHelper.getRoll();

        if (heroFirstRoll > opponentFirstRoll){
            hero.setAttacker(true);
        } else {
            opponent.setAttacker(true);
        }

        // once we set the first attacker, then play the game until one character has no health remaining
        do{
            GamePlay.takeTurn(hero, opponent);
        }while(hero.getHp() > 0 && opponent.getHp() > 0);
    }

    public static Character getUserCharacter(){
        String heroChoice = Input.getString("Welcome! Please select a hero(Warrior/Knight): ");
        Character hero;
        if (heroChoice.equalsIgnoreCase("warrior")) {
            hero = new Warrior("Warrior");
        } else if (heroChoice.equalsIgnoreCase("knight")) {
            hero = new Knight("Knight");
        } else {
            hero = new Mage(2000, 150, "zappy boi aka Samuel Moore");
        }
        return hero;
    }

    public static void takeTurn(Character hero, Character opponent){
        // it's nice to let the user know who the current attacker is!
        System.out.println("**********************************************************");
        System.out.println("The attacker is currently: " + (hero.isAttacker() ? "the hero" : "the opponent"));

        // attack for the turn!
        turnAttack(hero, opponent);

        // whoever the attacker is, they are now the defender and likewise
        hero.setAttacker(!hero.isAttacker());
        opponent.setAttacker(!opponent.isAttacker());
    }

    public static void turnAttack(Character hero, Character opponent){

        // get the attack/defense roll
        int heroRoll = RollHelper.getRoll();
        int opponentRoll = RollHelper.getRoll();
        System.out.println("Hero's roll: " + heroRoll);
        System.out.println("Opponent's roll: " + opponentRoll);

        // if the hero is the attacker, then compare rolls and attack
        if (hero.isAttacker()){
            System.out.println("Hero is attacking....");
            // the attack only works if the hero's roll is higher than the opponent's
            if (RollHelper.isHigherRoll(heroRoll, opponentRoll)){
                System.out.println("Hero's attack was successful!");
                // TODO: the final attack value should be equal to the hero's attack minus the opponent's defense
                opponent.setHp(opponent.getHp() - (hero.attack()));
                System.out.println("Opponent's Remaining HP: " + opponent.getHp());
            }
        } else{ // if the opponent is the attacker, compare rolls and attack
            System.out.println("Opponent is attacking...");
            // the attack only works if the opponent's roll is higher than the hero's
            if (RollHelper.isHigherRoll(opponentRoll, heroRoll)){
                System.out.println("Opponent's attack was successful!");
                // TODO: the final attack value should be equal to the opponent's attack minus the hero's defense
                opponent.setHp(hero.getHp() - opponent.attack());
                System.out.println("Hero's Remaining HP: " + hero.getHp());
            }
        }
    }
}
