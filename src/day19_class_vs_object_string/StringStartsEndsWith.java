package day19_class_vs_object_string;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String firstName = "Mr. Murodil";
        if (firstName.startsWith("Mr.")) {
            System.out.println("Man");
        } else if
        (firstName.startsWith("Dr.")) {
            System.out.println("Doctor");
        } else if
        (firstName.startsWith("Mrs.")) {
            System.out.println("Married woman");
        } else if
        (firstName.startsWith("Ms.")) {
            System.out.println("Single woman");
        } else if
        (firstName.startsWith("Sr.")) {
            System.out.println("Senior");
        } else {
            System.out.println("We are all part of this world");
        }

        String url = "Cars.com";
        if (url.endsWith(".com")) {
            System.out.println("Commercial web");
        } else if
        (url.endsWith(".ru")) {
            System.out.println("Russian web");
        } else if
        (url.endsWith(".gov")) {
            System.out.println("Government web");
        } else if
        (url.endsWith(".edu")) {
            System.out.println("Education web");
        } else if
        (url.endsWith(".org")) {
            System.out.println("Organization web");
        } else {
            System.out.println("Invalid Website!");
        }

    }
}
