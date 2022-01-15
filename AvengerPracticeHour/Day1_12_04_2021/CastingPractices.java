package Day1_12_04_2021;

public class CastingPractices {
    public static void main(String[] args) {
        byte b=10;
        short s = b; // implicit casting
        //double to int

        double d = 5.3;
        int i = (int)d; // explicit casting


        // long to int
        long l= 99999999999L;
        int k =(int)l;
        System.out.println("k = " + k);



    }
}
