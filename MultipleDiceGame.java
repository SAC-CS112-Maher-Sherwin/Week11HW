package multipledicegame;
import java.util.Scanner;

public class MultipleDiceGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ComputerRoll r = new ComputerRoll();
        UserGuess u = new UserGuess();
        History h = new History();
        String playAgain = "y";
        int diceThrows = 0;
        int Games = 1;
        int Wins = 0;
        
        System.out.println("Welcome! Let's play a Dice Game.");
          
    // Prompt user to enter how many dice they want to roll.
        while (playAgain.equalsIgnoreCase("y")){
            Games = h.addToGames(Games);
            
        System.out.print("How many dice do you want to roll? ");
            int numberOfDice = r.setNumberOfDice();
            diceThrows = h.addToThrows(numberOfDice);
            
    // Prompt user to guess the amount of points they will roll
    
        System.out.printf("\nOkay! You're about to roll %d dice. \nCan you guess how many points "
                + "you will roll in total? ", numberOfDice);
        int userGuess = u.setUserGuess(numberOfDice);
            
    // Roll the dice, display rolls, and compare total with user's guess
    
        int diceRoll = r.getRoll(numberOfDice);
        u.compareGuessAndRoll(userGuess, diceRoll);
        Wins = h.checkForWins(userGuess, diceRoll, Wins);
        u.displayResults();
    
    // Ask user if they want to play again. If yes, loop.
        
        System.out.println("\nDo you want to play again? (Y/N)");
        playAgain = input.nextLine();
            
        }    
    
    // If user no longer wants to play, print the history
    
        h.printHistory(Games, diceThrows, Wins);
        
    }
    
}
   