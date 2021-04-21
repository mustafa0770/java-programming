package day29_nestedloop_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
        String word = "hello world";
        for(int i = 0; i < word.length(); i++){
          for(int j = 0; j <= i; j++){
              System.out.print(word.charAt(j));
          }
            System.out.println();
        }
        System.out.println("HELLO WORLD!");
        for (int i = word.length()-1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}
