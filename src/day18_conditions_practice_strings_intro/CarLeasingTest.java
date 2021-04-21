package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "E";
        double leasingPrice = 0.0;
        
      //  if(make.equals("Mercedes") && model.equals("E")) {
      //      leasingPrice = 500.0;
      //  } else if (make.equals("Mercedes") && model.equals("A")) {
      //      leasingPrice = 400.0;
      //  }


        if(make.equals("Mercededs")) {
            if(model.equals("E")) {
                leasingPrice = 500.0;
            } else if (model.equals("A")) {
                leasingPrice = 400.0;
            }
        } else {
            System.out.println("Invalid make");
        }
        System.out.println("Make = " +make);
        System.out.println("Model = " +model);
        System.out.println("Leasing Price = $" + leasingPrice);
    }
}
