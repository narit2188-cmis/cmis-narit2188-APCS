import java.util.*; 
/**
 * Write a description of class ArrayLists here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayLists
{
    public static void main (String argv[]){
        List<Integer> numbers = new ArrayList<Integer>();
        for (int x = 0; x < 100; x++){
            numbers.add(99-x, x); 
        }
        System.out.print(numbers); 
    }
}