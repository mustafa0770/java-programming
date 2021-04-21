package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        String carModel = "BMW";
        String driverName = "Mustafa";
        String licenseNumber = "Y123456";
        byte speed = 120;
        boolean isAutomatic = true;
        char licenseClass = 'C';

        System.out.println("****** Traffic Violation ******");
        System.out.println("Car Model:\t\t\t"+carModel);
        System.out.println("Driver Name:\t\t"+driverName);
        System.out.println("License Number:\t\t"+licenseNumber);
        System.out.println("Speed:\t\t\t\t"+speed+" mph ");
        System.out.println("Is it Automatic: \t"+isAutomatic);
        System.out.println("License Class:\t\t"+licenseClass);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        //Mustafa is driving BMW
        System.out.println();
        System.out.println(driverName + " is driving " + carModel);
        System.out.println(isAutomatic+" - "+licenseClass);

        String str = "My name is ";
        String firstName = "Mustafa";
        System.out.println(str + firstName);



    }

}
