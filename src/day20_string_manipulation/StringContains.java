package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ita"));
        System.out.println(company.contains("l o"));

        if (company.contains(" ")) {
            System.out.println("Multiple words company name");
        } else {
            System.out.println("Single word company name");
        }
    }
}
