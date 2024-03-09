/*

Hint -> System.out.format("%-20s %-10s %-20s %-20s %s\n","Account Number","Balance","Account holder name","Minimum balance","Locking period")

Enter account Detail:
ACC001,5456.45,Tony Blake,500,10
Account Details:
Account Number	Balance	Account holder name	Minimum balance	Locking period
ACC001	5456.45	Tony Blake	500.0	10
*/
import java.util.Scanner;

class Account
{
    protected String accountNumber;
    protected double balance;
    protected String accountHolderName;

    public Account(String accountNumber, double balance, String accountHolderName)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

}

class SavingAccount extends Account
{   
    protected double minimumBalance;

    SavingAccount(String accountNumber , double balance, String accountHolderName, double minimumBalance)
    {
        super(accountNumber, balance, accountHolderName);
        this.minimumBalance = minimumBalance;
    }
}

class FixedAccount extends SavingAccount
{
    private int lockingPeriod;

    public FixedAccount(String accountNumber, Double balance, String accountHolderName, Double minimumBalance, Integer lockingPeriod)
    {
        super(accountNumber, balance, accountHolderName, minimumBalance);
        this.lockingPeriod = lockingPeriod;
    }
    
    public void display()
    {
        System.out.format("%-20s %-10s %-20s %-20s %s\n","Account Number","Balance","Account holder name","Minimum balance","Locking period");
        System.out.format("%-20s %-10s %-20s %-20s %s\n",accountNumber, balance, accountHolderName, minimumBalance, lockingPeriod);

    }
}

class AccountBO
{
    public FixedAccount getDetails(String detail)
    {
        String[] str = detail.trim().split(",");

        return new FixedAccount(str[0], Double.parseDouble(str[1]), str[2], Double.parseDouble(str[3]), Integer.parseInt(str[4]));
    }

}

public class Main
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter account Detail:");

        String str = scn.nextLine();
        scn.close();

        AccountBO obj = new AccountBO();
        FixedAccount obj2 = obj.getDetails(str);

        System.out.println("Account Details:");

        obj2.display();

        

    }
}
