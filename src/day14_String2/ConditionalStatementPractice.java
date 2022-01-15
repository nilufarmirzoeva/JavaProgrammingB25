package day14_String2;
import java.util.Scanner;

public class ConditionalStatementPractice {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();

        if(name.equals("James")){
            System.out.println("doctor");
        }else{
            System.out.println("student");
        }
        inp.close();











    }
}
