/*
Sample Input and Output 1:

Enter the Item type details:
Enter the name:
Electronics
Enter the deposit:
1000
Enter the cost per day:
100
The details of the item type are:
Name:Electronics
Deposit:1000.0
Cost Per Day:100.0

Sample Input and Output 2:

Enter the Item type details:
Enter the name:
Electronics
Enter the deposit:
One thousand
java.lang.NumberFormatException: For input string: "One thousand"
*/
import java.util.*;

class ItemType
{
    String name;
    double deposit;
    double costPerDay;

    ItemType() {};
    ItemType(String name, double deposit, double costPerDay)
    {
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    @Override

    public String toString()
    {
        return "Name:" + name + "\nDeposit:" + deposit + "\nCost Per Day:" + costPerDay;
    }


}

public class Main
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Item type details:\nEnter the name:");
        String name = scn.nextLine();

        Double deposit = null;
        try
        {
            System.out.println("Enter the deposit:");
            deposit = Double.parseDouble(scn.nextLine());
        }
        catch(NumberFormatException e)
        {   
            System.out.println(e.toString());
            System.exit(0);
        }

        Double cost = null;
        
        try
        {
            System.out.println("Enter the cost per day:");
            cost = Double.parseDouble(scn.nextLine());

        }
        catch(NumberFormatException e)
        {
            System.out.println(e.toString());
            System.exit(0);
        }

        ItemType obj = new ItemType(name, deposit, cost);
        System.out.println("The details of the item type are:");
        System.out.println(obj.toString());



    }
}
