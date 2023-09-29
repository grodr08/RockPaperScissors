import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    printIntroToGame();
    askForUserInput();
    compareValues();

    }

    public static void printIntroToGame() {
        Scanner scanner = new Scanner(System.in);
        String userName;
        System.out.println("What is your name:");
        userName = scanner.next();

        // Intro to the Game & Explains the points system
        System.out.println("||----------------------------------------||");
        System.out.println("|| Welcome " + userName + "!!!                         ||");
        System.out.println("|| This is a Rock Paper Scissor game.     ||");
        System.out.println("|| Your objective is to beat the computer.||");
        System.out.println("|| The first one to get three points wins.||");
        System.out.println("||----------------------------------------||");
    }

    public static String arrayOfAnswers() {
        // Array containing the 3 answers
        String[] rockPaperScissorArray = {"rock", "paper", "scissor"};

        Random random = new Random();

        // Generates a random index within the bounds fo the array
        int randomIndex = random.nextInt(rockPaperScissorArray.length);

        // Get the random string from the array
        return rockPaperScissorArray[randomIndex];
    }

    public static String askForUserInput() {
        String userAnswer;

        // Asks the user for input and stores the value in userAnswer
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println("Time to start playing!!!");

        do {
            System.out.println("You must choose between 'Rock', 'Paper' or 'Scissor':");
            userAnswer = scanner.next().toLowerCase();
        }
        while (userAnswer.equals("rock") || userAnswer.equals("paper") || userAnswer.equals("scissor"));

        return userAnswer = scanner.next();
    }

    public static void compareValues() {
        String computerAnswer = arrayOfAnswers();
        String userAnswer = askForUserInput();

        int computerPoints = 0;
        int userPoints = 0;

//        while (computerPoints < 3 || userPoints < 3) {
//
//        }

        System.out.println(computerAnswer);
        System.out.println(userAnswer);
    }
}