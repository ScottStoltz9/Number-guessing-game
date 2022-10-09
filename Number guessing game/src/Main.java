import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GuessingNumberGame();
    }

    public static void GuessingNumberGame() {
        int numberOfTriesLeft = 5;
        int randomNumber = 1 + (int) (100 * Math.random());
        System.out.println("Number will be from 1 to 100");

        for (int i = 0; i < numberOfTriesLeft; i++) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("Congrats you guessed correctly");
                break;

            } else if (userGuess > randomNumber && i != numberOfTriesLeft - 1) {
                System.out.println("The number is lower than " + userGuess);

            } else if (userGuess < randomNumber && i != numberOfTriesLeft - 1) {
                System.out.println("The number is greater than " + userGuess);
            }
            else {
                System.out.println("Ran out of tries");
                System.out.println("The number was " + randomNumber);
                System.out.println("Do you want to try again?");
                System.out.println("Y/N");
                String answer = scanner.next();
                if(answer.equalsIgnoreCase("y")) {
                    GuessingNumberGame();
                }
                else {
                    System.out.println("Thank you for playing");
                    break;
                }
            }
        }
    }
}
