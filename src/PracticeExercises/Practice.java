package PracticeExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        /*int[] odd = {1,3,5,7,9,11};
        System.out.println(odd[0]+ " " +odd[3]);*//**//*
        ArrayList<Integer> group = new ArrayList<>();*//*

      /* String s = "Java"+1+2+"Quiz"+""+(3+4);
        System.out.println(s);*//*

        int a = 5;
        System.out.println(cube(a));


    }
    public static int cube (int theNum){
        return theNum * theNum * theNum;*/
    /*    method1();
    }
    public static void method1(){
        int n = 5;
        for(int i = 0; i < 5; i++){
            n += i;
        }
        System.out.println(n);*/

    /*    method2 ("The sun set quickly and created a shadow");
    }
    public static void method2(String s){
        String a = s.substring(10);
        if(a.length() > s.length()){
            System.out.print(a);
        }else{
            System.out.print(s);
        }*/

       /* System.out.println(method3(50));
    }
    public static String method3(int num){
        if(num < 0){
            return "Less than 0";
        }else if(num < 50){
            return "Less than 50";
        }else if(num < 100){
            return "Less than 100";
        }else{
            return "other";
        }*/

     /*   int result = method4("z", "zebra");
        System.out.println("result");
    }
    public static int method4(char c, String s) {
        if(s.contains(""+c)){
            return 1;
        }else{
            return 0;
        }*/

        /*public static boolean method5(String str){
            boolean check = true;
            if(str.isEmpty()){
                check = false;
            }
            if(str.contains("a")){
                check = false;
            }else if(str.contains("z")){
                check = false;
            }
            return check;
        }

    public static void main(String[] args) {
        System.out.println(method5("apple"));
    }*/

        /*String str = method7("on the weekend", 20);
        System.out.println(str);
    }
    public static String method7(String str, int s){
        if(s < 10){
            str = str.substring(8);
        }else{
            if(str.length() > s){
                str = "weekday";
            }else if(s > 10) {
                str = str.substring(7);
            }
        }
        return str;*/

       /* Scanner input = new Scanner(System.in);

        int [] a = new int[input.nextInt()];
        for(int i = 0; i < a.length; i++){
            a[i] = input.nextInt();
        }
        method8(a);
    }

    public static void method8(int [] arr) {
        for(int n: arr){
            if(n % 2 == 0) {
                continue;
            }
            System.out.print(n);
        }*/

    /*public static String method9(String one, String two, String three){
        return "" +middle(one) +middle(two) + middle(three);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = method9(scan.next(), scan.next(), scan.next());
        System.out.println(str);
    }
    public static char middle(String s){
        return s.charAt(s.length()/2);*/

      /*  double number = add(3.4);
        number += add("dual");
        number += add(Integer.parseInt("100"));
        number += add(Double.parseDouble("50.8"));
        System.out.print(number);
    }
    public static int add(int n){
        return 5;
    }
    public static double add(double d){
        return 2.5;
    }
    public static long add(String s){
        return 10;*/

   /* public static int action(int i){
        return i * 2;
    }

    public static void main(String[] args) {
        int total = 0;
        total += action(true);
        total += action(6);
        total += action("false");
        total += action("four");
        System.out.print(total);
    }
    public static int action(String s){
        return s.length();
    }
    public static int action(boolean b){
        if(!b){
            return 5;
        }else{
            return 10;
        }
    }*/

/*
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(4);
        nums.add(2);
        nums.add(10);
        nums.add(0,6);
        nums.add(-7);
        nums.add(2,2);
        System.out.print(nums);*/

        /*ArrayList<String> strs = new ArrayList<>();
        strs.add("j");
        strs.add("1");
        strs.add("i");
        strs.add("5");
        strs.remove(1);
        strs.add("e");
        strs.add("i");
        strs.remove("i");

        System.out.println(strs);*/

       /* ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(2,97,2,56,46,73,6,2,3,7));
        String s = "";
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) > 5){
                continue;
            }
            if(numbers.get(i) % 2 == 0) {
                s += "1";
            }else{
                s += "0";
            }
        }
        System.out.print(s);*/

        /*ArrayList<String> words = new ArrayList<>(Arrays.asList("during","storm","rain","fell","season","cloudy","safe"));
        ArrayList<Integer> lengths = new ArrayList<>();
        for(String word: words){
            lengths.add(word.length());
        }
        System.out.print(lengths);*/

        /*ArrayList<Integer> numsOne = new ArrayList<>();
        numsOne.addAll(Arrays.asList(4,1,8,-42,2,10));
        ArrayList<Integer> numsTwo = new ArrayList<>();

        for(int each : numsOne)
            switch (each) {
                case 1:
                    numsTwo.add(1);
                case 5:
                    numsTwo.add(50);
                    break;
                case 4:
                    break;
                case 8:
                    numsTwo.remove(0);
                    break;
                case 10:
                case -42:
                    numsTwo.add(1,0);
                    break;
                case 55:
                    numsTwo.add(105);
                    break;
                case 2:
                    numsTwo.add(20_000);
                    break;
                default:
                    numsTwo.add(null);
            }
        System.out.print(numsTwo);
    }*/

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Bahruz", "Elgun", "Kamran", "Rasim", "Suleyman", "Ramil",
                "Emil", "Elvin", "Abbas", "Mehdi", "Mustafa", "Aygun", "Parvin", "Rahib", "Orkhan", "RESERVE"));
        String aaa = "";
        for (int i = 0; i < names.size(); i++) {
            for (int j = 0; j < names.size(); j++) {
                if (names.get(i) != names.get(j))
                    aaa += names.get(i) + "-" + names.get(j);
                if (aaa.contains(names.get(j) + "-" + names.get(i))) {
                    System.out.println(names.get(i) + "-" + names.get(j));

                }
            }
        }
    }
}