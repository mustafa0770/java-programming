package day10_shorthand_operators;
import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your rent and month");
        double rent = scan.nextDouble();
        scan.nextLine(); //fix the bug. WORK AROUND
        String month = scan.next();
        System.out.println("Value: $"+rent);
        System.out.println("Month: "+month);


    }
}
