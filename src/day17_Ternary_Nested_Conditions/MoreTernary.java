package day17_Ternary_Nested_Conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        //String reply;
        //if(hourlyRate > 45) {
        //    reply = "accept";
        //} else {
        //    reply = "reject";
        //}
        
        String reply = (hourlyRate > 45) ? "accept" : "reject";
        System.out.println("reply = " + reply);
        
        String todaysClass = "java";
        String teacher = (todaysClass.equals("java")) ? "Saim / Murodil" : "Nadir";
        System.out.println("Today's teacher = " + teacher);
        
        boolean isEligibleToDrive = false;
        String driving = isEligibleToDrive ? "yes, have DL, Can drive" : "No DL, Cannot drive";
        System.out.println("driving = " + driving);
    }
}
