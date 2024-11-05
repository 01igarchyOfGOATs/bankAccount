import java.util.Scanner;

public class Test
{

public static void main(String[] args)
    {
        try(Scanner keyboard = new Scanner(System.in))
        {
            int selection = -1;
            BankAccount userAccount = null; //null shows object useraccount refers to nothing 
        while (true)
        {
            if (selection==-1)
            { 
            System.out.println("Create your bank account press 1 to begin");
            selection = keyboard.nextInt(); //if int selection already exists, I don't need to put another int selection
            keyboard.nextLine();
            }
            if (selection == 1)
            {
                System.out.println("type a username");
                String userName = keyboard.nextLine();
                System.out.println(userName + " is your username");
                System.out.println("now choose your password");
                String passWord = keyboard.nextLine();
                System.out.println(passWord + " is now your password");
                System.out.println("Welcome to your bank account! Your current balance is at 0. Select 2 to deposit, select 3 if not.");
                selection = keyboard.nextInt();
                keyboard.nextLine();
                userAccount = new BankAccount(userName, (int)(Math.random()*100000), 0.0, passWord);
                userAccount.loggedIn(userName, passWord);
            }

            if (selection == 2)
            {
                System.out.println("How much do you want to deposit?");
                double deposit = keyboard.nextDouble();
                keyboard.nextLine();
                userAccount.deposit(deposit);
                System.out.println("now " + userAccount + " is your Balance. Is there anything you want to withdraw? Press 3 if not, press 4 if yes.");
                selection = keyboard.nextInt();
                keyboard.nextLine();
            }
            if (selection == 3)
            {
                System.out.println("You are all set now! Click 5 to logout. Unless you still wanna do something more, press 2 or 4");
                selection = keyboard.nextInt();
            }

            if (selection == 4)
            {
                System.out.println("Then how much do you want to withdraw?");
                double withdrawal = keyboard.nextDouble();
                keyboard.nextLine();
                userAccount.withdrawal(withdrawal);
                System.out.println("now " + userAccount + " is your Balance.");
                System.out.println("Now press 3 finish.");
                selection = keyboard.nextInt();
                keyboard.nextLine();
            }
            
            if (selection == 5)
            {
                System.out.println("you have logged out, press six to log in again");
                userAccount.logOut();
                selection = keyboard.nextInt();
                keyboard.nextLine();
            } 
            if(selection == 6){
                System.out.println("enter your username");
                String userName = keyboard.next();
                System.out.println("enter your password");
                String passWord = keyboard.next();
                userAccount.loggedIn(userName, passWord);
                System.out.println("you have logged in, press 2 to continue, 3 to logoff, 4 to withdraw");
                selection = keyboard.nextInt();
                keyboard.nextLine();
                
            }
        }
}
}
}
