package day19_PracticeLoops;

public class DuplicatedCharacter {
    public static void main(String[] args) {
        String str = "aaabddv";
        String result="";
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count =0;
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if(ch==each){
                    count++;
                }
                if (count>1){
                    result+=ch;
                }
                }
            }
        System.out.println(result.charAt(0));
        }

    }

