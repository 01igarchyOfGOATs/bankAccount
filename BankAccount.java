//Make sure to add stuff or else it won't cause errors but it won't have use 

public class BankAccount {
private String name;
private int accountNum;
private double balance;
private String password;
private boolean loggedIn;

public BankAccount (String name, int accountNum, double balance, String password) 
{
    this.name = name;
    this.accountNum = accountNum;
    this.balance = balance;
    this.password = password;
    this.loggedIn = false;
}

public boolean loggedIn (String name, String password)
{
    if (this.name.equals(name) && this.password.equals(password))
    {
        loggedIn = true;
    }

    return loggedIn;
}

public void logOut () 
{
    loggedIn = false; 
}

public double getBalance()
{
    if (loggedIn)
    return balance;
    throw new IllegalStateException("not loggedIn");
}

public String toString()
{
    return accountNum + ":  balance = " + balance;
}

public int setNum (int accountnum)
{
    return accountNum;
}

public void deposit (double amountToAdd)
{
    balance += amountToAdd;
    if (loggedIn)
    throw new IllegalStateException("Not Logged in.");
}

public void withdrawal (double amountToSubtract)
{
    balance -= amountToSubtract;
    if (loggedIn)
    throw new IllegalStateException("Not Logged in."); //causes code to not continue (IllegalStateException)
}

}

//Different files of the same package work together