/*
Note: The price for various types of stalls is, Platinum = Rs.200 per sqft; Diamond = Rs.150 per sqft; Gold = Rs.100 per sqft. And price for each tv is Rs.10000.

Enter the name of the stall:
ABC ltd
Enter the detail of the stall:
All electronics store
Enter the owner name of the stall:
XYZ
Enter the type of the stall:
Platinum
Enter the size of the stall in square feet:
1000
Does the stall have TV?(y/n)
y
Enter the number of TV:
4
The cost of the stall is 240000.0
*/
import java.util.Scanner;

class  Stall
{
    protected String name;
    protected String detail;
    protected String ownerName;

    Stall() {};

    public Stall(String name, String detail, String ownerName)
    {
        this.name = name;
        this. detail = detail;
        this.ownerName = ownerName;
    }

    public String getName()
    {
        return name;

    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDetails()
    {
        return detail;
    }

    public void setDetails(String details)
    {
        this.detail = details;
    }

    public String getOwnerName()
    {
        return ownerName;
    }

    public void setOwnerName(String ownerName)
    {
        this.ownerName = ownerName;
    }

    public Double computeCost(String stallType, Integer squareFeet)
    {
        if(stallType.equals("Platinum"))
            return 200.0 * squareFeet;
        else if(stallType.equals("Diamond"))
            return 150.0 * squareFeet;
        else if(stallType.equals("Gold"))
            return 100.0 * squareFeet;
        else
            return 0.0;
    }

    public Double computeCost(String stallType, Integer squareFeet, Integer numberOfTV)
    {
        double cost = computeCost(stallType, squareFeet);
        if(numberOfTV > 0)
            cost = cost + numberOfTV * 10000.0;
    return cost;
    }

}
public class Main {
    public static void main(String[] args) 
    {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the name of the stall:");
        String nm = scn.nextLine();
        
        System.out.println("Enter the detail of the stall:");
        String dtl = scn.nextLine();
        
        System.out.println("Enter the owner name of the stall:");
        String own = scn.nextLine();
        
        Stall obj = new Stall(nm, dtl, own);

        System.out.println("Enter the type of the stall:");
        String typ = scn.nextLine();
        
        System.out.println("Enter the size of the stall in square feet");
        int sqft = Integer.parseInt(scn.nextLine());
        
        System.out.println("Does the stall have TV?(y/n)");
        String hasTV = scn.nextLine();

        int numberOfTV = 0;
        if(hasTV.equals("y"))
        {
        System.out.println("Enter the number of TV:");
        numberOfTV = Integer.parseInt(scn.nextLine());
        }

        double cost = obj.computeCost(typ, sqft, numberOfTV);

        System.out.println("The cost of the stall is " + cost);
        
        scn.close();
    }
    
}
