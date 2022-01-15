package day19_PracticeLoops;

import java.util.Scanner;
/*2. Write a program that cna return the index number of the first duplicated character from a string

 */

public class IndexNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str =scan.nextLine();
        String result = "";
        for (int b = 0; b < str.length(); b++) {
            char ch= str.charAt(b);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if(ch==each){
                    count++;
                }
            }
            if(count==1){continue;}
            result+=ch+"";
        }
        System.out.println("result="+result);
        System.out.println(str.indexOf(result.charAt(0)));
        scan.close();


    }
}
