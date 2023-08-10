// Java program to create a Number Guessing Game.

import java.util.Scanner;
import java.util.Random;

class Game
{
    Random random = new Random();
    int computerInput = random.nextInt(100);
    public void Guess(int a)
    {
        if(a == computerInput)
        {
            System.out.println("You have guessed correct number.");
        }
        else if(a < computerInput)
        {
            System.out.println("Too low");
        }
        else if(a > computerInput)
        {
            System.out.println("Too high");
        }
    }
}

public class NGG
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Game ng = new Game();
        System.out.print("Guess the number: ");
        ng.Guess(sc.nextInt());
    }
}