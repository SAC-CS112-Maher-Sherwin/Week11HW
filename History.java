package multipledicegame;
 
public class History {
    private int i = 0;
    private int g = 0;
    private int w = 0;
    
    public int addToThrows (int numberOfDice){
        i = i + numberOfDice;
        return i;
    }
    
    public int addToGames (int Games) {
        Games = g;
        g = g + 1;
        return g;
    }
    
    public int checkForWins (int userGuess, int diceRoll, int Wins){
        Wins = w;
        if (userGuess == diceRoll)
            w = w + 1;
        return w;
    }
    
    public void printHistory(int Games, int diceThrows, int Wins){
        
        System.out.printf("\nYou played a total of %d games.\n", Games);
        System.out.printf("You threw a total of %d dice.", diceThrows);
        System.out.printf("\nYou guessed correctly %d time(s).", Wins);    
        
    }
}
