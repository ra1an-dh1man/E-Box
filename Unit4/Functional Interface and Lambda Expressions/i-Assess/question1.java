/*
Enter the number of item types:
3
Furniture,3000,10000
Book,4000,15000
Steel,7000,40000
Name       Cost       Deposit
Book       4000.0     15000.0
Furniture    3000.0     10000.0
Steel      7000.0     40000.0
*/
import java.util.*;

class ItemType
{
    private String name;
    private double costPerDay;
    private double deposit;

    ItemType() {};

    ItemType(String name, double costPerDay, double deposit)
    {
        this.name = name;
        this.costPerDay = costPerDay;
        this.deposit = deposit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }
    
    public static Comparator<ItemType> itemTypeComparator = new Comparator<ItemType>() {
        @Override

        public int compare(ItemType item1, ItemType item2)
        {
            return item1.getName().compareTo(item2.getName());
        }
        
    };
}

public class Main
{
    public static void main(String[] args) 
    {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of item types");
        int n = Integer.parseInt(scn.nextLine());

        List<ItemType> itemType = new ArrayList<>();

        for(int i = 0 ; i < n ; i++)
        {
            String[] details = scn.nextLine().split(",");
            ItemType obj = new ItemType(details[0], Double.parseDouble(details[1]), Double.parseDouble(details[2]));      
            
            itemType.add(obj);

        }

        Collections.sort(itemType, Comparator.comparing(ItemType::getName));

        System.out.printf("%-10s %-10s %s\n", "Name", "Cost", "Deposit");
        for(ItemType item : itemType)
        {
            System.out.printf("%-10s %-10s %s\n", item.getName(), item.getCostPerDay(), item.getDeposit());
        }

        scn.close();
    }
}
