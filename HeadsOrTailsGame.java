import java.util.Random;
import java.util.Scanner;
public class HeadsOrTailsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Who are you? ");
        String userName = scanner.next();  
        scanner.nextLine();  
        System.out.println("Hello, " + userName + "!");

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