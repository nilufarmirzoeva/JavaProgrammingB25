package Day1_12_04_2021;

public class StringWithoutFirstAndLast {
    public static void main(String[] args) {
        String word = "xHix";
        String temp = "";
        if(word.charAt(0)=='x'&& word.charAt(word.length()-1)=='x'){
            for (int i = 1; i < word.length()-1; i++) {
             temp+=word.charAt(i);
           // temp=word.substring(1,word.length()-1);

            }

        }else if(word.charAt(0)=='x'){
            for (int i = 0; i < word.length() ; i++) {
                temp+=word.charAt(i);


            }
        }else if(word.charAt(word.length()-1)=='x')  {
           for (int i = 0; i < word.length()-1; i++) {
                temp+=word.charAt(i);

            }

        }
        System.out.println("temp = " + temp);
    }
}
/*/**
 * 3.
 * Given a string, if the first or last chars are 'x', print the string without those 'x' chars,
 * and otherwise print the string unchanged.
 * (do with for loop)
 * <p>
 * <p>
 * input :"xHix" → "Hi"
 * input :"xHi" → "Hi"
 * input :"Hxix" → "Hxi"
 */
/*if (word.charAt(0) == 'x' && word.charAt(word.length() - 1) == 'x') {
            temp = word.substring(1, word.length() - 1);
        }
        else if(word.charAt(0) == 'x'){
            temp = word.substring(1);
        }else if(word.charAt(word.length() - 1) == 'x'){
            temp = word.substring(0,word.length()-1);
        }else {
            temp = word;
        }
        System.out.println(temp);

 */


