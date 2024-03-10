/*
Sample Input/Output 1:

Enter the name of the event:
Science Fair
Enter the detail of the event:
Explore Technology
Enter the owner name of the event:
ABCD
Enter the type of the event:
1.Exhibition
2.StageEvent
1
Enter the number of stalls:
65
The projected revenue of the event is 650000.0

Sample Input/Output 2:

Enter the name of the event:
Magic Show
Enter the detail of the event:
See Magic without Logic
Enter the owner name of the event:
SDFG
Enter the type of the event:
1.Exhibition
2.StageEvent
2
Enter the number of shows:
10
Enter the number of seats per show:
100
The projected revenue of the event is 50000.0
*/
import java.util.Scanner;

class Event
{
    protected String name;
    protected String detail;
    protected String ownerName;

    public Event(String name, String details, String ownerName)
    {
        this.name = name;
        this.detail = details;
        this.ownerName = ownerName;
    }

    public double projectRevenue()
    {
        return 0.0;
    }

}

class Exhibition extends Event
{
    int noOfStall;

    public Exhibition(String name, String details, String ownerName, int noOfStall)
    {
        super(name, details, ownerName);
        this.noOfStall = noOfStall;
    }

    @Override
    public double projectRevenue()
    {
        return noOfStall * 10000;
    }
}

class StageEvent extends Event
{
    int noOfShows;
    int noOfSeatsPerShow;

    public StageEvent(String name, String details, String ownerName, int noOfShows, int noOfSeatsPerShow)
    {
        super(name, details, ownerName);
        this.noOfShows = noOfShows;
        this.noOfSeatsPerShow = noOfSeatsPerShow;
    }

    @Override
    public double projectRevenue()
    {
        return noOfShows * noOfSeatsPerShow * 50;
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the name of the event:");
        String nm = scn.nextLine();

        System.out.println("Enter the detail of the event:");
        String dtl = scn.nextLine();

        System.out.println("Enter the owner name of the event:");
        String owner = scn.nextLine();

        System.out.println("Enter the type of the event:\n1.Exhibition\n2.StageEvent");

        int n = Integer.parseInt(scn.nextLine());

        if(n == 1)
        {
            System.out.println("Enter the number of stalls:");
            int stl = Integer.parseInt(scn.nextLine());

            Exhibition obj = new Exhibition(nm, dtl, owner, stl);

            System.out.println("The projected revenue of the event is " + String.format("%.1f", obj.projectRevenue()));
        }
        else if(n == 2)
        {
            System.out.println("Enter the number of shows:");
            int sh = Integer.parseInt(scn.nextLine());
            
            System.out.println("Enter the number of seats per show:");
            int st = Integer.parseInt(scn.nextLine());

            StageEvent obj = new StageEvent(nm, dtl, owner, sh, st);

            System.out.println("The projected revenue of the event is " + String.format("%.1f", obj.projectRevenue()));

        }

        scn.close();
    }
    
}
