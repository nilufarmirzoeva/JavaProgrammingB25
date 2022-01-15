package practice_12_08_2021;

public class SwitchEx {
    public static void main(String[] args) {
        String animal = "Cat";
        String result = "";

        switch (animal){
            case "Dog":
            case "Cat":
                result = "domestic animal";
                break;

            case "Tiger":
                result="wild animal";
                break;
            default:
                result="unknown animal";
                break;
        }
        System.out.println(animal+ " is "+result);

    }
}
/* Create  a program that accepts animal as String

                            DOG     - domestic animal
                            CAT     - domestic animal
                            TIGER     - wild  animal

                            For other animal - unknown animal

                            INPUT : DOG         EXPECTED OUTPUT : DOG is domestic animal */
