import java.util.Scanner;                     //Scanner class for getting input from the user.
import java.util.Random;                        //Random moudle used to get random number from the user/computer
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random Random = new Random();
        int round = 0;
        int totalattempt = 0;
        String again;
        do{                                                            //Calculating no of rounds played and attempts
            round++;
            int attempts = guessinggame(sc, Random);                     //Calling out the game class to input answer
            totalattempt = totalattempt+attempts;

            System.out.println("Do you want to play again?? (y/n)");
            again = sc.next();
        }while(again.equalsIgnoreCase("y"));
        System.out.println("GAME OVER!!, You have played "+round+" rounds with total attempts " +totalattempt+ ".");
        sc.close();

    }

    public static int guessinggame(Scanner sc, Random random) {
        int attempt = 0;                                    //initial attempt = 0
        int max = 10;                             //total 10 attempts will be given to guess the number
        int number = random.nextInt(100)+1;                 //generates a number between 1 and 100
        System.out.println("WELCOME TO THE GUESSING GAME: ");
        System.out.println("I have generated a number between 1 and 100 , can you guess it??");
        System.out.println("LET'S START THE GAME ");

        //Guessing algorithm
        while(attempt < max){                        //loop to check whether the number is smaller or larger than the generated number.
            System.out.println("Enter your guess between 1 and 100 ");
            int guess = sc.nextInt();
            if(guess < number){
                System.out.println("Your guess is too small ");
            }else if(guess > number){
                System.out.println("Your guess is too large ");
            }else{
                System.out.println("Congrats!!, You finally found the number in " + attempt + " attempts.");
            }
            attempt++;

        }
        System.out.println("Sorry, You have used all your" +max +"attempts, the number was " + number +".");  //max attempt statement
        return attempt;
    }
}