package PracticeExercises;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SplittableRandom;

public class ReplAssignment {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);

        System.out.println("Tomatoes Price: ");
        double tomatoes = scan.nextDouble();

        System.out.println("Cheese Price: ");
        double cheese = scan.nextDouble();

        System.out.println("Apples Price: ");
        double apples = scan.nextDouble();

        double total = tomatoes + cheese + apples;
        System.out.println("Total price: "+total);
        System.out.println();*/

       /* char[] array = {'D', 'C', 'B', 'A'};
        Arrays.sort(array);
        for(char each : array) {
            System.out.println(each+ " ");
            if(each == 'D'){
                continue;
            }
        }*/


        /*int[] num1 = new int[3];
        int[] num2 = {1, 2, 3, 4};
        num1 = num2;
        for(int i = 0; i < num1.length; i++){
            System.out.println(num1[i]);
        }*/

        /*int[] intArr = {15, 30, 45, 60, 75};
        intArr[2] = intArr[4];
        intArr[4] = 90;
        System.out.println(Arrays.toString(intArr));*/

        /*String [] planets = {"Mercury", "Venus", "Earth", "Mars"};
        int x = planets.length;
        int y = planets[1].length();
        System.out.println(x + " " + y);*/

        /*int [] arr = { 1, 2, 3, 4};
        int i = 0;
        do{
            System.out.println(arr[i] + " ");
            i++;
        }while (i < arr.length-1);*/

         /*   String word = "   Winter is coming   ";
            word = word.trim();
        System.out.println(word.length());*/

        /*String a = "123";
        String b = 5 + 4 + a;
        System.out.println(b);*/

        /*String s = "Java is fun";
        char c = s.charAt(4);

        if(c == 'a') {
            System.out.println("A");
        }else if(c == ' '){
            System.out.println("B");
        }else {
            System.out.println("C");
        }*/

       /* String result = 3425 > (9*1000) ? "garden" : "patio";
        result.substring(2);
        System.out.println(result);*/

        /*String str = "the fox ran under the bridge";
        str = str.substring(4,17);
        str.toUpperCase();
        System.out.println(str+ "ground");
*/

       /* String s = "the game was tied at 2-2";
        String s2 = s.substring(5);
        int index1 = s.indexOf("game");
        int index2 = s2.indexOf("game");

        if (index1 == index2) {
            System.out.println(index1);
        }else{
            System.out.println(index2);
        }*/

        /*String a = "today I will go to the beach";
        boolean b = a.contains("i");
        boolean c = a.substring(12).startsWith("go");

        String result = b && c ? "go" : "don't go";
        System.out.println(result);*/

        /*for(int i = 0; i < 10; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }*/

        /*int number = 5;
        while(number < 100){
            number += number;
        }
        System.out.println(number);*/

        /*String word = "java";
        int a = 0;
        do{
            System.out.println(word.charAt(a));
            a++;
        }while (a > word.length());*/

        /*String str = "The whole time it was raining.";
        do{
            System.out.println(str.charAt(0));
            str = str.substring(3);
        }while(!str.isEmpty());*/

        /*
        String s = "I will find the lost book";
        String word = "";
        for (int index = s.length()-1; index <= 0; index--){
            word += s.charAt(index);
        }
        System.out.println(word);*/

        /*String str = "cybertek";

        for(int i = 0; i <= str.length(); i += 2){
            System.out.println(str.charAt(i));
        }*/

        /*String input = "today it will be 100 degrees !";
        int n = 0;

        while (n++ < input.length()){
            if(n == 8){
                continue;
            }else if (n == 9){
                break;
            }
            System.out.println(input.charAt(++n));
        }*/

        /*Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int iterate = input.nextInt();

        int total = 0;
        for(int j = 0; j < iterate; j++){
            if(j % 3 == 0) continue;
            total += num1 + num2;
        }
        System.out.println(total);*/

        /*int count = 0;
        for(int a = 0; a < 4; a++){
            if(a == 3) continue;
            for(int b = a + 1; b < 5; b++){
                count++;
                if(b == 3) break;
            }
        }

        System.out.println(count);
*/

        /*int [] nums = new int [5];
        int a = 5;
        nums[2] = a;
        nums[0] = a * 2;
        nums[4] = nums[1] * a;
        nums[1] = nums[2];
        nums[3] = nums[a - 3];
        System.out.println(Arrays.toString(nums));*/

        /*double[] doub = new double[4];
        doub[0] = 1.0;
        doub[2] = 42.1;
        doub = new double[4];
        doub[1] = 17.2;
        doub[3] = doub.length;

        System.out.println(Arrays.toString(doub));*/

        /*String[] strs = {"display","population","meeting","copy","franchise"};

        int a = strs.length;
        int b = strs[5].length();
        System.out.println(a + " " + b);*/

       /* byte[] b = {1,2,3};
        for(int j = 0; j < b.length; j++){
            b[j] = (byte) (b[j] * 2);
        }
        System.out.println(Arrays.toString(b));*/

        /*String[] words = {"one", "two", "three", "four"};
        String[] other = new String[words.length];
        for(int i = 0; i < words.length; i++){
            other[i] = words[i] + words[i].length();
        }
        System.out.println(Arrays.toString(other));*/

        /*int [] arr = {1,3,12,5,24,7,9,10};
        boolean[] bArr = new boolean[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                bArr[i] = true;
            }
            System.out.println(Arrays.toString(bArr));
        }*/

        /*int[] nums = {14,1,84,97,1243,46};
        int total = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0){
                total += 5;
            }else{
                total += 10;
            }
        }
        System.out.println(total);*/

        String[] things = {"house","shed","slide","zebra","park","garden"};

        for(String s : things){
            switch(s.charAt(1)){
                case 'h':
                    System.out.print(1);
                    break;
                case 'a':
                    System.out.print(2);
                case's':
                    System.out.print(3);
                    break;
                case 'o':
                default:
                    System.out.print(4);
                case 'p':
                    System.out.print(5);
                    break;
                case 'z':
                    System.out.print(6);
                case 'l':
                    break;
                case 'g':
                    System.out.print(7);
            }
        }


        }
}
