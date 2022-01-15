package day31_PracticeTask;
import java.util.Arrays;
public class MovieObject {
    public static void main(String[] args) {
        Movie movie1 = new Movie("USA", "Journey to SDET: Cydeo Batch 25","10/25/2021", "Kuzzat Altay");
        String[] casts = {"Asiya", "Adam", "Muhtar", "Gulshen", "Dimo", "Elena", "Farya", "Ali"};
        movie1.addCast("Eridona");
        movie1.addCasts(casts);
        System.out.println(movie1);
    }
    }

