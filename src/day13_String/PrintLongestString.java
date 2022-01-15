package day13_String;
import java.util.Scanner;
public class PrintLongestString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two strings");

        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        int lengthStr1=str1.length();
        int lengthStr2= str2.length();

        if (lengthStr1>lengthStr2){
            System.out.println("The longest one is:"+str1);
        }else{
            System.out.println("The longest one is:"+str2);

        }
        scan.close();
    }
}
/*2. write a program that asks user to enter two strings, and print out the longest string

 */