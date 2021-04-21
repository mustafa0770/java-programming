package day18_conditions_practice_strings_intro;

//import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
  //      System.out.println("Enter your last 4 SSN:");
    //    int last4SSN = scan.nextInt();

      //  System.out.println("Enter your last pinCode");
      //  int pinCode = scan.nextInt();

        int expLast4SSN = 6543;
        int expPinCode = 1234;

        int last4SSN = 6532;
        int pinCode = 2322;

        if (last4SSN == expLast4SSN && pinCode == expPinCode){
            System.out.println("***** Welcome To Your Account *****");
        } else
            System.out.println("Sorry, Something went wrong. Try again!");
            if (last4SSN != expLast4SSN) {
                System.out.println("Last 4 SSN number is incorrect");
            }

            if (expPinCode != pinCode) {
                System.out.println("Pin code is incorrect");
            }
    }
}
