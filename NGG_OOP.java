// Java program for Number Guessing Game using OOP's concept.

import java.util.Scanner;
import java.util.Random;

class Game1
{
    public int userInput, computerInput, noOfGuesses = 0;
    
    public void setNoOfGuesses(int noOfGuesses)
    {
        noOfGuesses = noOfGuesses;
    }
    public int getNoOfGuesses()
    {
        return noOfGuesses;
    }
    Game1()
    {
        Random random = new Random();
        computerInput = random.nextInt(100);
    }
    public void takeUserInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number: ");
        userInput = sc.nextInt();
    }
    boolean isCorrectNumber()
    {
        noOfGuesses++;
        if(userInput == computerInput)
        {
            System.out.printf("You guessed the correct number in %d attempts.\n", noOfGuesses);
            return true;
        }
        else if(userInput < computerInput)
        {
            System.out.println("You guessed too low...");
        }
        else if(userInput > computerInput)
        {
            System.out.println("You guessed too high...");
        }
        return false;
    }
}

public class NGG_OOP
{
    public static void main(String[] args)
    {
        Game1 g = new Game1();
        boolean b = false;
        while(!b)
        {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}