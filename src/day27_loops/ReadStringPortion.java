package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
        String list = "cat, car, red car, black cat";
        for(int i = 0; i < list.length()-2; i++) {
            System.out.println(list.substring(i, i+3));
            if(list.substring(i, i + 3).equals("cat") || list.substring(i, i + 3).equals("car")){
                System.out.println("cat or car found");
            }
        }
        //System.out.println(list.substring(0,3));
    }
}
