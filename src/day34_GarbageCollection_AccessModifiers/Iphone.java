package day34_GarbageCollection_AccessModifiers;

public class Iphone {
    public static String brand,madeIn, designedIn, OS;
    public String model,size,color;
    public double price;
    public static boolean isSmartPhone;

    public Iphone(String model, String size, String color, double price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }
    static {
        brand = "Iphone";
        OS = "IOS";
        isSmartPhone=true;
        madeIn = "China";
        designedIn ="USA";
    }
    public void call(long phoneNumber){
        System.out.println(brand+" "+model+"is calling"+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(brand+" "+model+"is calling"+phoneNumber);
    }
    public void faceTime(long phoneNumber){
        System.out.println(brand+" "+model+"is face timing with the phone number : "+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand+" "+model+"is face timing with the email: "+ email);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                "brand='" + brand + '\'' +
                "OS='" + OS + '\'' +
                "isSmart='" + isSmartPhone+ '\'' +
                "made in='" + madeIn+ '\'' +
                "designed in='" +designedIn+ '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*1. Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()


 */