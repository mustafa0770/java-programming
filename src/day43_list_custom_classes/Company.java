package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.name = "Alice";
        employee2.name = "Tania";
        employee3.name = "Mila";

        employee1.jobTitle = "PO";
        employee2.jobTitle = "SDET";
        employee3.jobTitle = "Developer";

        employee1.work();
        employee2.work();
        employee3.work();
    }
}
