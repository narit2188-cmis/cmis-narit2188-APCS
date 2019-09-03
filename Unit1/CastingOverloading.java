
/**
 * Casting and Overloading.
 *
 * @Narit Trikasemsak
 * @version 0.1
 */
public class CastingOverloading
{
    public static int oneorZero() {
        return ((int)(Math.random() * 2)); 
    }

    public static int zeroTo99() {

        return ((int)(Math.random() * 100));
    }
    
    /*public static double zeroTo99() {
        return ((Math.random() * 100));
    }*/
    
    public static int zeroToN(int n) {
        return ((int)(Math.random() * (n+1)));
    }
    
    public static double zeroToN(double n) {
        return (Math.random() * (n+1));
    }
    
    public static int minToMax(int min, int max) {
        return ((int) ((Math.random()) * (max - min) + min));
    }

    public static double minToMax(double min, double max) {
        return (((Math.random()) * (max - min) + min));
    }
}
