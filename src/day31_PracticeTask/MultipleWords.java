package day31_PracticeTask;

import java.util.Arrays;

public class MultipleWords {
    public static void main(String[] args) {

        String words =  "Knife, wooden spoon, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String [] splitArr = words.split(", ");

        System.out.println(Arrays.toString(splitArr));

        for(String eachWord:splitArr){
            if(eachWord.contains(" ")){
                System.out.println(eachWord);
            }
        }












    }
}
/*

    Task :  Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

        output : wooden spoons
                 trash can
                  dish washer
         */