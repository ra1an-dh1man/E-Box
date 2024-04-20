/*
Sample Input and Output 1:

Enter the contact details
9874563210,9874563210,0447896541,johndoe@abc.in,22nd street kk nagar chennai
DuplicateMobileNumberException: Mobile number and alternate mobile number are same

Sample Input and Output 2:

Enter the contact details
9874563210,9876543211,0447896541,johndoe@abc.in,22nd lane RR nagar kovai
Mobile:9874563210
Alternate mobile:9876543211
LandLine:0447896541
Email:johndoe@abc.in
Address:22nd lane RR nagar kovai
*/
import java.util.Scanner;

class DuplicateMobileNumberException extends Exception
{
    public DuplicateMobileNumberException(String s)
    {
        super(s);
    }
}

class ContactDetail
{
    private String mobile;
    private String alternateMobile;
    private String landLine;
    private String email;
    private String address;

    ContactDetail() {};

    ContactDetail(String mobile, String alternateMobile, String landLine, String email, String address)
    {
        this.mobile = mobile;
        this.alternateMobile = alternateMobile;
        this.landLine = landLine;
        this.email = email;
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAlternateMobile() {
        return alternateMobile;
    }

    public void setAlternateMobile(String alternateMobile) {
        this.alternateMobile = alternateMobile;
    }

    public String getLandLine() {
        return landLine;
    }

    public void setLandLine(String landLine) {
        this.landLine = landLine;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override

    public String toString()
    {
        return "Mobile:" + mobile + "\nAlternate mobile:" + alternateMobile + "\nLandLine:" + landLine + "\nEmail:" + email + "\nAddress:" + address;
    }
}

class ContactDetailBO 
{
    public static void validate(String mobile, String alternateMobile) throws DuplicateMobileNumberException
    {
        if(mobile.equals(alternateMobile))
        {
            throw new DuplicateMobileNumberException("Mobile number and alternate mobile number are same");
        }
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the contact details");

        String[] str = scn.nextLine().split(",");
        scn.close();

        String mobile = str[0];
        String alternateMobile = str[1];
        String landLine = str[2];
        String email = str[3];
        String address = str[4];

        try
        {
            ContactDetailBO obj1 = new ContactDetailBO();
            obj1.validate(mobile, alternateMobile);

            ContactDetail obj2 = new ContactDetail(mobile, alternateMobile, landLine, email, address);
            System.out.println(obj2);

        }

        catch(DuplicateMobileNumberException e)
        {
            System.out.println(e.toString());
        }


    }
}
