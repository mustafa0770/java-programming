package day24_loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int count = 0;
        do {
            System.out.println(count);
            count+=100;
        }while (count <= 1000);
    }
}
