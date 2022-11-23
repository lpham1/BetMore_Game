import java.util.Random;

public class Shuffle {

    public static int generateNumber(){
        Random rand = new Random();
        int int_random = rand.nextInt(100)+1;
        return int_random;
    }
}
