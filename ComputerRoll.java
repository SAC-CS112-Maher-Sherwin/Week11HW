package multipledicegame;
import java.util.Scanner;

public class ComputerRoll extends MultipleDiceGame {
    Scanner input = new Scanner(System.in);
    int sum = 0;
    
    public int setNumberOfDice () {
        int d = input.nextInt();
        return d;
    }
    
    public int getRoll(int numberOfDice) {
        for (int n = 1; n < (numberOfDice+1); n++){
            int dice = 1 + (int) (Math.random() * 6); 
            System.out.printf("\nDice %d: %d.", n, dice);
            sum = sum + dice;
        }       
        return sum;
        
    }
    
}