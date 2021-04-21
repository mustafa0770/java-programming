package day28_loops;
import java.util.Random;
import java.util.Scanner;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();
        String password = "";

        for(int i = 1; i <=4; i++) {
            int index = random.nextInt(71); //random num 0 - 70
            System.out.print(source.charAt(index));
            //password += (source.charAt(index));
            //add the char to password variable using +=
            password = password + source.charAt(index);


            //System.out.print(random.nextInt(source.length()));
            //System.out.print(" ");
        }
        System.out.println("\nYour password = " + password);
    }
}
