/*
  Enter the User detail
  Ganesh Ram,Ram,ram@123
  Enter the contact details
  9874563210,7897897897,044-1234567,ramg@abc.in,22nd street kk nagar
  Name:Ganesh Ram
  Username:Ram
  Password:ram@123
  Contact detail:
  Mobile:9874563210
  Alternate mobile:7897897897
  LandLine:044-1234567
  Email:ramg@abc.in
  Address:22nd street kk nagar
*/
import java.util.Scanner;
class ContactDetail
{
    private String mobile; 
    private String alternateMobile; 
    private String landLine; 
    private String email; 
    private String address; 

    ContactDetail(String mobile, String alternateMobile, String landLine, String email, String address)
    {
        this.mobile = mobile;
        this.alternateMobile = alternateMobile;
        this.landLine = landLine;
        this.email = email;
        this.address = address;
    }

    public String getMobile()
    {
        return mobile;
    }

    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }

    public String getAlternateMobile()
    {
        return alternateMobile;
    }

    public void setAlternateMobile(String alternateMobile)
    {
        this.alternateMobile = alternateMobile;
    }

    public String getLandLine()
    {
        return alternateMobile;
    }

    public void setLandLine(String landLine)
    {
        this.landLine = landLine;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override

    public String toString()
    {
        return "Mobile:" + mobile + "\nAlternate mobile:" + alternateMobile + "\nLandLine:" + landLine + "\nEmail:" + email + "\nAddress:" + address;
    }
}
class User
{
    private String name;
    private String username;
    private String password;
    private ContactDetail contactDetail;

    public User(String name, ContactDetail contactDetail, String username, String password)
    {
        this.name = name;
        this.username = username;
        this.password = password;
        this.contactDetail = contactDetail;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public ContactDetail getContactDetail()
    {
        return contactDetail;
    }

    public void setContactDetails(ContactDetail contactDetail)
    {
        this.contactDetail = contactDetail;
    }

    @Override

    public String toString()
    {
        return "Name:" + name + "\nUsername:" + username + "\nPassword:" + password + "\nContact Details:\n" + contactDetail.toString();
    }
}

public class Main
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the User detail");
        String[] usr = scn.nextLine().trim().split(",");
        
        String nm = usr[0];
        String usrnm = usr[1];
        String psswd = usr[2];


        System.out.println("Enter the contact detail");

        String[] cnt = scn.nextLine().trim().split(",");
        
        String mbl = cnt[0];
        String altmbl = cnt[1];
        String landline = cnt[2];
        String email = cnt[3];
        String addrs = cnt[4];

        scn.close();

        ContactDetail obj1 = new ContactDetail(mbl, altmbl, landline, email, addrs);
        User obj2 = new User(nm, obj1, usrnm, psswd);

        System.out.println(obj2.toString());
    }
}
