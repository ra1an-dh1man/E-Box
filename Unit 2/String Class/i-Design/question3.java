/*
  input->Willam EdilBert
  output->Name:WILLAM EDILBERT
*/
import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the name:");
		String str = scn.nextLine();
		scn.close();
		System.out.println("Name:" + str.toUpperCase());
    }
}
    
