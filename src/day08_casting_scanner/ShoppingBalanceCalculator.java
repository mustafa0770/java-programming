package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 265.76;

        double price1 = 29.99;
        double price2 = 89.99;
        double price3 = 14.99;
        double totalBalance = price1 + price2 + price3;
        double remainingBalance = balance - (price1 + price2 + price3);

        System.out.println("T-Shirt:\t\t\t\t$"+price1);
        System.out.println("Shoes:\t\t\t\t\t$"+price2);
        System.out.println("Socks:\t\t\t\t\t$"+price3);
        System.out.println("--------------------------------");
        System.out.println("Initial Balance:\t\t$"+balance);
        System.out.println("Total:\t\t\t\t\t$"+totalBalance);
        System.out.println("--------------------------------");
        System.out.println("Remaining Balance:\t\t$"+remainingBalance);

        int balanceNoWithCents =(int)remainingBalance;
        System.out.println("Remaining Balance:\t\t$"+balanceNoWithCents);

    }
}
