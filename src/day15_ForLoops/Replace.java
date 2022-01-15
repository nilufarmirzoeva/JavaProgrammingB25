package day15_ForLoops;
import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        String word = new Scanner(System.in).next();
        System.out.println("Enter a word");


        if (word.charAt(0) == 'x') {
            word.replaceFirst("x","a");
        }
            System.out.println(word);


        }
    }

