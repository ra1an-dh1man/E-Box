import java.util.*;

class Address
{
    public 
    String street;
    String city;
    int pincode;
    String country;

    public void displayAddress(String street, String city, int pincode, String country)
    {
        System.out.println("street: " + street);
        System.out.println("City: " + city);
        System.out.println("Pincode: " + pincode);
        System.out.println("Country: " + country);
    }
}

public class Demo 
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Customer Address");
        
        System.out.println("Enter the street");
        String s = scn.nextLine();

        System.out.println("Enter the city");
        String c = scn.nextLine();

        System.out.println("Enter the pincode");
        int p = scn.nextInt();

        scn.nextLine();

        System.out.println("Enter the country");
        String cn = scn.nextLine();

        scn.close();

        Address obj = new Address();

        obj.displayAddress(s, c, p, cn);

        
    }
    
}
