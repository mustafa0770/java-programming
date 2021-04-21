package day04_variables_intro;

public class VariableNamingRules {
    public static void main(String[] args){
        //int static = 22; => error static is reserved by java
        int static2 = 22;
        int _static = 22;
        int $tatic = 44;
        int staticVar = 234;

        int salary$ = 55;
        //int 1stMonthSalary = 3000; => ERROR cannot start with numbers


        int $ = 10;
        int _ = 3;
        System.out.println($);
        System.out.println(_);
        //Above variables work fine but not recommended you should use meaningful variable names.
        //int numbers-of-friends = 400; => ERROR

        int numberOfFriends = 401;
        int number_of_friends = 401; //not convention

        //int 1stNum = 10; cannot start with number


    }

}
