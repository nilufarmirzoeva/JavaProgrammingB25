package Day1_12_04_2021;

public class ColorRedAndBlue {
    public static void main(String[] args) {
        String word = "redxx";
        String temp = "";
        if (word.startsWith("red")) {
            temp = "\"red\"";
        }
        if (word.startsWith("blue")) {
            temp = "\"blue\"";


    } else {
            temp = "\"\"";
        }
        System.out.println("temp=");

    }
}
/* 2.
                Given a string, if the string begins with "red" or "blue" print that color string,
                otherwise print the empty string.

                input :"redxx" → "red"
                input :"xxred" → ""
                input :"blueTimes" → "blue"

 */