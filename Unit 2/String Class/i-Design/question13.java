/*
input:3
      Wallets$Leather$1200$10
      Notebooks$Papers$200$0
      Headphones$Electronics$800$3
output:
      Items:
      Wallets,Leather,1200,Available
      Notebooks,Papers,200,Not Available
      Headphones,Electronics,800,Available
*/
import java.util.*;

class Item {
    private String name;
    private String type;
    private Integer cost;
    private Integer availableQuantity;

    // Default constructor
    public Item() {
    }

    // Parameterized constructor
    public Item(String name, String type, Integer cost, Integer availableQuantity) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.availableQuantity = availableQuantity;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getQuantityStatus()
    {
        return (availableQuantity > 0) ? "Available" : "Not Available";
    }
}

class Main 
{
    public static void main(String[] args) 
    {
        
            // Fill your code here
            Scanner scn = new Scanner(System.in);

            System.out.println("Enter the number of items");
            int n = scn.nextInt();

            scn.nextLine();

            Item[] item = new Item[n];
            System.out.println("Enter the item details in the format(Item Name$Item Type$Item Cost$Item Availability)");

            for(int i = 0 ; i <  n ; i++)
            {
                String[] str = scn.nextLine().split("\\$");

                item[i] = new Item(str[0], str[1], Integer.parseInt(str[2]), Integer.parseInt(str[3]));
            }
            
            StringBuilder sb = new StringBuilder();
            System.out.println("Items:");

            for(Item i : item)
            {
                System.out.println(i.getName() + "," + i.getType() + "," + i.getCost() + "," + i.getQuantityStatus() );
            }

            scn.close();
            
     }
}
