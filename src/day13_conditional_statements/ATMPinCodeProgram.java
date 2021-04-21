package day13_conditional_statements;

public class ATMPinCodeProgram {
    public static void main(String[] args) {
        System.out.println("**** Welcome To TD Bank ATM ****");
        int secretPinCode = 2131;
        int inputPinCode = 3221;

        if (secretPinCode == inputPinCode){
            System.out.println("Welcome to your account.\nYou can withdraw, check balance, deposit");
        } else {
            System.out.println("Incorrect PinCode!: "+inputPinCode+"\nPlease try again.");
        }
        System.out.println("Thank you for using TD Bank ATM!");
    }
}
