package day36_Homework;

public class PhoneObject {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
       iPhone.setInfo("Apple","Pro","Small",1200,"White");

       iPhone.call(773-000-77-44);
       iPhone.text(773-00-77-444);
       iPhone.faceTime("daytime@gmail");
       iPhone.faceTime(773-00-77-444);

        System.out.println(iPhone);


        Samsung samsung = new Samsung();
        samsung.setInfo("Galaxy","GXR","LI",800,"Black");

        samsung.call(123-345-6789);
        samsung.text(123-345-6789);
        samsung.freeze();
        System.out.println(samsung);


        Nokia nokia = new Nokia();
        nokia.setInfo("Nokia","3300","bg",500,"Pink");
        nokia.selfDefense();
        System.out.println(nokia);




    }
}
