package day09_scanner_practice;
import java.util.Scanner;

public class SalaryCalculatorV1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate:");
        double hourlyPay = scan.nextDouble();
        double weeklyPay = hourlyPay*40;
        double monthlyPay = weeklyPay*4;
        double annualRate = monthlyPay*12;
        System.out.println("***** Enter Hourly Rate *****");
        System.out.println("Weekly:  $"+weeklyPay);
        System.out.println("Monthly: $"+monthlyPay);
        System.out.println("Annual:  $"+annualRate);
    }
}
