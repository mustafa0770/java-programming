package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[]student1 = {"0707", "Mustafa", "Dovletmammedov", "Batch22", "962-1209"};
        System.out.println("ID:           " +student1[0]);
        System.out.println("Name:         " +student1[1]);
        System.out.println("Last Name:    " +student1[2]);
        System.out.println("Batch#:       " +student1[3]);
        System.out.println("Phone Number: " +student1[4]);

        System.out.println();
        System.out.println("===================================");
        System.out.println();

        String[] student2 = new String[5];
        student2[0] = "I0707";
        student2[1] = "Musti";
        student2[2] = "Dovlet";
        student2[3] = "Batch22";
        student2[4] = "342213432";
        System.out.println("ID:           " +student2[0]);
        System.out.println("Name:         " +student2[1]);
        System.out.println("Last Name:    " +student2[2]);
        System.out.println("Batch#:       " +student2[3]);
        System.out.println("Phone Number: " +student2[4]);

        System.out.println("Student data length: "+student1.length);
        System.out.println();

        if (student1.length == 5) {
            System.out.println("student 1 data array has correct length");
        } else {
            System.out.println("student 1 data array has incorrect length");
        }
        System.out.println();
        if (student1.length == student2.length) {
            System.out.println("PASS: data arrays length match");
        } else {
            System.out.println("PASS: data arrays length doesn't match");
        }

        System.out.println(student1[1].toUpperCase() + " "+ student1[2].toUpperCase()+
                           "\n"+student2[1].toUpperCase() + " "+ student2[2].toUpperCase());
    }
}
