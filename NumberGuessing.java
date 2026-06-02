import java.util.Scanner;
import java.util.Random;

public class NumberGuessing
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String replay = "yes";

        
        System.out.println("\n==== NUMBER GUESSING GAME ====");
        System.out.println("\nRules:");
        System.out.println("\n* You will get hints (high / low)");
        System.out.println("\n* Try to finish in minimum attempts");
        System.out.println("\n* You can replay the game");
      

        while (replay.equalsIgnoreCase("yes"))
        {

            int ran = random.nextInt(100) + 1;
            int a = 0;
            int attempts = 0;
            int maxAttempts = 10;
            int score = 0;

            while (a != ran && attempts < maxAttempts)
            {

                System.out.print("\nEnter your guess: ");
                a = sc.nextInt();
                attempts++;

                if (a < ran)
                {
                    System.out.println("\nTry a higher number!");
                }
                else if (a > ran)
                {
                    System.out.println("\nTry a lower number!");
                }
                else
                {
                    System.out.println("\nYOU GUESSED IT RIGHT!");
                    System.out.println("\nYou completed in " + attempts + " attempts!");
                    if(attempts <= 2)
                      {
                            score = 100;
                            System.out.println("\nYour score :" + score + " points");
                      }
                    else if(attempts >2 && attempts <=4)
                      {
                            score = 80;
                            System.out.println("\nYour score :"+ score + " points");
                      }
                    else
                      {
                            score = 50;
                            System.out.println("\nYour score :"+ score + " points");
                      }
                }

            }
            if(attempts == maxAttempts && a!= ran)
            {
                System.out.println("\nGame Over");
                System.out.println("\nThe Correct number was "+ ran );
            }
            System.out.println("\nDo you want to play again? (yes/no)");
            replay = sc.next();
            if(replay.equalsIgnoreCase("yes"))
                {
                    System.out.println("\nNew game started");
                }
            else
                {
                    System.out.println("\nThanks for playing");
                }
            
        }

        sc.close();

    }

}