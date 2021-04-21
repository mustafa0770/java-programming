package day29_nestedloop_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int outer = 1; outer <= 10; outer++) {
            System.out.println();
            for (int inner = 1; inner <= 10; inner++) {
                System.out.print(outer * inner + "\t");
            }
            System.out.println();
        }
        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 1; inner <= 10; inner++) {
                int result = (outer * inner);
                System.out.print("|\t" +outer + "x" + inner + "=" + result+"\t");
            }
            System.out.println();
        }
    }
}