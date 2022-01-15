package day09_IfStatements;
/*3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                200 is the maximum number

 */
public class MaxOfTwoNum {
    public static void main(String[] args) {
        int n1=100;
        int n2=200;
        boolean maxNumber1= n1>n2;
        boolean maxNumber2 =n2>n1;
        boolean Equal=n1==n2;

        if(maxNumber1){
            System.out.println(n1+ "maximum number");
        }else{

            System.out.println(n2 +" maximum number");
        }
        if(Equal){
            System.out.println("Equal");
        }




    }
}
