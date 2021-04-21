package day32_arrays_split;
import java.util.Arrays;

public class CountUsingSplit {
    public static void main(String[] args) {
        String cats = "bengal cat tabby cat persian cat no cat here";
        String[] cat = cats.split("cat");
        System.out.println("Number of word 'CAT' = "+(cat.length-1));

        for(String type : cat){
            System.out.println(type);
        }
        System.out.println();

        int count = 0;
        for(int i = 0; i < cats.length() - 2; i++) {
            if(cats.substring(i, i +3).equals("cat")) {
                count++;
            }
        }
        System.out.println("count of cats = " + count);

    }
}
