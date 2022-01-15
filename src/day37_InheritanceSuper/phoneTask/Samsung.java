package day37_InheritanceSuper.phoneTask;

public class Samsung extends Phone{


    public Samsung( String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);

    }

    public void freeze(){
        System.out.println(brand + " " + brand+ "is freezing");
    }
}






/*Create a sub class of Phone named Samsung:
                Variables:
                    brand, model, size, price, color

                Methods:

                    call(long phoneNumber)
                    text(long phoneNumber)
                    freeze()
                    toString()



 */
