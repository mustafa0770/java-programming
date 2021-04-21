package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        int evenNum = 0;
        int oddNum = 0;
        int n = 0;
        for (n = 1; n <= 100; n++) {
            if (n % 2 == 0){
                System.out.println("\t\tEven numbers: " +n);
                evenNum += 1;
            } else {
                System.out.println("Odd numbers: "+n);
                oddNum += 1;
            }
        }
        System.out.println("evenNum = " + evenNum);
        System.out.println("oddNum = " + oddNum);

    }
}
