package day40_arraylist;

import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(); //Polymorphic way of declaring
        System.out.println(nums);
        System.out.println("size = " +nums.size());

        nums.add(34);
        nums.add(44);
        nums.add(3);
        nums.add(88);
        nums.add(500);
        nums.add(5);
        nums.add(76);

        System.out.println("nums = " +nums);

        nums.remove(0);
        System.out.println("nums = " +nums);

        //nums.remove(88); -> index 88 -> Index out of bound Exception

        nums.remove(new Integer(88)); //removes number 88. not
        System.out.println("nums = " +nums);
        
        nums.remove(new Integer(5));
        System.out.println("nums = " + nums);
        
        nums.remove(new Integer(3));
        System.out.println("nums = " + nums);

        nums.remove(new Integer(500));
        System.out.println("nums = " + nums);

        nums.remove(new Integer(76));
        System.out.println("nums = " + nums);

        // for loop - iterate through all values and print
        for(int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        // for each loop, and print all in same line
        for(int each : nums) {
            System.out.print(each+" ");
        }

                
    }
}
