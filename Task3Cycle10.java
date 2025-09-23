import java.util.Scanner;
import java.util.Random;

public class Task3Cycle10 {
    public void guessGame(Scanner scanner) {
        Random random = new Random();
        int target = random.nextInt(10);
        int attempts = 0;
        int guess;
        do {
            System.out.println("Введите число от 0 до 9:");
            guess = scanner.nextInt();
            attempts++;
            if (guess == target) {
                System.out.println("Вы угадали!");
            }
            else {
                System.out.println("Вы не угадали, введите число от 0 до 9:");
            }
        } while (guess != target);
        System.out.println("Вы отгадали число за " + attempts + " попытки(ок)");
    }
}
