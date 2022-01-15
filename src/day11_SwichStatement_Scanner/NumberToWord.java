package day11_SwichStatement_Scanner;
/*2. Write a program that can convert numbers 0~9 to words.

    NOTE: MUST use ternary

 */
public class NumberToWord {
    public static void main(String[] args) {
        int num=4;
        String result =(num>=0 && num<=9)?
                (num==0)?"Zero":(num==1)?"One":(num==2)?"Two":(num==3)?"Tree"
                        :(num==4)?"Four":(num==5)?"Five":(num==6)?"Six":(num==7)?"Seven"
                        :(num==8)?"Eight":"Nine"
                :"Invalid Number";
        System.out.println(result);






    }
}
