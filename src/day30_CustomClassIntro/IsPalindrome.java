package day30_CustomClassIntro;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class IsPalindrome {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ana","Racera","Level","Eye","Java","Python","Cydeo"));

        names.removeIf(name -> !StringUtility.isPalindrome(name));

        System.out.println(names);

    }
}
