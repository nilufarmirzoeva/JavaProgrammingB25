package practice_1_12_2022.constructor;

public class BaklavaRecipe {

    public String type;
    public int amountLB;
    public double price;

    public BaklavaRecipe(String type, int amountLB, double price) { // constructor
        this.type = type;
        this.amountLB = amountLB;
        this.price = price;
    }
}
/*

        - Create a class called BaklavaRecipe

        Attributes:

            String type, int amountLB, double price

        - Add A constructor that can set all the filed

        Actions:
           feedback(), static order() , toString()

        - Create a object class called BaklavaObjects

        */