package day23_string_manipulation_while_loop;

import java.util.Locale;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "he ll o w or ld";
        System.out.println(word.toUpperCase().toLowerCase().length());

        // remove spaces first then print everything uppercase
        System.out.println(word.replace(" ","").toUpperCase());

        //selenium.findElement(By.id("hi)).click();

        String city = "kabul";

        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1));
        String capitalized = city.substring(0,1).toUpperCase()+city.substring(1);
        System.out.println("capitalized = " + capitalized);

        //city.isEmpty().toUpperCase() Does not work since isEmpty is boolean


    }
}
