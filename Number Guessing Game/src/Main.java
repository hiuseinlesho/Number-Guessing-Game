import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final String MESSAGE = "Enter your guess: ";
    public static final String DIFFICULTIES = "1. Easy - between 1 - 20\n" +
            "2. Medium - between 1 - 50\n" +
            "3. Hard - between 1 - 100\n";

    public static void main(String[] args) {
        System.out.println("Number Guessing Game\n" +
                "Guess the number between 1 and X\n");

        System.out.println("Choose difficulty level:");
        System.out.println(DIFFICULTIES);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your choice: ");
        int n = Integer.parseInt(scanner.nextLine());

        Random random = new Random();

        int x = 1;

        switch (n) {
            case 1:

                x = 20;
                break;
            case 2:

                x = 50;
            break;
            case 3:

                x = 100;
                break;
        }

        int randomNumber = random.nextInt(1, x);

        System.out.println(randomNumber);

    }

}
