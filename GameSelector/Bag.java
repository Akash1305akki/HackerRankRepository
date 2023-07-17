package GameSelector;

import java.util.Scanner;

public class Bag {
    static Scanner y = new Scanner(System.in);
    private static Ball ball = new Ball();
    static boolean isEmpty = true;

    public static void addBall(Ball b)throws Exception{

        System.out.println("\t a. Basket Ball");
        Thread.sleep(300);
        System.out.println("\t b. Tennis Ball");
        String s = y.next();
        char bChoise = s.charAt(0);

        if (bChoise=='a'||bChoise=='A'){
            b.setRadius(4.725);
            isEmpty = false;
        } else if (bChoise=='b'||bChoise=='B') {
            b.setRadius(1.35);
            isEmpty = false;
        }else {
            Thread.sleep(500);
            System.out.println("Entered Wrong Option choose the operation again..");
        }

        double size = b.getRadius();
        Bag.ball.setRadius(size);
    }

    public static void removeBall() throws Exception{
        if (isEmpty == false) {
            System.out.println("Emptying the Bag...");
            Thread.sleep(500);
            ball.setRadius(0);
            isEmpty =true;
            System.out.println("Bag is Empty now...");
        }else {
            Thread.sleep(500);
            System.out.println("The Bag is Alredy Empty...");
            Thread.sleep(500);
            System.out.println("Fill With any 1 of the Ball...");
        }
    }

    public static void isBagEmpty() throws Exception{
        if (isEmpty == true){
            System.out.print("--------");
            Thread.sleep(200);
            System.out.print("The ");
            Thread.sleep(200);
            System.out.print("Bag ");
            Thread.sleep(200);
            System.out.print("is ");
            Thread.sleep(200);
            System.out.print("Empty ");
            Thread.sleep(200);
            System.out.println("--------");
        } else {
            System.out.print("--------");
            Thread.sleep(200);
            System.out.print("The ");
            Thread.sleep(200);
            System.out.print("Bag ");
            Thread.sleep(200);
            System.out.print("is ");
            Thread.sleep(200);
            System.out.print("Full ");
            Thread.sleep(200);
            System.out.println("--------");
        }
    }

    public static void showGame() throws Exception{

        double gameChoise = ball.getRadius();
        if (gameChoise == 4.725){
            Tennis g = new Tennis();
        } else if (gameChoise==1.35) {
            BB g = new BB();
        }else {
            Thread.sleep(500);
            System.out.println("First Add any 1 Ball to the Bag");
        }
    }
}