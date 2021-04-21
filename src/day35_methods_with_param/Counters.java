package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(12);
        count(21);
        count(5);
    }
    public static void count(int num){
        for (int i = 1; i <= num; i++){
            System.out.print(i+ " ");
        }
        System.out.println();

    }
}
