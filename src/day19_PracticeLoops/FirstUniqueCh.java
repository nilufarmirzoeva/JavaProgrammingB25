package day19_PracticeLoops;

import java.util.Scanner;
/*4. Write a program that can return the index number of the first unique character.

 */

public class FirstUniqueCh {
    public static void main(String[] args) {
        System.out.println("Enter your sentence");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int count =0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    result=str.indexOf(str.charAt(i));
                    count++;
                }
            }
            if(count==1){
                break;
            }
        }
        System.out.println("Index number of the first unique Char is:"+result);


    }
}
