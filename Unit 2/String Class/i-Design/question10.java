/*
input: Amphi is a private organisation. Amphi is a product based company. EBox is a Amphi product
       Amphi
       Amphisoft
output:Amphisoft is a private organisation. Amphisoft is a product based company. EBox is a Amphisoft product
*/
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the content of the document");
        String str = scn.nextLine();

        System.out.println("Enter the old name of the company");
        String old = scn.nextLine();

        System.out.println("Enter the new name of the company");
        String updt = scn.nextLine();

        System.out.println("The content of the modified document is");
        System.out.println(str.replaceAll(old, updt));


        }
}
