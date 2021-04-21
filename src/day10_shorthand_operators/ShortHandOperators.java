package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("Cars in parking lot = " + cars);
        cars = cars +4;
        System.out.println("Cars in parking lot = " + cars);
        cars += 5;
        System.out.println("Cars in parking lot = " + cars);

        //6 cars left the parking
        cars -= 6;
        System.out.println("Cars in parking lot = " + cars);

        cars = cars - 1;
        cars -= 1;
        System.out.println("Cars in parking lot = " + cars);

        int electricCars = 13;
        cars += electricCars;
        System.out.println("Electric cars = " + cars);

        String word = "JAVA";
        System.out.println("word = " + word);
        
        word = word + " programming";
        System.out.println("word = " + word);
        // add "is fun"
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = " but selenium is more fun.";
        word += selenium;
        System.out.println("word = " + word);

        word += 12345;
        System.out.println("word = " + word);

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter +=3;
        System.out.println("letter = " + letter);
        // add J to letter
        letter += '2';
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("Normal parking fee = " + parkingFee);
        //early bird fee is 50 off
        parkingFee /= 2;
        System.out.println("Early bird parking fee = " + parkingFee);
        // weekend parking is free
        parkingFee -= parkingFee;
        System.out.println("Weekend parking fee = " + parkingFee);

    }
}
