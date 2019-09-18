
/**
 * APCS Unit 1 Quiz W/ Mr. Kief
 *
 * @author Narit Trikasemsak
 * @version Sep. 18 2019
 */
public class Unit1Quiz
{
    public static void main (String[] argv) {
        System.out.println(sumOfSquares(2, 3));
        System.out.println(sumOfSquares(1, 2));
        System.out.println(squareOfSum(3.2, 4.5));
        System.out.println(squareOfSum(1.2, 2.3));
        System.out.println(avg(1, 3, 4));
        System.out.println(avg(3, 7, 1));
        System.out.println(avgOfCubes(3.4, 4.5, 5.6));
        System.out.println(avgOfCubes(-0.1, 2.1, 3.4));
        System.out.println(cubeOfAvg(1, 2, 3));
        System.out.println(cubeOfAvg(3, 7, 23));
        System.out.println(cubeOfAvg(2, 3, 3));
        System.out.println(sum(3.14, 3.14, 3.14));
        System.out.println(sum(4.0, 7.5, 0.66666666666666));
    }
   
    public static int sumOfSquares (int a, int b) {
        int one = a * a;
        int two = b * b;
        int result = one + two;
        return result; 
    }
    
    public static double squareOfSum (double a, double b) {
        double one = a + b;
        double result = one * one;
        return result;
    }
    
    public static double avg (int a, int b, int c) {
        double stepOne = ((double)a) + ((double)b) + ((double)c);
        double result = stepOne / 3; 
        return result; 
    }
    
    public static double avgOfCubes (double a, double b, double c) {
        double aa = a * a * a; 
        double bb = b * b * b;
        double cc = c * c * c; 
        double stepOne = aa + bb + cc;
        double result = stepOne / 3;
        return result; 
    }
    
    public static double cubeOfAvg (int a, int b, int c) {
        double stepOne = a + b + c;
        double stepTwo = stepOne/3;
        double result = stepTwo * stepTwo * stepTwo; 
        return result;
    }
    
    public static int sum (double a, double b, double c) {
        int result = (int)(a + b + c);
        return result; 
    }
}
