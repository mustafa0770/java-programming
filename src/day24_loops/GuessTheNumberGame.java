package day24_loops;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner scan = new Scanner(System.in);
        int secretNumber = randomNum.nextInt(101);
        int guessingNumber = 0;
        do{
            System.out.println("Guess the secret number:");
            guessingNumber = scan.nextInt();
            if (guessingNumber > secretNumber){
                System.out.println("Number that you entered is too large");
            } else {
                System.out.println("Number that you entered is too small");
            }
        } while (secretNumber != guessingNumber);
        System.out.println("Congrats you got the secret number");

    }
}
