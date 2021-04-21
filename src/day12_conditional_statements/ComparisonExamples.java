package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        //declare 3 variables,
        //currentSpeed -> 45
        //speedLimit -> 55
        //isSpeeding -> true if speeding, false if not speeding
        int speedLimit = 55;
        int currentSpeed = 45;
        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding:? "+isSpeeding);
        //45 + 25 -> 70
        currentSpeed +=25; //70

        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - "+isSpeeding);
        System.out.println("currentSpeed = "+currentSpeed+" mph ");
        System.out.println("speedlimit = "+speedLimit+" mph");

        double accountBalance = 250.25;
        double itemPrice = 100.99;
        System.out.println("Can I afford? - " + (accountBalance >= itemPrice));

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("Can Afford = "+canAfford);

        accountBalance = accountBalance - itemPrice;
        accountBalance -= itemPrice;
        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke? - "+isBroke);

    }
}
