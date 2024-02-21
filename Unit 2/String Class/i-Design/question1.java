//Sample input and output is int the end of the code.
import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        scn.close();

        
        System.out.println("Length of the first string is " + getLength(s1));
        System.out.println("Length of the second string is " + getLength(s2));
        
        System.out.println("The reverse of the first string is " + getLength(s1));
        System.out.println("The reverse of the second string is " + getRevrse(s2));
        
        System.out.println("The concatenated string is " + getConcat(s1, s2));
        
        int res = getCompare(s1,s2);

        if(res == -1)
            System.out.println(s1 + " appears before " + s2);
        else if(res == 1)
            System.out.println(s2 + " appears before " + s1);
        else if(res == 0)
            System.out.println("Both the input strings are same");
        

    }

    public static int getLength(String s)
    {
        return s.length();
    }

    public static String getRevrse(String s)
    {
        char[] res = new char[s.length()];
        for(int i = s.length() - 1,j = 0 ; i >= 0 ; i--, j++)
        {
            char ch = s.charAt(i);
            res[j] = ch; 
        }

        return new String(res);
    }

    public static String getConcat(String s1, String s2)
    {
        return s1.concat(s2);
    }


    public static int getCompare(String s1, String s2)
    {
        int len1 = s1.length();
        int len2 = s2.length();

        int len = Math.min(len1, len2);

        for(int i = 0 ; i < len ; i++)
        {
            if(s1.charAt(i) < s2.charAt(i))
                return -1;
            else if(s1.charAt(i) > s2.charAt(i))
                return 1;
        }

        if(len1 < len2)
            return -1;
        else if(len1 > len2)
            return 1;
    
    return 0;
    }
}

/*
To compare 2 strings --- The function returns 0 if the 2 strings are the same, returns -1 
if the first string is less than the second string and returns 1 
if the first string is greater than the second string. 

input-> were
        apple
output->Length of the first string is 4
        Length of the second string is 5
        The reverse of the first string is erew
        The reverse of the second string is elppa
        The concatenated string is wereapple
        apple appears before were
        
input-> apple
        were
output->Length of the first string is 5       
        Length of the second string is 4
        The reverse of the first string is elppa
        The reverse of the second string is erew
        The concatenated string is applewere
        apple appears before were

input-> be
        bet        
output->Length of the first string is 2        
        Length of the second string is 3
        The reverse of the first string is eb
        The reverse of the second string is teb
        The concatenated string is bebet
        be appears before bet

input-> be
        be
output->Length of the first string is 2
        Length of the second string is 2
        The reverse of the first string is eb
        The reverse of the second string is eb
        The concatenated string is bebe
        Both the input strings are same

*/
