package day10_shorthand_operators;
import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather today?");
        //String weather = scan.next(); // only one word
        String weather = scan.nextLine(); // multiple words
        System.out.println("Today outside will be very "+weather+".");


    }
}
