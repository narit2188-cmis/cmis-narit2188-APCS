import java.lang.Math.*;

/**
 * Write a description of class MathOps here.
 *
 * @author Narit Trikasemsak
 * @version 0.1
 */
public class MathOps
{
    
    public static int sum (int a, int b, int c) {
        return a + b + c; 
    }
    
    public static double avg (double a, double b, double c) {
        return ((a + b + c) / 3);
    }
    
    public static double cylinder (int diameter, int height) {
        double diameter2 = diameter;
        double height2 = height; 
        double answer = Math.PI * Math.pow((diameter2 / 2), 2) * height2; 
        return answer;
    }
    
    /*public static int interest (int principal, int rate) {
       int answer = 
       return answer
    }
    */
   
    public static double finalPosition (double initial, double velocity, double time, double acceleration) {
        double answer = initial + velocity * time + 0.5 * acceleration * Math.pow(time, 2);
        return answer; 
    }
    
}
