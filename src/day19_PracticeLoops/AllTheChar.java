package day19_PracticeLoops;

import java.util.Scanner;
/* 3. Write a program that can display all the characters that appeared twice in the string.

 */

public class AllTheChar {
    public static void main(String[] args) {
        System.out.println("Enter your sentence");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String result = "";
        for (int i = 0; i <str.length(); i++) {
            int count = 0;
            for (int c = 0; c < str.length(); c++) {
                if(str.charAt(i)==str.charAt(c)){
                    result =""+str.charAt(i);
                    count++;
                }

            }
            if(count==2){
                break;
            }

        }
        System.out.println("First duplicated is:"+result);
        scan.close();

    }
}
