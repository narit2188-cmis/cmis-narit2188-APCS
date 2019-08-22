import java.util.Scanner;
/**
 * Basic math operations launcher .
 *
 * @author Narit Trikasemsak
 * @version 0.1
 */
public class MathOperationsApp
{
    public static void main(String[] argv) {
        Scanner input = new Scanner (System.in);
        System.out.println ("Math Operations Assignment: ");
        
        System.out.println ("Find the sum of these three numbers: ");
        int basicAdd;
        basicAdd = input.nextInt();
        int basicAdd2;
        basicAdd2 = input.nextInt();
        int basicAdd3;
        basicAdd3 = input.nextInt();
        int answerOne = MathOps.sum(basicAdd,basicAdd2,basicAdd3);
        System.out.println (answerOne); 
        
        double basicDob;
        System.out.println ("Find the average of these three numbers: ");
        double a;
        a = input.nextDouble();
        double b;
        b = input.nextDouble();
        double c;
        c = input.nextDouble();
        double answerTwo = MathOps.avg(a,b,c);
        System.out.println (answerTwo);
        
        double cylinderArea;
        System.out.println ("Find the area of a cylinder/n input diameter, then height: ");
        basicAdd = input.nextInt();
        basicAdd2 = input.nextInt();
        double answerThree = MathOps.cylinder(basicAdd, basicAdd2);
        System.out.println (answerThree);
        
        int compoundInterest;
        System.out.println ("Find amount with compound interest/n input principal, rate, number, time : ");
        basicAdd = input.nextInt();
        basicAdd2 = input.nextInt();
        basicAdd3 = input.nextInt();
        int basicAdd4;
        basicAdd4 = input.nextInt();
        int answerFour = MathOps.interest(basicAdd,basicAdd2,basicAdd3,basicAdd4);
        System.out.println (answerFour); 
        
        double finalPosition;
                System.out.println ("Find final position of an object/n input initial velocity, final velocity, time, acceleration : ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        double d; 
        d = input.nextDouble();
        double answerFive = MathOps.finalPosition(a,b,c,d);
        System.out.println (answerFive); 
        
    }
  
}
