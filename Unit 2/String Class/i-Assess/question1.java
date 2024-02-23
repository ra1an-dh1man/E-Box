/*
->s for yes
->u for you
->2day for today
->y for why

input: where were you yesterday?
output:where were u sterday?

input: why is today a working day for you?
output:y is 2day a working day for u?

*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the text from the document");
            String str = scn.nextLine();
            scn.close();

            str = str.replaceAll("yes", "s");
            str = str.replaceAll("you", "u");
            str = str.replaceAll("today", "2day");
            str = str.replaceAll("why", "y");

        System.out.println(str);

     }
}
