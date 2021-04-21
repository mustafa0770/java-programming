package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        double budget = 5000.0;
        String carModel = "Honda";
        double carPrice = 5900.0;
        if (carPrice <= budget && (carModel.equals("Toyota") || carModel.equals("Tesla") || carModel.equals("Honda"))) {
            System.out.println("I will buy this car = " +carModel + ", price = "+ carPrice);
        } else {
            System.out.println("This car is over my budget " + carModel + ", price = "+ carPrice);
        }
    }
}
