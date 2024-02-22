/*
input:  Amphisoft Technologies is             a                  private     organization
output: Amphisoft
        Technologies  
        is
        a
        private
        organization
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
        String[] s = str.trim().split("\\s+");

        System.out.println("The words in the string are");
        for(String wrd: s)
        {
            System.out.println(wrd);
           
        }
    }
}
