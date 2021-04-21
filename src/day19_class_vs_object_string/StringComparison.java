package day19_class_vs_object_string;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Angeles";
        System.out.println(city.equals("Los Angeles"));
        System.out.println(city.equals("los angeles"));
        System.out.println(city.equals("Los angeles"));

        //EQUALSIGNORE CASE
        System.out.println(city.equalsIgnoreCase("Los Angeles"));
        System.out.println(city.equalsIgnoreCase("Los angeles"));
        System.out.println(city.equalsIgnoreCase("los angeles"));

        if(city.equals("Los Angeles")) {
            System.out.println("equals() true");
        } else {
            System.out.println("equals() false");
        }

        if(city.equalsIgnoreCase("Los angeles")) {
            System.out.println("equalsIgnoreCase() true");
        } else {
            System.out.println("equalsIgnoreCase() false");
        }


    }
}
