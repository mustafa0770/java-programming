package day34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage(); //call the method
        displayMessage();
        for(int i = 1; i <= 100; i++){
            System.out.print(i + " - ");
            displayMessage();
        }


    }

    //first custom reusable method
    public static void displayMessage() {

        System.out.println("Hello B22 Friends!");
    }
}
