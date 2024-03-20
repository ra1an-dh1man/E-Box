import java.util.*;
import java.util.Scanner;

class Hall
{
    private String name;
    private double costPerDay;
    private String owner;

    Hall() {};
    
    Hall(String name, double costPerDay, String owner)
    {
        this.name = name;
        this.costPerDay = costPerDay;
        this.owner = owner;
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

public class Main
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter thr number of halls:");
        int n = Integer.parseInt(scn.nextLine());

        List<Hall> halls = new ArrayList<>();

        for(int i = 0 ; i < n ; i++)
        {
            String[] str = scn.nextLine().split(",");
            Hall hall = new Hall(str[0], Double.parseDouble(str[1]), str[2]);
            halls.add(hall);
        }

            scn.close();
        halls.sort(Comparator.comparing(Hall::getOwner));

        System.out.format("%-15s %-10s %s\n","Name","Cost","Owner");

        for(Hall hall: halls)
        {
            System.out.format("%-15s %-10s %s\n",hall.getName(), hall.getCostPerDay(), hall.getOwner());
        }



    }
}
