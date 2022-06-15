import java.util.Random;
import java.util.Scanner;

class game {

    public int number;
    public int userInput;
    public int noOfGuesses = 0;
    Scanner sc = new Scanner(System.in);

    public void description() {
        System.out.println("\n\n*****************HERE'S THE GAME GUESSING NUMBER*****************\n");
        System.out.println("   ||||||First read the description carefully!|||||\n");
        System.out.println(
                "@ The Computer has generate a random number from 1 to 100.\n@ You have to guess that number until you can guess the exact number.\n@ Your score is : [10 - the number of attempts you take to the correct]");
        System.out.println("\n\nSo you read all about): BE SURE READY TO START THE GAME>>>>>>\n\n");
        System.out.println("Let's start go, Enter your guesses now: >>> ");
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    public void takeUserInput() {
        System.out.print("Guess the number # # # # # # # # # # #: ");
        userInput = sc.nextInt();
    }

    public boolean isCorrectNumbe() {
        noOfGuesses++;
        if (number == userInput) {
            System.out.println("Yes you guess the number right,it was " + number + "\n  You guess it in " + noOfGuesses
                    + " attempts \n  So your score is ): " + (10 - noOfGuesses));
            return true;
        } else if (number < userInput) {
            System.out.println("Oopps it is Too high...");
        } else if (number > userInput) {
            System.out.println("Oopps it is Too low...");
        }
        return false;
    }

    public boolean repeatGame() {
        System.out.print("\nAre you want to play again, if sure PRESS \'0\' ::$  ");
        // Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        if (r == 0) {
            return true;
        } else {
            return false;
        }
    }
}

public class GuessTheNumberGame {
    public static void main(String[] args) {

        boolean t;
        do {
            game g = new game();
            g.description();
            boolean b = false;
            while (!b) {
                g.takeUserInput();
                b = g.isCorrectNumbe();
            }
            t = g.repeatGame();
        } while (t);
    }
}
