package day36_Inheritance.day38_Inheritance2.car;

public class Toyota extends Car{


    public Toyota( String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand+" "+model+" is reliable");
    }

}

/*
1. Toyota:
					extra methods:
							reliable()
 */

