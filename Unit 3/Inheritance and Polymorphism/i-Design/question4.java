/*
Sample Input/Output-1:
Choose Account Type
1.Savings Account
2.Current Account
1
Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)
Morsh,033808020000879,Baroda,Amphisoft
Account Name:Morsh
Account Number:033808020000879
Bank Name:Baroda
Organisation Name:Amphisoft

Sample Input/Output-2:
Choose Account Type
1.Savings Account
2.Current Account
2
Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)
Krish,131231451,ICICI,798902
Account Name:Krish
Account Number:131231451
Bank Name:ICICI
TIN Number:798902
*/
import java.util.Scanner;

class Account
{
    protected String accName;
    protected String accNo;
    protected String bankName;

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void display()
    {
        System.out.println("Account Name:" + accName);
        System.out.println("Account Number:" + accNo);
        System.out.println("Bank Name:" + bankName);
    }

}

class CurrentAccount extends Account
{
    private String tinNumber;

    CurrentAccount() {};

    CurrentAccount(String accName,String accNo,String bankName,String tinNumber)
    {
        this.accName = accName;
        this.accNo = accNo;
        this.bankName = bankName;
        this.tinNumber = tinNumber;
    }

    public String getTinNumber() {
        return tinNumber;
    }

    public void setTinNumber(String tinNumber) {
        this.tinNumber = tinNumber;
    }

    public void display()
    {
        super.display();
        System.out.println("TIN Number:" + tinNumber);
    }
}

class SavingsAccount extends Account
{
    private String orgName;

    SavingsAccount() {};

    SavingsAccount(String accName,String accNo,String bankName,String orgName)
    {
        this.accName = accName;
        this.accNo = accNo;
        this.bankName = bankName;
        this.orgName = orgName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void display()
    {
        super.display();
        System.out.println("Organisation Name:" + orgName);
    }


}   


public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Choose Account Type");
        System.out.println("1.Savings Account\n2.Current Account");
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        scn.nextLine();
        if(n == 1)
        {
            System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
            String str[] = scn.nextLine().trim().split(",");
            SavingsAccount obj = new SavingsAccount(str[0], str[1], str[2], str[3]);
            obj.display();

        }
        else if( n == 2)
        {
            System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
            String str[] = scn.nextLine().trim().split(",");
            CurrentAccount obj = new CurrentAccount(str[0], str[1], str[2], str[3]);
            obj.display();
        }
        scn.close();
    }
    
}
