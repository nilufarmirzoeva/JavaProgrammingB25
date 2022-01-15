package day09_IfStatements;
/*2. Minimum number between two different numbers

 */
public class MinimumNumber {
    public static void main(String[] args) {
        int num1=139;
        int num2=34;// num2 is a minimum number

        boolean num1IsMin1=num1<num2;
        boolean num2IsMin2=num2<num1;
        boolean equal=num1==num2;


        if(num1IsMin1){
            System.out.println(num1+" is a Minimum number");
        }else if(num2IsMin2)
            System.out.println(num2+" is a Minimum number");
        else{
            System.out.println("Equal");
        }

    }
}
