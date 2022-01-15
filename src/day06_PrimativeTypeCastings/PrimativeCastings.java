package day06_PrimativeTypeCastings;

public class PrimativeCastings {
    public static void main(String[] args) {
       byte a = 100;
       short b = a;

       int c = b;
       long d = c;
       float e = d;
       double f = e;


        int x = 55;
        short y = (short)x; // explicit casting
         System.out.println(x + ":" +y);

         double d1 = 20.05;
         short s1= (short) d1;
        System.out.println(d1+ ":"+s1);



    }
}
