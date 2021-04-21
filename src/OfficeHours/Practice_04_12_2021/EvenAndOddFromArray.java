package OfficeHours.Practice_04_12_2021;

import java.util.Arrays;

public class EvenAndOddFromArray {
    public static void main(String[] args) {
        int[] nums = {4, 2, 13, 34,50};
        int even = 0;
        int odd = 0;

        for(int eachNum : nums) {
            if(eachNum % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        int [] evenNumbers = new int[even];
        int [] oddNumbers = new int[odd];

        for(int i = 0, e = 0, o = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                evenNumbers[e] = nums[i];
                evenNumbers[e++] = nums[i];
            } else {
                oddNumbers[o] = nums[i];
                oddNumbers[o++] = nums[i];
            }
        }


        System.out.println(Arrays.toString(evenNumbers));
        System.out.println(Arrays.toString(oddNumbers));
    }
}
