/*
input:  Ampphisoft
        softi
output: "Ampphisoft" does not end with "softi"

*/
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the string");
        String str = scn.nextLine();
        System.out.println("Enter the end string");
        String guess = scn.nextLine();

        if(str.endsWith(guess))
            System.out.println("\"" +str + "\" ends with \"" + guess + "\"");
        else
            System.out.println("\"" +str + "\" does not end with \"" + guess + "\"");
        
    }
}
