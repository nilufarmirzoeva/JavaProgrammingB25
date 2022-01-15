package day36_Homework;

public class IPhone extends Phone{
    public void faceTime(long phoneNumber){
        System.out.println("Facetime with phone number: " +phoneNumber);
    }
    public void faceTime(String email){
        System.out.println("Facetime with email: " + email);
    }






}
/*1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()


 */