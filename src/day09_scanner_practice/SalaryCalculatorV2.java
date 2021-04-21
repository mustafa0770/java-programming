package day09_scanner_practice;

public class SalaryCalculatorV2 {
    public static void main(String[] args) {
        System.out.println("***** Enter Hourly Rate *****");
        double hourlyRate = 50;
        double weeklyPay = hourlyRate * 40;
        double monthlyPay = weeklyPay * 52/12; //weekly pay *4
        double annualPay = monthlyPay *12;

        System.out.println("Weekly pay:  $"+weeklyPay);
        System.out.println("Monthly pay: $"+monthlyPay);
        System.out.println("Annual pay:  $"+annualPay);

    }
}
