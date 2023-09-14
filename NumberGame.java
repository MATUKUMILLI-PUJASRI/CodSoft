/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int chances = 7;
        int finals = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Game!");
        System.out.println("You have " + chances + " chances to guess the number between " + min + " and " + max + ".");

        while (playAgain) {
            int randN = getrandN(min, max);
            boolean gC = false;

            for (int i = 0; i < chances; i++) {
                System.out.print("Attempt " + (i + 1) + ": Enter your guess: ");
                int Guess = sc.nextInt();

                if(Guess == randN) {
                    System.out.println("Congratulation! You guessed the number!");
                    gC = true;
                    finals += 1;
                    break;
                } else if(Guess < randN) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!gC) {
                System.out.println("Sorry, You have used all your chances. The number was: " + randN);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String pAC = sc.next();
            playAgain = pAC.equalsIgnoreCase("yes");
        }

        System.out.println("Game Over! Your finals score is: " + finals);
        sc.close();
    }

    public static int getrandN(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}