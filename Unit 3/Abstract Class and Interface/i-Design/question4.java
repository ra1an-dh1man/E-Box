/*
Sample Input and Output 1:

Choose the guide
1)Make My Trip
2)Trivago
3)Clear Trip
1
Cities:
Mumbai
Coimbatore
Hyderabad
Enter city where you want to search for hotels:
Hyderabad
Ecludia-80000
Angel Park-20000
Le Meridian-15000

Sample Input and Output 2:

Choose the guide
1)Make My Trip
2)Trivago
3)Clear Trip
3
Cities:
California
Massachusetts
Namibia
Enter city where you want to search for hotels:
Gudoor
No hotels are available for this city

Sample Input and Output 3:

Choose the guide
1)Make My Trip
2)Trivago
3)Clear Trip
5
Invalid Choice

 
*/
import java.util.Scanner;

interface Stall
{
    void display();
}

class GoldStall implements Stall
{
    private String stallName;
    private int cost;
    private String ownerName;
    private int tvSet;

    GoldStall() {};

    GoldStall(String stallName, int cost, String ownerName, int tvSet)
    {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.tvSet = tvSet;
    }
    public String getStallName() {
        return stallName;
    }

    public void setStallName(String stallName) {
        this.stallName = stallName;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Integer getTvSet() {
        return tvSet;
    }

    public void setTvSet(Integer tvSet) {
        this.tvSet = tvSet;
    }

    @Override
    public void display()
    {
        System.out.println("Stall Name:" + getStallName());
        System.out.println("Cost:" + getCost() + ".Rs");
        System.out.println("Owner Name:" + getOwnerName());
        System.out.println("Number of TV sets:" + getTvSet());
    }
}

class PremiumStall implements Stall
{
    private String stallName;
    private int cost;
    private String ownerName;
    private int projector;

    PremiumStall() {};
    PremiumStall(String stallName, int cost, String ownerName, int projector) 
    {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.projector = projector;
    }

    public String getStallName() {
        return stallName;
    }

    public void setStallName(String stallName) {
        this.stallName = stallName;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Integer getProjector() {
        return projector;
    }

    public void setProjector(Integer projector) {
        this.projector = projector;
    }

    @Override
    public void display() {
        System.out.println("Stall Name:" + getStallName());
        System.out.println("Cost:" + getCost() + ".Rs");
        System.out.println("Owner Name:" + getOwnerName());
        System.out.println("Number of Projectors:" + getProjector());
    }

}

class ExecutiveStall implements Stall {
    private String stallName;
    private Integer cost;
    private String ownerName;
    private Integer screen;

    public ExecutiveStall() {
    }

    public ExecutiveStall(String stallName, Integer cost, String ownerName, Integer screen) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.screen = screen;
    }

    public String getStallName() {
        return stallName;
    }

    public void setStallName(String stallName) {
        this.stallName = stallName;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Integer getScreen() {
        return screen;
    }

    public void setScreen(Integer screen) {
        this.screen = screen;
    }

    @Override
    public void display() {
        System.out.println("Stall Name:" + getStallName());
        System.out.println("Cost:" + getCost() + ".Rs");
        System.out.println("Owner Name:" + getOwnerName());
        System.out.println("Number of Screens:" + getScreen());
    }
}
public class Main 
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Choose Stall Type\n1)Gold Stall\n2)Premium Stall\n3)Executive Stall");
        
        int n = Integer.parseInt(scn.nextLine());

        if( n == 1)
        {
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
            String str[] = scn.nextLine().trim().split(",");

            GoldStall obj = new GoldStall(str[0], Integer.parseInt(str[1]), str[2], Integer.parseInt(str[3]));
            obj.display();
        }
        else if( n == 2)
        {
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
            String str[] = scn.nextLine().trim().split(",");

            PremiumStall obj = new PremiumStall(str[0], Integer.parseInt(str[1]), str[2], Integer.parseInt(str[3]));
            obj.display();

        }

        else if( n == 3)
        {
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
            String str[] = scn.nextLine().trim().split(",");

            ExecutiveStall obj = new ExecutiveStall(str[0], Integer.parseInt(str[1]), str[2], Integer.parseInt(str[3]));
            obj.display();

        }

        else
        {
            System.out.println("Invalid Stall Type");
        }
        scn.close();
    }    
}
