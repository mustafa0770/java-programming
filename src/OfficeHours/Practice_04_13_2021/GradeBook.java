package OfficeHours.Practice_04_13_2021;

public class GradeBook {
    public static void main(String[] args) {
        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 80, 75};
        char[] grades = new char[names.length];

        for(int i = 0; i < scores.length; i++){
            int eachScore = scores[i];

            if(eachScore >= 85){
                grades[i] = 'A';
            }else if(eachScore >= 75){
                grades[i] = 'B';
            }else if(eachScore >= 65){
                grades[i] = 'C';
            }else{
                grades[i] = 'D';
            }
        }
        System.out.println("GRADEBOOK");

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i] + "|" + scores[i] + "|" + grades[i]);
        }
    }
}
