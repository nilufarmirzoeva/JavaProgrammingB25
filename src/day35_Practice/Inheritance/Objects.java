package day35_Practice.Inheritance;

public class Objects {
    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.setInfo("Aziza ","SDET","Apple",'F',30,123,120000);
        tester.work();
        System.out.println("tester = " + tester);

        Driver driver = new Driver();
        driver.setInfo("Anisa ","Driver","BAExpress",'F',23,120,150000);
        driver.work();
        System.out.println("driver = " + driver);

        Teacher teacher = new Teacher();
        teacher.setInfo("Margie","Teacher","Cydeo",'F',30,45,2000000);
        teacher.work();

        System.out.println("teacher =" +teacher);

        Developer developer = new Developer();
        developer.setInfo("Abdullo","Developer","Amazone",'M',20,34,300000);
        developer.work();
        System.out.println("developer = " + developer);
    }
}
