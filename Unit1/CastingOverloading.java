
/**
 * Casting and Overloading.
 *
 * @Narit Trikasemsak
 * @version 0.1
 */
public class CastingOverloading
{
    public static int oneorZero() {
        double org = Math.random();
        double result = org * 2 ;
        return (int)result; 
    }

    public static int zeroTo99() {
        double org = Math.random();
        double result = org * 100;
        return (int)result;
    }
    
    /*public static double zeroTo99() {
        double org = Math.random();
        double result = org * 100;
        return result;
    }
    */
    public static int zeroToN(int n) {
        double org = Math.random();
        double result = org * (n+1);
        return (int)result;
    }
    public static double zeroToN(double n) {
        double org = Math.random();
        double result = org * (n+1);
        return result;
    }
    
    public static int minToMax(int min, int max) {
        double org = Math.random();
        double result =  org * (max +1);
        return (int)result;
    }

}
