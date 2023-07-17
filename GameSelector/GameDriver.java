package GameSelector;

import java.util.Scanner;

public class GameDriver {
    static Scanner x = new Scanner(System.in);

    public static void main(String[] Ak) throws Exception {

        Bag bag = new  Bag();

        while (true) {
            System.out.println();
            System.out.println("What operation do you want to perform...");
            Thread.sleep(500);
            System.out.println("1. Add a Ball");
            Thread.sleep(500);
            System.out.println("2. Remove a Ball");
            Thread.sleep(500);
            System.out.println("3. Check Bag is Empty or Full");
            Thread.sleep(500);
            System.out.println("4. Show Which game can be played now");
            int choise = x.nextInt();

            switch (choise){
                case 1:{
                    bag.addBall(new Ball());
                    break;
                } case 2:{
                    bag.removeBall();
                    break;
                } case 3:{
                    bag.isBagEmpty();
                    break;
                } case 4:{
                    bag.showGame();
                    break;
                } default:{
                    System.out.println("Entered Invalid Operation choose again...");
                    Thread.sleep(500);
                    System.out.println("WISELY......");
                }
            }
        }
    }
}