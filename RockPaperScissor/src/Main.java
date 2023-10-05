import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    printIntroToGame();
    compareValues();

    }

    public static void printIntroToGame() {
        Scanner scanner = new Scanner(System.in);
        String userName;
        System.out.println("What is your name:");
        userName = scanner.next();

        // Intro to the Game & Explains the points system
        String line = "----------------------------------------";
        System.out.println(line);
        System.out.println("Welcome " + userName + "!!!");
        System.out.println("This is a Rock Paper Scissor game.");
        System.out.println("Your objective is to beat the computer.");
        System.out.println("The first one to get three points wins.");
        System.out.println(line);
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
        while (!userAnswer.equals("rock") && (!userAnswer.equals("paper")) && (!userAnswer.equals("scissor")));

        return userAnswer;
    }

    public static void compareValues() {

        int computerPoints = 0;
        int userPoints = 0;

        while (computerPoints < 3 && userPoints < 3) {
            String computerAnswer = arrayOfAnswers();
            String userAnswer = askForUserInput();
            System.out.println(computerAnswer);

            if (computerAnswer.equals("rock") && userAnswer.equals("paper")) {
                userPoints++;
            }
            else if (computerAnswer.equals("rock") && userAnswer.equals("scissor")) {
                computerPoints++;
            }
            else if (computerAnswer.equals("rock") && userAnswer.equals("rock")) {
                System.out.println("Is a tied");
            }
            else if (computerAnswer.equals("paper") && userAnswer.equals("scissor")) {
                userPoints++;
            }
            else if (computerAnswer.equals("paper") && userAnswer.equals("rock")) {
                computerPoints++;
            }
            else if (computerAnswer.equals("paper") && userAnswer.equals("paper")) {
                System.out.println("Is a tied");
            }
            else if (computerAnswer.equals("scissor") && userAnswer.equals("rock")) {
                userPoints++;
            }
            else if (computerAnswer.equals("scissor") && userAnswer.equals("paper")) {
                computerPoints++;
            }
            else {
                System.out.println("Is a tied");
            }

            System.out.println("User Points: " + userPoints);
            System.out.println("Computer Points: " + computerPoints);
        }
    }
}