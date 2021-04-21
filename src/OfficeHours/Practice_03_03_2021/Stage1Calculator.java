package OfficeHours.Practice_03_03_2021;
 /*
 Declare two double variables
 - Declare 5 more double variables for each operation.
        > Execute all the operation between the first two numbers
    - Print out operations
        Ex: if the nums are 5 and 10
            5 + 10 = 15
            5 - 10 = -5
            etc.
  */

public class Stage1Calculator {
    public static void main(String[] args) {
        double num1 = 5.0;
        double num2 = 9.0;

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double remainder = num2 % num2;

        System.out.println("Calculation for "+num1+ " & " +num2);
        System.out.println(num1+ " + " +num2+" = " +addition);
        System.out.println(num1+ " - " +num2+" = " +subtraction);
        System.out.println(num1+ " * " +num2+" = " +multiplication);
        System.out.println(num1+ " / " +num2+" = " +division);
        System.out.println(num1+ " % " +num2+" = " +remainder);

        //Print without variables
        System.out.println();
        System.out.println("Calculation for "+num1+ " & " +num2);
        System.out.println(num1+ " + " +num2+" = " +(num1 + num2));
        System.out.println(num1+ " - " +num2+" = " +(num1 - num2));
        System.out.println(num1+ " * " +num2+" = " +(num1 * num2));
        System.out.println(num1+ " / " +num2+" = " +(num1 / num2));
        System.out.println(num1+ " % " +num2+" = " +(num1 % num2));



    }
}
