package day32_arrays_split;

public class MallShopping {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iPhone12 Case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 4390.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("-------FIND THE INDEX OF 'Gloves' in items array-------");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("The Index of Gloves = " + i);
                break;
                //System.out.println(i + " - "+ items[i]);
            }
        }
        System.out.println();
        System.out.println("------Set boolean to true if first 'iPad' is found------");
        boolean iPadExists = false;
        for( int i = 0; i < items.length;i++){
            if(items[i].equals("iPad")){
                iPadExists = true;
                break;
            }
        }
        System.out.println("iPadExisted = " + iPadExists);
        if(iPadExists){
            System.out.println("We bought the iPad");
        } else {
            System.out.println("We forgot the iPad: .(");
        }
        System.out.println();
        System.out.println("-------Print a report of each shopping item-------");
        for (int i = 0; i < items.length; i++) {
            System.out.println("Item Name: "+items[i] + "\nPrice - $" + prices[i] + "\nItemID - #" + itemIDs[i]+"\n");
        }
        System.out.println();
        System.out.println("-----Look for 'Jacket' in items and print all details-----");
        for(int i=0; i< items.length; i++){
            if(items[i].equals("Jacket")){
                System.out.println("Item Name: "+items[i]+"\nPrice - $"+prices[i]+"\nItemID - #"+itemIDs[i]);
                break;
            }
        }
    }
}