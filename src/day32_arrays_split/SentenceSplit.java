package day32_arrays_split;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println("1st word = "+words[0]);
        System.out.println("2nd word = "+words[1]);
        System.out.println("3rd word = "+words[2]);
        for(String word : words){
            System.out.println(word);
        }
        System.out.println();

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] numbers = googleResult.split(" ");
        System.out.println("Count1 = " +numbers[1]);
        System.out.println("Count2 = " +numbers[3].substring(1));
    }
}
