package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1423.54;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        // decrease balance by baklava price
        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance);

        double kenafe = 44.45;
        System.out.println("kenafe = " + kenafe);
        balance = balance - kenafe;
        System.out.println("kenafe after kenafe = " + balance);
        
        kenafe = kenafe / 2;
        System.out.println("kenafe = " + kenafe);
        //buy it and decrease balance with kenafe price
        balance = balance - kenafe;
        System.out.println("balance after second kenafe = "+balance);

        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("balance after plov = " +balance);

        double icedTea = 3.0;
        System.out.println("icedTea = " + icedTea);
        //buy 4 iced teas and decrease balance
        balance = balance - icedTea * 4;
        System.out.println("balance after icedTea  = $" + balance);


    }
}
