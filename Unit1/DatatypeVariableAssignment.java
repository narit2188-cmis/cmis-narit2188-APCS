import java.util.Scanner;
/**
 * @author Narit Trikasemsak
 * @version 0.1
 */
public class DatatypeVariableAssignment
{
    public static void main (String[] argv) {
        Scanner input = new Scanner (System.in);
        System.out.println ("DatatypeVariableAssignment:");

        byte firstVar = 100;
        short secondVar = 10000;
        int thirdVar = 100000;
        long fourthVar = 1000000;
        float fifthVar = 1.2f;
        double sixthVar = 1.2345;
        boolean seventhVar = true; 
        char eighthVar = '\u0000';

        System.out.println(firstVar);
        System.out.println(secondVar);
        System.out.println(thirdVar);
        System.out.println(fourthVar);
        System.out.println(fifthVar);
        System.out.println(sixthVar);
        System.out.println(seventhVar);
        System.out.println(eighthVar);

        boolean apOne;
        apOne = input.nextBoolean();

        int apTwo;
        apTwo = input.nextInt();

        double apThree;
        apThree = input.nextDouble();

        System.out.format ("I am a boolean: %s\nI am an integer: %s\nI am a double: %s",
            apOne, apTwo,apThree);
    }

    public static void typeTest() {
        Scanner input = new Scanner (System.in);
        System.out.println ("typeTest:");
        
        /*int intOne = input.nextInt();
        int intTwo = input.nextInt();
        int sumOne = intOne + intTwo;
        int difOne = intOne - intTwo;
        int prodOne = intOne * intTwo;
        int quotOne = intOne / intTwo;
        
        System.out.format ("%s\n%s\n%s\n%s\n%s\n%s\n", 
            intOne, intTwo, sumOne, difOne, prodOne, quotOne);
        */
        double dobOne = input.nextDouble();
        double dobTwo = input.nextDouble();
        double sumTwo = dobOne + dobTwo;
        double difTwo = dobOne - dobTwo;
        double prodTwo= dobOne * dobTwo;
        double quotTwo = dobOne / dobTwo;
        System.out.format ("%s\n%s\n%s\n%s\n%s\n%s\n", 
            dobOne, dobTwo, sumTwo, difTwo, prodTwo, quotTwo);
    }
}   
