package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        // contain 26 char
        char[] alphabets = new char[26]; //Z~A
       /*
        alphabets[0]='Z';
        alphabets[1]='Y';
        alphabets[2]='X';

        */

        System.out.println(Arrays.toString(alphabets));
        System.out.println(alphabets[0]);//printing the element of array
        char ch = 'Z';
        for(int i = 0; i < alphabets.length; i++, ch-- ){
            alphabets[i] = ch;
        }

/*
        for(char i = 0, j = 'Z';  i < alphabets.length; i++, j-- ){
            alphabets[i] = j;
        }
*/

        //   System.out.println( alphabets );
        System.out.println( Arrays.toString(alphabets) ); // print the whole array
        //       System.out.println( alphabets[0] ); // printing the element of array








    }
}
