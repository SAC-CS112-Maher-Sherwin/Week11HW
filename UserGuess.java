package multipledicegame;
import java.util.Scanner;

public class UserGuess {

    Scanner input = new Scanner(System.in);
    String results;
    
    public int setUserGuess (int numberOfDice){
        int i = input.nextInt();  
        return i;
    }

    public String compareGuessAndRoll(int userGuess, int diceRoll) {
        if (userGuess == diceRoll)
        {
            String s = "\n\nYou guessed correctly! You rolled a total of " + diceRoll + ".";
            results = s;
            return results;
        }
        else if (userGuess < diceRoll)
        {
            String s = "\n\nSorry, your guess is too low! You rolled a total of " + diceRoll + ".";
            results = s;
            return results;
        }
        else
        {
            String s = "\n\nSorry, your guess is too high! You rolled a total of " + diceRoll + ".";
            results = s;
            return results;
        }
    }
    
    public void displayResults()
    {
        System.out.println(results);
    }
}
