package day15_ForLoops;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max=-2147483648;// max=1 // any user entered number will be greater than -2147483648
        // max= 12

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num=scan.nextInt();//1

            if(num>max){
                max=max; //if the user entered number is greater than current maximum number
            }


        }
        System.out.println("max="+max);
        scan.close();

        }
    }
