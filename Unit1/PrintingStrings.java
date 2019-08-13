
/**
 * Write a description of class PrintingStrings here.
 *
 * @author (Narit Trikasemsak)
 * @version (0.1)
 */

import java.util.Scanner; //import for input
public class PrintingStrings
{
   public static void main(String[] argv) {
       Scanner input = new Scanner(System.in);
       
       String myString = new String("This is my string");
       
       String myName;
       
       myName = input.nextLine(); 
       
       System.out.println(myString);
       System.out.println(myName);
       
       System.out.format ("1: %s \n2: %s", myString, myName);
   
    }
}
