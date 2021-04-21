package day37_methods_overloading;

public class DaySelecter {
    public static void main(String[] args) {
        System.out.println(getDayName(7));
        System.out.println(getDayName(5));
        System.out.println(getDayName(10));

        for(int i = 1; i < 9; i++) {
            System.out.println(i + " = " +getDayName(i));
        }

        String today = getDayName(6);
        System.out.println("Today's date = " + today);
        String someDay = getDayName(0);
        if(someDay == null) {
            System.out.println("Someday is null for invalid day");
        }

    }

    public static String getDayName(int num){
        switch (num){
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Firday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid day";
        }
    }
}
