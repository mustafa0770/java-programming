package PracticeExercises;
import java.util.Arrays;
import java.util.Scanner;

public class ReplitExercise {
    public static void main(String[] args) {
//        int arr[] = new int[3];
//        arr[arr.length - 1] = 5;
//        String str = " ";
//        System.out.println(Array);
        Scanner scan = new Scanner(System.in);

        int arr = scan.nextInt();

        int[] nums = new int[arr];

        for(int i =0; i < arr; i++) {
            nums[i] = scan.nextInt();
        }
    }
}
