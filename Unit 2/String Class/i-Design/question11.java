/*
  input: Java             is                           an                 Object Oriented Prog Language
  output:The processed string is Java is an Object Oriented Prog Language
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

        System.out.print("The processed string is ");
        System.out.print(str.replaceAll("\\s+", " " ));
    }
}
