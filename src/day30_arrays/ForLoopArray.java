package day30_arrays;

public class ForLoopArray {
    public static void main(String[] args) {
        int[] data = {12, 32, 65, 734, 237};
        for(int each : data){
            System.out.println(each+", ");
        }
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("last value: "+data[data.length-1]);

        // print all number backward in same line
        for(int idx = data.length - 1; idx >= 0; idx--){
            System.out.print(data[idx] + " ");
        }
    }
}
