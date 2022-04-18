package oop.game;

public class RollHelper {

    public static int getRoll(){
        // roll between 1-6, return the result
        // TODO: this is imperfect because there is a possibility of rolling zero
        return (int) (Math.random() * 6);
    }

    public static boolean isHigherRoll(int character1Roll, int character2Roll){
        return character1Roll > character2Roll;
    }
}
