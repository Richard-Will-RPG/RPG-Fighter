package game;

import characters.*;
import characters.Character;
import util.Input;

import java.util.Random;
import java.util.Scanner;

public class GameRunner {

    public static void main(String[] args) {
        System.out.println("Welcome! You have found yourself in a dual of fates.");
        System.out.println("");

        Rollable Character;

        String p1Roll = Input.getString("Player 1 (Enemy) attacks first.  Roll Player 1 for your attack (1-20):   ");
        int p1RollValue = Integer.valueOf(p1Roll);

        String p2Roll = Input.getString("Player 1 has initiated an attack of " + p1RollValue + ".  Player 2:  Roll for your defense (1-20):   ");
        int p2RollValue = Integer.valueOf(p2Roll);

        System.out.println("");
        System.out.println("Player 1 attacks for " + p1RollValue + ", and Player 2 defends for " + p2RollValue + "." );








//        if (gameStart.equalsIgnoreCase("warrior")) {
//            hero = new Warrior("Warrior");
//        } else if (gameStart.equalsIgnoreCase("knight")) {
//            hero = new Knight("Knight");
//        }else {
//            hero = new Mage(2000, 150, "zappy boi aka Samuel Moore");
//        }
//
//        hero.attack();

    }

//    public static void main(String[] args) {
//
//        Random random = new Random();
//
//        String heroName = Input.getString("Welcome! Please select a hero(Warrior/Knight): ");
//
//        Hero hero;
////        WE DONT KNOW WHICH HERO WILL BE CHOSEN UNTIL RUNTIME
//        if (heroName.equalsIgnoreCase("warrior")) {
//            hero = new Warrior("Warrior");
//        } else {
//            hero = new Knight("Knight");
//        }
//
////        WE DONT KNOW WHICH HERO ATTACKS UNTIL RUN TIME
//        hero.attack();
//
//        Enemy[] enemies = {new Zombie(), new Dragon()};
//
//        int randomIndex = random.nextInt(enemies.length);
//        Enemy enemyToAttack = enemies[randomIndex];
//
//        System.out.println(enemyToAttack.getClass().getName());
//
//
//
//
//
//    }


}
