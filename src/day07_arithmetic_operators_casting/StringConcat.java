package day07_arithmetic_operators_casting;

public class StringConcat {
    public static void main(String[] args){
        System.out.println("java " + 5 + 3); //java 53
        System.out.println("java " + (5 + 3)); //java 8
        System.out.println(5 + 3 + " java");
        System.out.println(5 + (3 + " java"));
        System.out.println();
        System.out.println("hello " +1+2+3+4);
        System.out.println("hello " +(1+2+3+4));

        String str1 = "hello";
        String str2 = "friends";
        System.out.println(str1+" "+str2);


        int num1 = 7;
        int num2 = 4;
        System.out.println(num1+num2);
        System.out.println(num1+" "+num2);
        System.out.println(num1+""+num2);

        char ch1 = 'a';
        char ch2 = 'b';
        System.out.println(ch1 + ch2);
        System.out.println(ch1+ "" +ch2);

     }
}
