package day07_arithmetic_operators_casting;

public class OperatorPrecedence {
    public static void main (String[] args){
        System.out.println(10 + 5);
        System.out.println(10 + 5 - 3);
        System.out.println(10 - 5 + 3);
        System.out.println(10 - (5 + 3));
        System.out.println();

        System.out.println(2 * 3); //6
        System.out.println(2 * 3 / 3); //2
        System.out.println(20 / (2 * 2)); //20 / 4 -> 5

        //System.out.println(10 / 0); ERROR

        System.out.println("We have "+2 + 5 * 3+" students in the class."); //->17
        System.out.println((2 + 5) * 3); //-> 21

        System.out.println(10 / 3);
        System.out.println(5 / 2);

        float n1 = 10;
        float n2 = 3;
        System.out.println(n1 / n2);







    }
}
