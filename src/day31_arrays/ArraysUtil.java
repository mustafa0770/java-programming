package day31_arrays;
import java.util.*;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {5, 3, 5, 45, 98, 100};
        System.out.println(Arrays.toString(nums));
        //sort nums. re-arrange values in ascending order
        Arrays.sort(nums);
        //print after sorting
        System.out.println(Arrays.toString(nums));

        System.out.println("min value: " + nums[0]);
        System.out.println("max value: " + nums[nums.length-1]);

        //Arrays.sort(nums, Collections.reverseOrder());
    }
}
