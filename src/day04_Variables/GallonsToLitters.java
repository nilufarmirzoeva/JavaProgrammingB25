package day04_Variables;
/*5. Create a class named GallonsToLitters, Write a program that can convert gallon (int) to litter (double)
                    Hints: 1 gallon = 3.79 litters

 */
public class GallonsToLitters {
    public static void main(String[] args) {
        int gallons = 1000;
        double litters = 3.79* gallons;
        double gallonsToLitters = gallons* litters;
        System.out.println("gallons = " + gallons);
        System.out.println("litter = " + litters);
    }
}
