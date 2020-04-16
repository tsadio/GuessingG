import java.util.Random;
import java.util.Scanner;

public class GuessingG {
        public static void main (String [] args) {
            /**
             * This is a guessing game
             * the computer will randomly chose a number
             * between 1 and 10 included
             * it will as the user to guess the number
             * the user will have multiple chance until the
             * right number is entered
             */

            Scanner in = new Scanner(System.in);
            Random rand = new Random();
            int num;
            int myNum = 1 + rand.nextInt(10);
            System.out.println("I am thinking about a number between 1 and 10.");
            System.out.print("Can you guess it: ");
            num = in.nextInt();
            while (num > 10 || num < 1) {
                System.out.println("Wrong number. Enter a number between 1 - 10: ");
                num = in.nextInt();
            }
            while (num != myNum) {
                if (num < myNum) {
                    System.out.print("It is too low, try again: ");
                    num = in.nextInt();
                } else {
                    System.out.print("It is too high, try again: ");
                    num = in.nextInt();
                }
            }System.out.println("That is right! You are a good guesser.");
        }

}
