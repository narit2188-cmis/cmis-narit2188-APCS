
public class ConditionalsGame
{
    public static boolean f1(int string, int random, int bool){
        if ((string % random == 0) && (string % bool == 0)) {
            return true; 
        }
        else {
        return false;
        }
    }
    public static boolean f2(String length, String substring){
        int integer = length.length();
        int wordl= substring.length();
        String stringo = substring.substring(0, integer);
        String equals = substring.substring (wordl - integer);
        if (length.equals(stringo) || length.equals(equals)){ return true;}
        else{return false;}}
    public static boolean f3(int s1, int s2, int s3){
        if ((s1 == s2) && (s1 == s3) && (s2 == s3) ) {
            return true; 
        }
        else {return false;}
    }
    public static String f4(String word, String c){
        int position = word.indexOf(c); 
        String one = word.substring(0,position);
        String two = word.substring(position+1);
        int lengthOne = one.length();
        int lengthTwo = two.length();
        if (lengthOne < lengthTwo){
            return one;}
        else if (lengthTwo < lengthOne){
            return two;
        }
        else if (lengthOne == lengthTwo){
            return (one + two);
        }
        else{return "";}
    }
    public static boolean f5(int q, int x, int c){
        int big = 0;
        int smallOne = 0;
        int smallTwo = 0; 
        if ((q >= x) && (q >= c)){
            big = q;
            smallOne = x;
            smallTwo = c; 
        }
        
        else if ((x >= q) && (x >= c)){
            big = x;
            smallOne = q;
            smallTwo = c; 
        }
        
        else if ((c >= x) && (c >= q)){
            big = c;
            smallOne = x;
            smallTwo = q; 
        }
        double result = (Math.pow(smallOne, 2)) + (Math.pow(smallTwo, 2));
        System.out.println(result);
        System.out.println(big); 
        if (result == Math.pow(big,2)){
            return true;
        }
        return false;
    }
}
