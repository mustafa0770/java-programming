package day29_nestedloop_arrays;

public class NestedForLoop {
    public static void main(String[] args) {
        for(int minutes = 1; minutes <= 5; minutes++){
            System.out.println("\nminutes=" + minutes);
            for (int seconds = 1; seconds <= 60; seconds++) {
                System.out.print(seconds + " ");
            }
        }
        for(int hours = 0; hours <= 23; hours++)
            for(int minutes = 0; minutes <= 59; minutes++) {
                for(int seconds = 0; seconds <= 59; seconds++) {
                    System.out.println(hours+":"+minutes+":"+seconds);
            }
        }
    }
}