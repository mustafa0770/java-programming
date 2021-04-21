package day29_nestedloop_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {
        for(int i = 0; i <= 5; i++){
            System.out.println("");
            for(int j = 1; j <= 10; j++) {
                System.out.print("* ");
            }
        }
        System.out.println();
        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 1; inner <= outer; inner++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int m = 1; m <= 10; m++) {
            for (int n = 10; n >= m; n--) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for(int i = 0; i <= 5; i++) {
            System.out.println("");
            for (int j = 1; j <= 10; j++) {
                System.out.print("* ");
            }
        }
    }
}
