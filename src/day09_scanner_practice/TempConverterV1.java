package day09_scanner_practice;
import java.util.Scanner;

public class TempConverterV1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***** F to C Converter\nEnter the Fahrenheit to Degree");
        double fahrenheit = scan.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;

        System.out.println("In Irvine "+celsius+ "C at the outside.");


    }
}
