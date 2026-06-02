import java.io.*;
import java.util.Scanner;

public class OnlineExamination
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int UserId = 23456;
        int score = 0;
        int pass = 0;

        try
        {
            BufferedReader br = new BufferedReader(new FileReader("password.txt"));
            pass = Integer.parseInt(br.readLine());
            br.close();
        }
        catch(Exception e)
        {
            System.out.println("Error reading password file.");
            return;
        }

        System.out.print("\n Enter UserID:");
        int enteredUserId = sc.nextInt();

        System.out.print("\n Enter Password:");
        int enteredPass = sc.nextInt();

        if(enteredUserId == UserId && enteredPass == pass)
        {
            System.out.println("\nLogin Successful");
        }
        else
        {
            System.out.println("\nInvalid UserID or Password");
            System.exit(0);
        }

        System.out.println("\n 1) Start Exam");
        System.out.println("\n 2) Update Password");
        System.out.println("\n 3) Logout");
        System.out.print("\n Enter your choice:");
        int choice = sc.nextInt();
        
        switch(choice)
        {
        case 1:
               
               long startTime = System.currentTimeMillis();
               long timeLimit = 180 * 1000; 
               if(System.currentTimeMillis() - startTime >= timeLimit)
                {
                    System.out.println("\nTime Over! Auto Submitting...");
                    break;
                }

               System.out.println("\n What is the full form of JVM?");
               System.out.println("\n 1.Java Virtual Machine \t 2.Java Variable Method \t 3.Java Visual Machine \t 4.Java Version Manager");
               System.out.print("\nEnter your answer:");
               int answer = sc.nextInt();

               if(answer == 1)
               {
                     System.out.println("\nCorrect Answer");
                     score = score + 1;
               }
               else
               {
                     System.out.println("\nWrong Answer");
               }
                
                if(System.currentTimeMillis() - startTime >= timeLimit)
                {
                    System.out.println("\nTime Over! Auto Submitting...");
                    break;
                }

                System.out.println("\n Java is a:");
                System.out.println("\n 1.Operating System \t 2.Programming Language \t 3.Browser \t 4.Database");
                System.out.print("\nEnter your answer:");
                int answer2 = sc.nextInt();

                if(answer2 == 2)
                {
                     System.out.println("\nCorrect Answer");
                     score = score + 1;
                }
                else
                {
                     System.out.println("\nWrong Answer");
                }

                if(System.currentTimeMillis() - startTime >= timeLimit)
                {
                    System.out.println("\nTime Over! Auto Submitting...");
                    break;
                }

                System.out.println("\n Which keyword is used to create an object in Java?");
                System.out.println("\n 1.class \t 2.new \t 3.public \t 4.static");
                System.out.print("\nEnter your answer:");
                int answer3 = sc.nextInt();

                if(answer3 == 2)
                {
                     System.out.println("\nCorrect Answer");
                     score = score + 1;
                }
                else
                {
                     System.out.println("\nWrong Answer");
                }

                if(System.currentTimeMillis() - startTime >= timeLimit)
                {
                    System.out.println("\nTime Over! Auto Submitting...");
                    break;
                }

                System.out.println("\n What is the size of int in Java?");
                System.out.println("\n 1.2 bytes \t 2.4 bytes \t 3.8 bytes \t 4.16 bytes");
                System.out.print("\nEnter your answer:");
                int answer4 = sc.nextInt();

                if(answer4 == 2)
                {
                     System.out.println("\nCorrect Answer");
                     score = score + 1;
                }
                else
                {
                     System.out.println("\nWrong Answer");
                }

                if(System.currentTimeMillis() - startTime >= timeLimit)
                {
                    System.out.println("\nTime Over! Auto Submitting...");
                    break;
                }

                System.out.println("\n Which of these is not a Java feature?");
                System.out.println("\n 1.Object-Oriented \t 2.Platform Independent \t 3.Use of pointers \t 4.Robust");
                System.out.print("\nEnter your answer:");
                int answer5 = sc.nextInt();

                if(answer5 == 3)
                {
                     System.out.println("\nCorrect Answer");
                     score = score + 1;
                }
                else
                {
                     System.out.println("\nWrong Answer");
                }

                System.out.println("\n==== Final Score ====");
                System.out.println("\n Your score:" +score);
                if(score == 5)
                {
                       System.out.println("Excellent!");
                }
                else if(score >= 3)
                {
                    System.out.println("Good Performance");
                }
                else
                {
                    System.out.println("Try Again");
                }

                break;

        case 2:
            System.out.print("Enter old password: ");
            int oldpass = sc.nextInt();
            if(oldpass == pass)
            {
                System.out.print("Enter new password: ");
                int newpass = sc.nextInt();
               pass = newpass;
               try
               {
                    BufferedWriter bw = new BufferedWriter(new FileWriter("password.txt"));
                    bw.write(String.valueOf(pass));
                    bw.close();

                    System.out.println("Password updated successfully");
                }
                catch(Exception e)
                {
                    System.out.println("Error updating password.");
                }
            }
            else
            {
                System.out.println("Incorrect password");
            }
            break;

        case 3:
            System.out.println("Logged out successfully. Thank you!");
            System.exit(0);
            break;

        default:
            System.out.println("Invalid choice");
        
        }
    sc.close();
    }
}
