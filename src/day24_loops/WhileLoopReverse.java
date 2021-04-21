package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {
        int count = 5;
        while (count >= 0) {
            System.out.println("count = "+count);
            count--;
        }
        System.out.println("Finished the count");

        int unreadSMS = 20;
        System.out.println("I have total " +unreadSMS+" \uD83D\uDCE9 unread sms");
        while (unreadSMS > 0) {
            System.out.println("Read messages: \uD83D\uDCE9 "+unreadSMS);
            --unreadSMS;
        }
        System.out.println("Messages marked as read");
    }
}
