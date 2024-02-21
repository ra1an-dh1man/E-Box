/*
  input->Amphisoft Technologies
  output->The processed string is Amphisoft TECHNOLOGIES
*/
import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the input string");
        String s = scn.nextLine();
        scn.close();

        String[] str = s.trim().split(" ");

        for(int i = 1; i<str.length ; i++)
        {
            str[i] = str[i].toUpperCase();
        }

        System.out.print("The processed string is ");
        for(int i = 0 ; i < str.length ;i++)
        {
            System.out.print(str[i] + " ");
        }

    }
}
    
