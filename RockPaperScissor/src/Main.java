import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    printIntroToGame();
    System.out.println(arrayOfAnswers());

    }

    public static void printIntroToGame() {
        Scanner scanner = new Scanner(System.in);
        String userName;
        System.out.println("What is your name:");
        userName = scanner.next();

        System.out.println("Welcome " + userName + "!!!");
        System.out.println("This is a Rock Paper Scissor game.");
        System.out.println("Your objective is to beat the computer.");
        System.out.println("The first one to get three points wins.");
    }

    public static String arrayOfAnswers() {
        // Array containing the 3 answers
        String[] rockPaperScissorArray = {"Rock", "Paper", "Scissor"};

        Random random = new Random();

        // Generates a random index within the bounds fo the array
        int randomIndex = random.nextInt(rockPaperScissorArray.length);

        // Get the random string from the array
        return rockPaperScissorArray[randomIndex];
    }
}