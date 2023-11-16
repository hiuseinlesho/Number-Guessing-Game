import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(Constants.TITLE);

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Choose difficulty level:");
            System.out.println(Constants.DIFFICULTIES);

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

            System.out.println("\nLet's get started!");
            System.out.print(Constants.MESSAGE);

            int attempts = 0;

            int number = Integer.parseInt(scanner.nextLine());

            while (number != randomNumber) {

                int diff = randomNumber - number;

                switch (n) {
                    case 1:

                        if (diff > 0) {
                            if (diff > 3) {

                                System.out.println(Constants.TOO_LOW);
                            } else {

                                System.out.println(Constants.LOW);
                            }
                        } else {
                            if (diff < -3) {

                                System.out.println(Constants.TOO_HIGH);
                            } else {

                                System.out.println(Constants.HIGH);
                            }
                        }
                        break;
                    case 2:


                        break;
                    case 3:


                        break;
                }

                attempts++;

                System.out.print(Constants.MESSAGE);

                number = Integer.parseInt(scanner.nextLine());
            }

            System.out.printf("Correct! You guessed the number in %d attempts.\n", attempts);

            System.out.print("\nDo you want to play again? (yes/no): ");

            String answer = scanner.nextLine();

            if (answer.equals("yes")) {

                System.out.println();
            } else if (answer.equals("no")) {
                System.out.println("Goodbye!");
                break;
            }

        } while (true);

    }

}
