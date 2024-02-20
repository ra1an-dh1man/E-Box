import java.util.*;

class Customer
{
    private String customerName;
    private String customerEmail;
    private String customerType;
    private String customerLocation;

    Customer(String customerName, String customerEmail, String customerType, String customerLocation)
    {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerType = customerType;
        this.customerLocation = customerLocation;

    }

    public String getCustomerName()
    {
        return customerName;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getCustomerEmail()
    {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail)
    {
        this.customerEmail = customerEmail;
    }

    public String getCustomerType()
    {
        return customerType;
    }
    public void setCustomerType(String customerType)
    {
        this.customerType = customerType;
    }

    public  String getCustomerLocation()
    {
        return customerLocation;
    }
    public void setCustomerLocation(String customerLocation)
    {
        this.customerLocation = customerLocation;
    }

}

public class Main
{
    public static void main(String args[])
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
        String lct  =scn.nextLine();

        scn.close();

        Customer obj = new Customer(nm, ml, typ, lct);

        System.out.println("Customer Details");
        System.out.println("Name: " + obj.getCustomerName());
        System.out.println("E-mail: " + obj.getCustomerEmail());
        System.out.println("Type: " + obj.getCustomerType());
        System.out.println("Location: " + obj.getCustomerLocation());
    }
}
