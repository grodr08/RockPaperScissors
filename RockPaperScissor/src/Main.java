import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    printIntroToGame();

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
}