package PracticeExercises;

public class Employee {
    public static void main(String[] args) {
        String firstName = "Mustafa";
        String lastName = "Dovletmammedov";
        String companyName = "Amazon";
        long salary = 100000;
        int startDay = 7;
        int startMonth = 3;
        int startYear = 2021;
        boolean areTheyFullTime = true;
        String jobTitle = "Engineer";
        String officeAddress = "410 Terry Ave. North, Seattle, WA, 98109";
        double salaryAfter3Years = 100000+(3 * 10000);


        System.out.println("    ***** Amazon New Hire Information *****");
        System.out.println();
        System.out.println(firstName+ " Welcome to "+companyName+ "\nYour start date as a "+jobTitle+" will be on "
                +startDay+"/"+startMonth+"/"+startYear+"\nYou are full-time: "+areTheyFullTime+
                " and will he making " +salary+" per year \nThe office is located at: "+officeAddress);

        System.out.println();
        System.out.println("\t\tOFFICIAL INFORMATION:");
        System.out.println();
        System.out.println("New hire name:\t\t\t\t\t\t"+firstName+" "+lastName);
        System.out.println("Starts on:\t\t\t\t\t\t\t"+startDay+"/"+startMonth+"/"+startYear);
        System.out.println("Email generated:\t\t\t\t\t"+firstName+"7@"+companyName+".com");
        System.out.println("Your expected salary after "+startMonth+" years:\t$"+salaryAfter3Years);


    }
}
