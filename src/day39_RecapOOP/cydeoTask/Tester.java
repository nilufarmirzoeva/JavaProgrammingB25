package day39_RecapOOP.cydeoTask;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void createTicket(){
        System.out.println(getJobTitle() + " " +" is create ticket");

    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+ " " +getName() + "is testing application");
    }
}
/*  3. Create a subclass of Employee named Tester

            Override the work method

            Extra methods:
                createTicket()

 */