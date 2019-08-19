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
        
        System.out.println ("Insert integers:");        
        int intOne = input.nextInt();
        int intTwo = input.nextInt();
        System.out.println ("Insert double:");                
        double dobOne = input.nextDouble();
        double dobTwo = input.nextDouble();
        
        
        int sumOne = intOne + intTwo;
        int difOne = intOne - intTwo;
        int prodOne = intOne * intTwo;
        int quotOne = intOne / intTwo;
        
        System.out.format ("Integer made of two integers:\n%s\n%s\n%s\n%s\n%s\n%s\n", 
            intOne, intTwo, sumOne, difOne, prodOne, quotOne);
        
        
        double sumTwo = dobOne + dobTwo;
        double difTwo = dobOne - dobTwo;
        double prodTwo= dobOne * dobTwo;
        double quotTwo = dobOne / dobTwo;
        System.out.format ("Double made of two doubles:\n%s\n%s\n%s\n%s\n%s\n%s\n", 
            dobOne, dobTwo, sumTwo, difTwo, prodTwo, quotTwo);
            
        
       
        /* possible lossy conversions
        
        int intThree = dobOne + dobTwo; 
        int intFour = dobOne - dobTwo;
        int intFive = dobOne * dobTwo;
        int intSix = dobOne / dobTwo;
        System.out.format ("%s\n%s\n%s\n%s\n", 
            intThree, intFour, intFive, intSix);
        */
       
        double dobThree = intOne + intTwo; 
        double dobFour = intOne - intTwo;
        double dobFive = intOne * intTwo;
        double dobSix = intOne / intTwo;
        System.out.format ("Double made of two integers:\n%s\n%s\n%s\n%s\n", 
            dobThree, dobFour, dobFive, dobSix);        
            
        double mixOne = intOne + dobOne; 
        double mixTwo = intOne - dobOne; 
        double mixThree = intOne * dobOne; 
        double mixFour = intOne / dobOne; 
        System.out.format ("Double made of a double and an integer:\n%s\n%s\n%s\n%s\n", 
            mixOne, mixTwo, mixThree, mixFour);
    }
}   
