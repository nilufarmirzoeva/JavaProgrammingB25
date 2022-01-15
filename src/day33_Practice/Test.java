package day33_Practice;

public class Test {
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Nilufar",30,'F',14,25,2,'A');
        CydeoStudent student2 = new CydeoStudent("Aziza",32,'F',23,25,2,'A');

        System.out.println(student1);
        System.out.println(student2);


        student1.printSchoolName();
        student2.printSchoolName();

        student1.printProgLanguage();
        student2.printProgLanguage();







    }
}
