/*
Sample Input/Output 1:

Choose Event type
1.Exhibition
2.StageEvent
1
Enter the details in CSV format
Book expo,special sale,Academics,Mahesh,10
Event Name:Book expo
Detail:special sale
Type:Academics
Organiser Name:Mahesh
Number of stalls:10

Sample Input/Output 2:

Choose Event type
1.Exhibition
2.StageEvent
2
Enter the details in CSV format
JJ magic show,New Year Special,Comedy magic,J Jegadeesh,100
Event Name:JJ magic show
Detail:New Year Special
Type:Comedy magic
Organiser Name:J Jegadeesh
Number of seats:100

Sample Input/Output 3:
Choose Event type
1.Exhibition
2.StageEvent
3
Invalid choice
*/
import java.util.Scanner;

class Event
{
    protected String name;
    protected String detail;
    protected String type;
    protected String organiserName;

    public Event(String name, String detail, String type, String organiserName) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.organiserName = organiserName;
    }

    public void display()
    {
        System.out.println("Event Name:" + name);
        System.out.println("Detail:" + detail);
        System.out.println("Type:" + type );
        System.out.println("Organiser Name:" + organiserName);
    }

}


class Exhibition  extends Event
{
    private int noOfStalls;

    public Exhibition(String name, String detail, String type, String organiserName, int noOfStalls) {
        super(name, detail, type, organiserName);
        this.noOfStalls = noOfStalls;
    }

    public int getNoOfStalls() {
        return noOfStalls;
    }

    public void setNoOfStalls(int noOfStalls) {
        this.noOfStalls = noOfStalls;
    }

    public void display()
    {
        super.display();
        System.out.println("Number of stalls:" + noOfStalls);
        
    }
}

class StageEvent extends Event
{
    private int noOfSeats;

    public StageEvent(String name, String detail, String type, String organiserName, int noOfSeats) {
        super(name, detail, type, organiserName);
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public void display()
    {
        super.display();
        System.out.println("Number of seats:" + noOfSeats);
    }
}

public class Main
{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Choose Event type\n1.Exhibition\n2.StageEvent");
        int n = Integer.parseInt(scn.nextLine());
        
        if(n == 1)
        {
            System.out.println("Enter the details in CSV format");
            String[] str = scn.nextLine().trim().split(",");

            Exhibition obj = new Exhibition(str[0], str[1], str[2], str[3], Integer.parseInt(str[4]));
            obj.display();
        }

        else if(n == 2)
        {
            System.out.println("Enter the details in CSV format");
            String[] str = scn.nextLine().trim().split(",");

            StageEvent obj = new StageEvent(str[0], str[1], str[2], str[3], Integer.parseInt(str[4]));
            obj.display();
        }
        else
        {
            System.out.println("Invalid choice");
            System.exit(0);
        }

        
        scn.close();

    }
}
