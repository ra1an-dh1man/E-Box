import java.util.*;

class Customer
{
    public String customerName;
    public String customerEmail;
    public String customerType;
    public String customerAddress;

    Customer()
    {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    void displayDitails(String customerName, String customerEmail, String customerType, String customerAddress)
    {
        System.out.println("Name: " + customerName);
        System.out.println("E-mail: " + customerEmail);
        System.out.println("Type: " + customerType);
        System.out.println("Location: " + customerAddress);
    }
}
class Main
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Customer Details");

        System.out.println("Enter the name");
        String nm = scn.nextLine();

        System.out.println("Enter the email");
        String ml = scn.nextLine();

        System.out.println("Enter the type");
        String typ = scn.nextLine();

        System.out.println("Enter the location");
        String lct = scn.nextLine();

        Customer obj = new Customer();
        obj.displayDitails(nm, ml, typ, lct);
        
    }
}
