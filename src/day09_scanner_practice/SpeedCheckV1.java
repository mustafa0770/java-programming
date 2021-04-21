package day09_scanner_practice;

public class SpeedCheckV1 {
    public static void main(String[] args) {
        System.out.println("***** Speed Warning *****");
        int speedLimit = 65;
        int currentSpeed = 80;
        int overTheLimit = currentSpeed - speedLimit;
        System.out.println("You are driving "+overTheLimit+"mph over the limit. Slow Down!");

    }
}
