/* 
Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
(Hint : use do-while loop but think & understand why)
*/
import java.util.Scanner;

public class Loops_HWQ {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt(), c;
        do{
            if(a == 1) {
                System.out.print("Enter students marks: ");
                int b = sc.nextInt();
                if(b >= 90) {
                    System.out.println("Excellent");
                }
                else if(89 >= b && b >= 60) {
                    System.out.println("Good");
                }
                else if(59 >= b && b >= 35) {
                    System.out.println(" Fair, can do better");
                }
                else {
                    System.out.println("Better luck next time !!");
                }
            }
            else if( a== 0) {
                break;
            }
            else {
                    System.out.println("Enter a valid number !!!");
            }
            
            System.out.println("Do you want to continue ? If yes Press 1 or no press 0");
            c = sc.nextInt();
        }while(c != 0);
    }
}