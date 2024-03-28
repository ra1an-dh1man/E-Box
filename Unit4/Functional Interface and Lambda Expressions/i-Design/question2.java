/*
input->
         2
         Jaqulos,Einstein,1230000
         Hip Hop,Wright Brothers,300000
output-> Jaqulos|Einstein|1230000.0
         Hip Hop|Wright Brothers|300000.0
*/
import java.util.*;
class Event

{
    private String eventName;
    private String organiserName;
    private double eventCost;

    public Event() {
        // Default constructor
    }

    public Event(String eventName, String organiserName, Double eventCost) {
        this.eventName = eventName;
        this.organiserName = organiserName;
        this.eventCost = eventCost;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getOrganiserName() {
        return organiserName;
    }

    public void setOrganiserName(String organiserName) {
        this.organiserName = organiserName;
    }

    public Double getEventCost() {
        return eventCost;
    }

    public void setEventCost(Double eventCost) {
        this.eventCost = eventCost;
    }

    public void display(List<Event> eventList)
    {
        for(Event event : eventList)
        {
            System.out.println(event.getEventName() + "|" + event.getOrganiserName() + "|" + event.getEventCost());
        }
    }

}

public class Main
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the number of events");

        int n = Integer.parseInt(scn.nextLine());

        System.out.println("Enter event details in CSV(Event Name,Organiser Name,Event Cost)");

        List<Event> eventList = new ArrayList<>();

        for(int i = 0 ; i < n ; i++)
        {
            String[] str = scn.nextLine().split(",");
            Event obj = new Event(str[0], str[1], Double.parseDouble(str[2]));
            eventList.add(obj);
        }

        Event obj = new Event();
        obj.display(eventList);

        scn.close();
    }
}
