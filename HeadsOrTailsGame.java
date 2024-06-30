import java.util.Random;
public class HeadsOrTailsGame {
    public static void main(String[] args) {

        Random random = new Random();
        int headsCount = 0;
        int tailsCount = 0;

        System.out.println("Tossing a coin...");
        for (int i = 0; i < 3; i++) {
            String result;
            if (random.nextBoolean()) {
                result = "Heads";
                headsCount++;
            } else {
                result = "Tails";
                tailsCount++;
            }
            System.out.println("Round " + (i + 1) + ": " + result);
        }

        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);

    }
}