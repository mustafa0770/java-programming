package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.equals(""));
        System.out.println(jobTitle.equalsIgnoreCase(""));

        if(jobTitle.isEmpty()) {
            System.out.println("JobTitle is missing, please resend");
        } else {
            System.out.println("JobTitle looks good");
        }
        if (jobTitle.length() == 0) {
            System.out.println("JobTitle is empty");
        } else {
            System.out.println("JobTitle is not empty");
        }

        String word = " ";
        System.out.println(word.isEmpty());
        System.out.println(word.length());

        String veggie = "carrots";
        System.out.println(veggie.isEmpty());
        if (!veggie.isEmpty()){
            System.out.println("We have carrots");
        }
    }
}
