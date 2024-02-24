/*
input:One fine morning, a minister from Emperor Akbar's court had gathered in the assembly hall.
He informed the Emperor that all his valuables had been stolen by a thief the previous night.
               stolen 

output:String is found in the document
*/
import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        
            // Fill your code here
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the text from the document");
            String str = scn.nextLine();

            System.out.println("Enter the string to be found in the data");
            String found = scn.nextLine().replaceAll("\\s+","");

            scn.close();

            String[] s = str.trim().split("\\s+"); 

            boolean res = false;

            for(int i = 0 ; i < s.length ;i++)
            {
                if(s[i].contains(found))
                {    
                    res = true;
                    break;
                }
            }
            if(res == true)
                System.out.println("String is found in the document");
            else
                System.out.println("String is not found in the document");



     }
}
