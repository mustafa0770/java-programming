package day09_scanner_practice;
import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        //create scanner object
        Scanner scan = new Scanner(System.in);
        //ask question
        System.out.println("Enter 2 Numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = num1+num2;
        System.out.println("Total value of 2 number: "+result);

    }
}
