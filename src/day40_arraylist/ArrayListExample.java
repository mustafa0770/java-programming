package day40_arraylist;

import sun.management.snmp.jvmmib.EnumJvmClassesVerboseLevel;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);
        //nums.add("java"); ERROR

        System.out.println("size = " +nums.size());

        //reading from ArrayList
        System.out.println("index 0 = " +nums.get(0));
        System.out.println("index 1 = " +nums.get(1));
        System.out.println("index 2 = " +nums.get(2));
        //System.out.println(nums.get(3)); Index out of bounds exception

        //print all values in same line:
        System.out.println(nums); //Arrays.tpString(numArray)

        nums.remove(1); //remove element at index 1

        System.out.println(nums);



    }
}
