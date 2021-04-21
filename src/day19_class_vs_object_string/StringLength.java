package day19_class_vs_object_string;

public class StringLength {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("wooden spoon".length());

        String sentence = "Future SDET";
        System.out.println(sentence);
        System.out.println(sentence.length());

        String firstName = "Mustafa";
        System.out.println("Mustafa : " + firstName.length());
        System.out.println(firstName + " - " + firstName.length());
        
        int count = firstName.length();
        System.out.println("count = " + count);

        String password = "abc123";
        if (password.length() >= 6 && password.equals(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Password is too short");
        }
    }

}
