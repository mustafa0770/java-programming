package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        int apples = 5;
        if(apples > 2) {
            System.out.println("True " +apples);
        } else if (!(apples < 3 )) {
            System.out.println("False " +apples);
        }
        int age = 2;
        if (!(age > 7)) {
            System.out.println("Need to sit in child car seat " + age);
        } else {
            System.out.println("No need for car seat " + age);
        }

        boolean isSmokingAllowed = false;
        if(!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here. EXIT");
        } else {
            System.out.println("This area is for smoking");
        }

        boolean isAffordable = true;
        //If its NOT affordable then print "Item NOT affordable"
        if (!isAffordable) {
            System.out.println("Item is not affordable");
        }

        String env = "qa";
        if (!env.equals("qa")) {
            System.out.println("In wrong environment for QA testing");
        }

        String carModel = "Tesla";
        //if its not Tesla, print "Not interested"
        if (!carModel.equals("Tesla")) {
            System.out.println("I'm not interested");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc1234";
        //if inputPassword IS NOT
        if (!inputPassword.equals(secretPassword)){
            System.out.println("Incorrect password");
        }
    }
}
