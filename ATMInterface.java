import java.util.Scanner;

public class ATMInterface
{
     public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            double balance = 5000;
            double deposit = 0;
            double withdraw = 0;
            String history =""; 
            double transfer = 0;
            long receiverAccount;
            int choice;
            int userId = 12345;
            int password = 1234;
            System.out.print("\nEnter User ID : ");
            int enteredUserId = sc.nextInt();
            System.out.print("\nEnter password :");
            int enteredPassword = sc.nextInt();
            if(enteredUserId == userId && enteredPassword == password)
            {
                System.out.println("\nLogin Successful");
            }
            else
            {
                System.out.println("\nInvalid User ID or password");
                System.exit(0);
            }

            while(true)
            {   
                
                System.out.println("\n===== ATM Menu =====");
                System.out.println("\n 1) Check current Balance");
                System.out.println("\n 2) Deposit");
                System.out.println("\n 3) Withdraw");
                System.out.println("\n 4) Transaction history");
                System.out.println("\n 5) Transfer");
                System.out.println("\n 6) Exit");
                System.out.print("\n Enter your choice :");

                choice = sc.nextInt();

                switch(choice)
                {
                case 1:
                    System.out.println("\n Your Current Balance : " + balance);
                    break;

                case 2:
                    System.out.print("\n Enter the amount to deposit :");
                    deposit = sc.nextDouble();
                    if(deposit > 0)
                    {
                       balance += deposit;
                       System.out.println("\nAmount deposited successfully");
                       System.out.println("\n Current Balance :"+ balance);
                       history = history + "\n\nDeposited :" + deposit;
                    }
                    else 
                    {
                       System.out.println("\n Invalid deposit amount");
                    }
                    break;

                case 3:
                    System.out.print("\n Enter the amount to withdraw :");
                    withdraw = sc.nextDouble();
                    if(withdraw > 0)
                    {
                        if(balance >= withdraw)
                        {
                             balance -= withdraw;
                             System.out.println("\n Withdrawal successful");
                             System.out.println("\n Current balance :"+ balance);
                             history = history + "\n\nWithdraw :" + withdraw;
                        }
                             else
                        {
                             System.out.println("\n Oops! The amount is not sufficient");
                        }
                    }
                    else
                    {
                        System.out.println("\n Invalid withdraw amount");
                    }
                    break;

                case 4:
                    System.out.println("\n===== Transaction History =====");
                    System.out.println(history);
                    break;

                case 5:
                    System.out.print("\nEnter Receiver Account Number: ");
                    receiverAccount = sc.nextLong();
                    System.out.print("\nEnter amount to transfer: ");
                    transfer = sc.nextDouble();
                    if(transfer > 0)
                    {
                        if(balance >= transfer)
                        {
                             balance -= transfer;
                             System.out.println("\n transfer successful");
                             System.out.println("\n Current Balance: "+ balance);
                             history = history + "\n\nTransferred: " + transfer + " to Account " + receiverAccount; 
                        }
                        else 
                        {
                             System.out.println("\n Insufficient Balance");
                        }
                    }
                    else
                    {
                        System.out.println("\n Invalid transfer amount");
                    }
                    break;

                case 6:
                    System.out.println("\n Thank you for using ATM");
                    System.exit(0);

                default:
                    System.out.println("\n Invalid choice");
                }
           }
        }
}