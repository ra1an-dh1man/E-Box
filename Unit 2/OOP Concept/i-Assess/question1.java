import java.util.*;

class Country
{
    public String name;
    public String countryCode;
    public String isdCode;


    Country(String name, String countryCode, String isdCode)
    {
        this.name = name;
        this.countryCode = countryCode;
        this.isdCode = isdCode;
    }
}

public class Main
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner((System.in));

        System.out.println("Enter the country name");
        String nm = scn.nextLine();

        System.out.println("Enter country code");
        String cd = scn.nextLine();

        System.out.println("Enter the isd code");
        String isd = scn.nextLine();

        scn.close();

        System.out.println("Country Name : " + nm);
        System.out.println("Country Code : " + cd);
        System.out.println("ISD Code : " + isd);

    }
}
