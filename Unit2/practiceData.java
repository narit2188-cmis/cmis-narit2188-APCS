import java.util.Scanner;
/**
 * Write a description of class practiceData here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class practiceData
{
    public static void main (String[] argv) {
        System.out.println ("Compare the next two strings inputted");
        Scanner input = new Scanner (System.in);
        String one;
        one = input.nextLine ();
        String two;
        two = input.nextLine ();
        boolean result = two.equalsIgnoreCase(one);
        System.out.format ("These two strings are the same = %s \n", result);
        
        one = input.nextLine ();
        int result2 = one.hashCode();
        System.out.format ("The hash code of this string is %s", result2);
    }
}
