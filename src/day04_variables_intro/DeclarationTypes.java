package day04_variables_intro;

public class DeclarationTypes {
    public static void main (String[] args){
        //declaration + assignment in single statement:
        int mac = 43;
        System.out.println(mac);

        int monitor = 100;
        System.out.println(monitor);

        monitor = 105;
        System.out.println(monitor);

        int peopleInCity, birdsOnTree, fishInLake;

        peopleInCity = 1000;
        birdsOnTree = 10000;
        fishInLake = 100000;
        System.out.println(peopleInCity );
        System.err.println(birdsOnTree );
        System.out.println(fishInLake );

        int studentsInCA = 40, studentsInNY = 58;
        System.out.println(studentsInCA);
        System.out.println(studentsInNY);
        System.out.println(studentsInCA+"\t"+studentsInNY);



    }
}
