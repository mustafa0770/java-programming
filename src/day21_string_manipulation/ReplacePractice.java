package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "GitHub";
        System.out.println(word.replace("Hub","Lab"));
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        
        word = word.replace("Hub", "Lab");
        System.out.println("word = " + word);
        System.out.println(word.replace('i', 'o'). replace('a', 'i'));

        String sentence = "java is fun";
        String withNoSpace = sentence.replace(" ", "");
        System.out.println("withNoSpace = " + withNoSpace);

        sentence = sentence.replace("java", "selenium"). replace("fun","a lot of fun");
        System.out.println("sentence = " + sentence);

        String result = "1 - 48 of over 345 results for java book";
        result = result.replace("1-48 of over ","")
                        .replace(",","")
                        .replace(" results for java book","");
        System.out.println("result = " + result);


    }
}
