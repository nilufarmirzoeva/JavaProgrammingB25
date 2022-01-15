package day09_IfStatements;

public class Cigarettes {
    public static void main(String[] args) {
        byte age = 11;
        boolean isEligible=age>=21;
        if(isEligible){
            System.out.println("The person is eligible to buy Cigarettes");
        }
        if(!isEligible){
            System.out.println("Not eligible");

        }
    }
}
/*1. Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes

 */