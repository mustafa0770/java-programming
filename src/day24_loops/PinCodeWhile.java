package day24_loops;
import java.util.Scanner;

public class PinCodeWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPinCode = 12434;
        int pinCode;
        do {
            System.out.println("Enter pinCode: ");
            pinCode = scan.nextInt();
        } while (secretPinCode!= pinCode);
        System.out.println("Welcome to your account!");
    }
}
