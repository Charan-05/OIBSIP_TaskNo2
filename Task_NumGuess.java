import java.util.*;

public class Task_NumGuess {
    public static void main(String[] args) {
        int Gen_no = (int) (Math.random() * 100) + 1;
        Scanner input = new Scanner(System.in);
        int guessedno = 0;
        int chances = 1;
        System.out.println("Hello User! Welcome to the Number Guessing Game!");
        do {
            System.out.print("Guess a number between 1 & 100: \n");
            if (input.hasNextInt()) {
                guessedno = input.nextInt();
                if (guessedno == Gen_no) {
                    System.out.println("You Win!");
                    break;
                } else if (guessedno < Gen_no)
                    System.out.println("Your Guess Number is Smaller.");
                else if (guessedno > Gen_no)
                    System.out.println("Your Guess Number is Greater.");
                if (chances == 5) {
                    System.out.println("Game Over! Attempts are finished");
                    break;
                }
                chances++;
            }
        } while (guessedno != Gen_no);
    }
}