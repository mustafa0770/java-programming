package day36_methods_with_return;

import java.util.Random;

public class Info {
    public static void main(String[] args) {
        System.out.println("Name: " +fullName());
        System.out.println("Is he Married: " +isMarried());
        System.out.println("Age: " +getAge());
        System.out.println("Birth year: " +getRandomYear());
    }
    public static String fullName(){
        return "Mustafa Dovletmammedov";
    }
    public static boolean isMarried(){
        return false;
    }
    public static int getAge(){
        return 24;
    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}
