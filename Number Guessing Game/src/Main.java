import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(Constants.TITLE);

        System.out.println("Choose difficulty level:");
        System.out.println(Constants.DIFFICULTIES);

        Scanner scanner = new Scanner(System.in);

        System.out.print(Constants.MESSAGE);
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
