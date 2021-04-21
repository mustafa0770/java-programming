package day31_arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {23, 123, 654, 2342, 3274};
        System.out.println(Arrays.binarySearch(nums, 23));
        System.out.println(Arrays.binarySearch(nums, 2342));
        System.out.println(Arrays.binarySearch(nums, 25));


        if(Arrays.binarySearch(nums, 12345) >= 0){

        }
    }
}
