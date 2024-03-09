/*
Sample Input/Output 1:

Enter the Booking details
Magic show,Mahesh,5
Payment mode
1.Cash payment
2.Wallet payment
3.Credit card payment
1
Enter the amount
500
Stage event:Magic show
Customer:Mahesh
Number of seats:5
Amount 500.0 paid in cash

Sample Input/Output 2:

Enter the Booking details
Motivational speech,Rajesh,10
Payment mode
1.Cash payment
2.Wallet payment
3.Credit card payment
2
Enter the amount
400
Enter the wallet number
AFG-456
Stage event:Motivational speech
Customer:Rajesh
Number of seats:10
Amount 400.0 paid using wallet number AFG-456

Sample Input/Output 3:

Enter the Booking details
Debate,Raja,2
Payment mode
1.Cash payment
2.Wallet payment
3.Credit card payment
3
Enter card holder name
Raja
Enter the amount
200
Enter the credit card type
Master
Enter the CCV number
9874-4758-9856
Stage event:Debate
Customer:Raja
Number of seats:2
Holder name:Raja
Amount 200.0 paid using Master card
CCV:9874-4758-9856
*/
import java.util.Scanner;

class TicketBooking
{
    private String stageEvent;
    private String customer;
    private int noOfSeats;

    public TicketBooking(String stageEvent,String customer, int noOfSeats)
    {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public void makePayment(double amount)
    {
        System.out.println("Stage event:" + stageEvent);
        System.out.println("Customer:" + customer);
        System.out.println("Number of seats:" + noOfSeats);
        System.out.println("Amount " + String.format("%.1f", amount) + " paid in cash");
    }

    public void makePayment(String walletNumber, double amount)
    {
        System.out.println("Stage event:" + stageEvent);
        System.out.println("Customer:" + customer);
        System.out.println("Number of seats:" + noOfSeats);
        System.out.println("Amount " + String.format("%.1f", amount) + " paid using wallet number " + walletNumber);

    }

    public void makePayment(String creditCard,String ccv,String name,Double amount)
    {
        System.out.println("Stage event:" + stageEvent);
        System.out.println("Customer:" + customer);
        System.out.println("Number of seats:" + noOfSeats);
        System.out.println("Holder name:" + name);
        System.out.println("Amount " + String.format("%.1f", amount) + " paid using " + creditCard + " card");
        System.out.println("CCV:" + ccv);
        
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        

        System.out.println("Enter the Booking details");

        String[] str = scn.nextLine().trim().split(",");
        TicketBooking obj = new TicketBooking(str[0], str[1], Integer.parseInt(str[2]));
        
        System.out.println("Payment mode\n1.Cash payment\n2.Wallet payment\n3.Credit card payment");
        
        
        int n = Integer.parseInt(scn.nextLine());
        
        if(n == 1)
        {
            System.out.println("Enter the amount");
            double amnt = Double.parseDouble(scn.nextLine());
            obj.makePayment(amnt);

        }
        else if(n == 2)
        {
            
            System.out.println("Enter the amount");
            double amnt = Double.parseDouble(scn.nextLine());

            System.out.println("Enter the wallet number");
            String wlt = scn.nextLine();

            obj.makePayment(wlt, amnt);
        }

        else if(n == 3)
        {
            System.out.println("Enter card holder name");
            String nm = scn.nextLine();

            System.out.println("Enter the amount");
            double amnt = Double.parseDouble(scn.nextLine());


            System.out.println("Enter the credit card type");
            String crd = scn.nextLine();

            System.out.println("Enter the CCV number");
            String ccv = scn.nextLine();

            obj.makePayment(crd, ccv , nm, amnt);
        }
        else
        {
            System.out.println("Invalid choice");
        }

        scn.close();
    }
    
}
