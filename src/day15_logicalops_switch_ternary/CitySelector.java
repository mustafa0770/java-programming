package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "London";
        //London or Seattle
        if (city.equals("London") || city.equals("Seattle")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("Not considering - " + city);
        }

        String teacher = "Nadir.";
        //Saim OR Murodil -> it's a java class Saim
        //otherwise -> Soft skill class with Nadir

        if(teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("It is a java class with " + teacher);
        } else {
            System.out.println("Soft skill class with " + teacher);
        }

        //1 - teacher Saim or Murodil -> It is a java class
        //2 - teacher Nadir -> Soft skill class with
        //any other teacher -> some class with Gurhan/Akbar
        teacher = "Murodil";
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("Java class with " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft skill class with " + teacher);
        } else {
            System.out.println("Some other class with " + teacher);
        }

        //company - "Google", salary >= 120k

        String company = "Amazon";
        double salary = 1_000.00;
        if (company.equals("Amazon") || salary >= 120_000.00) {
            System.out.println("I should accept this offer " + company);
        } else {
            System.out.println("Look for better offers " + company);
        }

    }
}
