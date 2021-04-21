package day19_class_vs_object_string;

public class LoginTest {
    public static void main(String[] args) {

        String expUserName = "Mustafa07";
        String expPassword = "ABC321";

        String userName = "mustafa07";
        String password = "AAC321";

        if(expUserName.equalsIgnoreCase(userName) && expPassword.equalsIgnoreCase(password)) {
            System.out.println("Pass - user logged in successfully ");
        } else {
            if(!expUserName.equalsIgnoreCase(userName)) {
                System.out.println("Fail - username is o=incorrect");
            } else {
                if(!expPassword.equalsIgnoreCase(password)) {
                    System.out.println("Fail - password is incorrect");
                }
            }
        }
    }
}
