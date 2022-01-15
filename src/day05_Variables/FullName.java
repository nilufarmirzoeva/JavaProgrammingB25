package day05_Variables;

public class FullName {
    public static void main(String[] args) {

        String firstName= "Cydeo";
        String lastName= "School";
        String fullName = firstName + " "+ lastName;
        int age = 50;
        String jobTitle= "SDET";
        String companyName= "Apple";
        double salary = 1100000;

        System.out.println(" Full name of the person is "+ fullName );
        System.out.println(" fullName " + " is " + age + "years old");
        System.out.println(fullName+ "is" + jobTitle+", works at " + companyName+
                ", and"+ fullName+"'s salary is $"+salary);
    }
}
