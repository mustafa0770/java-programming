package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = ("San Francisco");
        double salary = 1200000.00;
        boolean isRemote = true;
        boolean benefits = true;
        if (location.equals("San Francisco") && salary >= 120_000.00 && isRemote && benefits) {
            System.out.println("Great i will accept this offer.");
        } else {
            System.out.println("Lets consider another offer or negotiate");
        }
    }
}
