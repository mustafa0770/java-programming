package day23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {
        int i = 10;
       if (i <= 5) {
            System.out.println(i);
            i++;
        }
       int apples = 0;
       while (apples <= 3) {
           System.out.println("apple -> " +apples);
           apples++;
       }
        System.out.println("apples = " + apples);

       while (true) {
           System.out.println();
       }
    }
}
