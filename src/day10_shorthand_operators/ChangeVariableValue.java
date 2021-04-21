package day10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count = 2500;
        System.out.println("count = " + count);
        //add 90 more
        count = count + 90;
        System.out.println("count = " + count);

        int apples = 50;
        System.out.println("apples = " + apples);
        apples = apples + 30;
        System.out.println("apples = " + apples);
        apples = apples - 32;
        System.out.println("apples = " + apples);


        int pizzaSlices = 12;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices = pizzaSlices / 2;
        System.out.println("pizzaSlices = " + pizzaSlices);
        //get another pizza 
        pizzaSlices = pizzaSlices + 4;
        System.out.println("pizzaSlices = " + pizzaSlices);
        
        int players = 13;
        System.out.println("players = " + players);
        players = players * 2;
        System.out.println("players = " + players);

        int cents = 244;
        System.out.println("cents = " + cents);
        //keep whole dollars portion and just assign remaining cents
        cents = cents % 100;
        System.out.println("cents = " + cents);

        
        
        
    }
}
