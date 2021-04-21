package day17_Ternary_Nested_Conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        int itemPrice = 10;
        boolean isPrimeMember = true;

        if(isPrimeMember == false){
            System.out.println("Eligible for free 2 day shipping");
        } else {
            if(itemPrice >= 25){
                System.out.println("Eligible for free regular shipping");
            } else {
                System.out.println("Not eligible for free shipping. Shipping fee is $10");
            }
        }
    }
}
