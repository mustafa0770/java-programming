package OfficeHours.Practice_03_2_2021;

public class PersonInfo {
    public static void main(String[] args) {
        String name = "Mustafa", fullBirthDate, favoriteQuote;
        byte age = 24;
        char gender = 'M';
        boolean isStudent = true;
        short numberOfSiblings = 2;
        long favoriteNumber = 7;
        int numberOfSeasons = 3;
        double birthDate = 08.31;
        int year = 1996;
        fullBirthDate = ""+birthDate+"."+year;
        favoriteQuote = "Work hard and never give up!";

        System.out.println("****** Personal Information ******");
        System.out.println("Name:\t\t\t\t\t" +name);
        System.out.println("Age: \t\t\t\t\t"+age);
        System.out.println("Gender:\t\t\t\t\t"+gender);
        System.out.println("Student:\t\t\t\t"+isStudent);
        System.out.println("Siblings:\t\t\t\t"+numberOfSiblings);
        System.out.println("Favorite Number:\t\t"+favoriteNumber);
        System.out.println("Seasons in my are:\t\t"+numberOfSeasons);
        System.out.println("Date of Birth:\t\t\t"+fullBirthDate);
        System.out.println("Favorite Quote:\t\t\t"+favoriteQuote);
        System.out.println("************************************");


    }
}
