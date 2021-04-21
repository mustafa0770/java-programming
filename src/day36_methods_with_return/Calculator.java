package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println( add(4.67, 56.34));
        System.out.println(multiply(5,34));
        System.out.println(divide(65,32));
        System.out.println(minus(456,876));

    }
    public static double add(double num1,double num2){
        double sum=num1+num2;
        return sum;
    }

    public static double multiply(double num1, double num2){
        double sum = num1*num2;
        return sum;
    }

    public static double divide(double num1, double num2){
        double sum = num1 / num2;
        return sum;
    }

    public static double minus(double num1, double num2) {
        double sum = num1 - num2;
        return sum;
    }

}
