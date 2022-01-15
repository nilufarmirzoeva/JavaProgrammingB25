package day09_IfStatements;
/*1. Maximum number between two different numbers

 */
public class MaxNum {
    public static void main(String[] args) {
     int n1=1450;
     int n2=200;

     boolean n1isMaxNum=n1>n2;
     boolean n2isMaxNum=n2>n1;
     boolean equal = n1==n2;

     if (n1isMaxNum){
         System.out.println(n1+" is Maximum number");
     }else if(n2isMaxNum) {
         System.out.println(n2+"is Maximum number");
     }else{
         System.out.println("Equal");
        }












    }
}
