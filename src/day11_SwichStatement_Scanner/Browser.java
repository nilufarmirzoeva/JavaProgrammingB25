package day11_SwichStatement_Scanner;
/*1. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if

 */
public class Browser {
    public static void main(String[] args) {
        //nested if

        String browserName = "chrome";
        String selected = "";

        if (browserName == "chrome" || browserName == "firefox" || browserName == "opera" || browserName == "safari" || browserName == "edge") {

            if (browserName == "chrome") {
                selected = "chrome";
            } else if (browserName == "firefox") {
                selected = "firefox";
            } else if (browserName == "opera") {
                selected = "opera";
            } else if (browserName == "safari") {
                selected = "safari";
            } else {
                selected = "edge";
            }
        } else {
            System.out.println("Invalid Browser Name");

        }
        System.out.println(selected+" browser is selected");
    }
    }