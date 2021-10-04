// Joe Claborn
package Java.ClassWorkProblems;

import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int secretNum = (int) (Math.random() * 100) + 1;

            System.out.println(secretNum);
            System.out.print("Guess the secret number between 1 and 100: ");
            int guess = input.nextInt();
            int numInvalidTries = 0;

            while(guess != secretNum && numInvalidTries < 3) {
            if(guess < 1 || guess > 100) {
                numInvalidTries++;
                System.out.println("Read. The. Directions.");
                if(numInvalidTries == 3) {
                    System.out.println("This game is not for you. Exiting...");
                }
            } else if(numInvalidTries == 3) {
                 System.out.println("This game is not for you. Exiting...");
            } else if(guess < secretNum) {
                System.out.println("You're too low!");
            } else if(guess > secretNum) {
                System.out.println("You're too high!");
            }
            System.out.print("Guess again: ");
            guess = input.nextInt();
        }
        if(numInvalidTries < 3 && guess == secretNum) {
        System.out.println("You're correct! The answer was " + secretNum);
        }
        input.close();
    }
}