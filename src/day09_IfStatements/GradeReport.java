package day09_IfStatements;
/*1. garde report ==> A, B, C, D, F

 */
public class GradeReport {
    public static void main(String[] args) {
       int score = 80;// passing score 80 or more
       boolean a = score >= 90 && score <=100;
       boolean b = score >=80 && score <=89;
       boolean c = score >=70 && score <=79;
       boolean d = score >=60 && score <=69;
       boolean f = score >=0 && score <=60;

       if (a){
           System.out.println("Passing Score is A");
       }else if(b){
           System.out.println("Passing Score is B");
       }else if (c){
           System.out.println("Passing Score is C");
       }else if (d){
           System.out.println("Passing Score is D");
       }else{
           System.out.println("Passing Score is F");


       }
    }
}
