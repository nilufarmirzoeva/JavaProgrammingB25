package day24_CustomMethod_Return;

public class WarmupTasks {
    public static void main(String[] args) {
        initials("cydeo","school");
        System.out.println("----------------------------------");
        domain("Cydeo.Scool@yahoo.com");
        System.out.println("------------------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };

        for (String email : emails) {
            domain(email);
        }
        System.out.println("----------------------------------------");
        nameOfMonth(12);
        System.out.println("-------------------------------------------");
        nameOfDay(5);
        System.out.println("-------------------------------------------");
        daysInMonth(5);

    }
    public static void initials(String firstName,String lastName){
        String initial = firstName.charAt(0)+"."+lastName.charAt(0);
        initial= initial.toUpperCase();
        System.out.println("initial="+ initial);
    }

    public static void domain(String email){ // Cydeo@gmail.com
        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }

    public static void nameOfMonth(int number){
        String name = "";
        if(number >= 1 && number<=12){
            name =(number==1)?"Jan" : (number==2)?"Feb":(number==3)?"March":(number==4)?"Apr":(number==5)?"May":(number==6)
                    ?"Jun":(number==7)?"July":(number==8)?"Aug":(number==9)?"Sep":(number==10)?"Oct":(number==11)?"Nov":"Dec";

        }else{
            name = "Invalid";
        }
        System.out.println("Month name = " + name);

    }

    public static void nameOfDay(int number){
        String name= "";
        if(number>=1 && number<=7){
            name=(number == 1) ? "Monday" :(number == 2)? "Tuesday" :(number== 3)? "Wednesday" :( number== 4)? "Thursday"
                    :(number == 5)? "Friday" :(number==6)? "Saturday" : "Sunday";
        }else{
            name="Invalid";
        }
        System.out.println("Day name = " + name);

    }
    public static void daysInMonth(int number){
        if(number>=1&&number<=12){
            switch (number) {
                case 2:
                    System.out.println("28 days");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 days");
                    break;
                default:
                    System.out.println("31 days");
            }


        } else {
            System.out.println("Invalid Number");
        }



    }
}
/*1. Create a method that can display the initials of the person

2. Create a method that can display the domain of the email

3. Create a method that can display the name of the month based on the given number to the method

4. Create a method that can print the name of the day based on the given number to the method

5. Create a method that can print how many days a month has

16

You do not have permission to send messages in this channel.


 */