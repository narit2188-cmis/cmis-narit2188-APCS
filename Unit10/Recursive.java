
/**
 * Write a description of class Recursive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recursive
{
    public static void main (String argv[]){
        System.out.println(multiply(5,5));
        System.out.println(power(5,5)); 
        System.out.println(factorial(5)); 
        System.out.println(divide(7,5)); 
    }
    public static int multiply (int n, int x){
        if (x == 0){
            return 0;  
        }
        else {
           return (multiply(n,x-1)+n);
        }
    }
    public static int power (int n, int x){
        if (x == 0){
            return 1;  
        }
        else {
           return (power(n,x-1)*n);
        }
    }
    public static int factorial (int n){
        if (n == 0){
            return 1;  
        }
        else {
           return (factorial(n-1)*n);
        }
    }
        public static int divide (int n, int x){
        if (n < x){
            return 0;  
        }
        else {
           return (divide(n-x,x) + 1);
        }
    }
}
