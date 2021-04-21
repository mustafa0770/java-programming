package day32_arrays_split;
import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String words = "java:python:selenium:html";
        String[] wordsArray = words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("Length of Array = " +wordsArray.length);

        for(String each : wordsArray) {
            System.out.println(each);
        }
        System.out.println();

        String sentence = "Today i am coding java arrays.";
        String[] sentenceArray = sentence.split(" ");
        System.out.println("first word: "+sentenceArray[0]);
        System.out.println("first word: "+sentence.split(" ")[0]);
        System.out.println(Arrays.toString(sentenceArray));
        System.out.println("Length of sentence array: " +sentenceArray.length);

        for(String each : sentenceArray){
            System.out.println(each);
        }
    }
}
