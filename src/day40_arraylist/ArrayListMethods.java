package day40_arraylist;
import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " +shoppingList.size());
        System.out.println("is Empty = " +shoppingList.isEmpty());

        if(shoppingList.isEmpty()) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        shoppingList.add("shoes");
        shoppingList.add("mask");
        shoppingList.add("cheap monitor");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("sunglasses");
        shoppingList.add("tesla");

        if(shoppingList.isEmpty()) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        int count = shoppingList.size();
        System.out.println("Items to buy = " +count);

        System.out.println("Is shoes in my list " +shoppingList.contains("shoes"));

        if(shoppingList.contains("shoes")) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
