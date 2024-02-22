/*
input:  Ampphisoft
        Amphi
output: "Ampphisoft" does not start with "Amphi"

input:  Amphisoft
        Amphi
output: "Amphisoft" starts with "Amphi"
*/
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        Scanner scn  = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = scn.nextLine();

System.out.println("Enter the start string");
        String guess = scn.nextLine();

        scn.close();
        
        if(str.startsWith(guess))
            System.out.println("\"" +str + "\" starts with \"" + guess + "\"");
        else
             System.out.println("\"" + str + "\" does not start with \"" + guess + "\"");
    }
}
