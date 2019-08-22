/**
 * Basic math operations.
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
    
    public static int interest (int principal, int rate, int number, int time) {
       int part1 = (int) Math.round(Math.pow((1 + (0.01 * rate)/number), (number*time)));
       int answer = principal * part1; 
       return answer;
    }
    
   
    public static double finalPosition (double initial, double velocity, double time, double acceleration) {
        double answer = initial + velocity * time + 0.5 * acceleration * Math.pow(time, 2);
        return answer; 
    }
    
}
