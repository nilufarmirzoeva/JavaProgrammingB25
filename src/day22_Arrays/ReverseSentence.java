package day22_Arrays;

import java.util.Arrays;

/*1. Write a program that can reverse a sentence
        Ex:
        sentence = "Today is a good day to learn Java";

        output:
        Java learn to day good a is Today

 */
public class ReverseSentence {
    public static void main(String[] args) {
        String sentence="Java learn to day good a is Today";
        String [] words = sentence.split("");
        System.out.println(Arrays.toString(words));
        String reversedSentence = ""; // Java learn to day good a is Today

        for (int i = words.length-1; i >=0 ; i++) {
            reversedSentence+=words[i]+"";

        }
        System.out.println(reversedSentence);

    }
}
