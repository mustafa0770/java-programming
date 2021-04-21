package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args){
        int Toyota = 431;
        int Honda = 233;
        int Tesla = 15;
        int Nissan = 12;
        int BMW = 25;
        int totalCars = Toyota + Honda + Tesla + Nissan + BMW;

        System.out.println("There are " +totalCars+ " in a parking lot.");

        String pizza = "Thai";
        int slices = 8;
        int people = 4;
        int perPerson = slices / people;
        System.out.println(perPerson+" slices per person.");
        // we ordered hawaiian pizza with 8 slices, 4 people ate 2 slices each

        System.out.println("We ordered Thai pizza with "+slices+" slices, "+people+" people ate " +perPerson+ " slices each.");

    }
}
