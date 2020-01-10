  public class Conditionals
{
    public static void main(String[] argv){
        
    }
    /**
     * Return true if v is between low and high
     */
    public static boolean between(int low, int high, int v){
        if ((v >= low) && (v <= high)){
            return true;
        }
        else {
            return false; 
        }
    }
    
    /**
     * Return true if v is not between low and high
     */
    public static boolean notBetween(int low, int high, int v){
        if (( v <= low) || (v >= high)) {
            return true;
        }
        else {
        return false; 
        }
    }
    
    /**
     * Return the greatestEven number from a, b, and c
     */
    public static int greatestEven(int a, int b, int c){
        if ((a >= b) && (a >= c) && ((a % 2) == 0)){
            return a; 
        } 
        else if ((b >= a) && (b >= c) && ((b % 2) == 0)){
            return b; 
        } 
        if ((c >= b) && (c >= b) && ((c % 2) == 0)){
            return c; 
        } 
        else {
        return 0;
        }
    }
    
    /**
     * return true if v is a multiple of both a and b
     */
    public static boolean isMultipleOf(int v, int a, int b){
        if ((v % a == 0) && (v % b == 0)) {
            return true; 
        }
        else {
        return false;
        }
    }
    
    /**
     * return true if s1, s2, and s3 could possibly represent the lengths of the sides of an isoscelese triangle.
     */
    public static boolean isIsoscelese(int s1, int s2, int s3){
        if ((s1 == s2) || (s1 == s3) || (s2 == s3) ) {
            return true; 
        }
        else {return false;}
    }
    
    /**
     * Return true if s1, s1, and s3 could represent the lengths of the sides of an equalateral triangle.
     */
    public static boolean isEqualateral(int s1, int s2, int s3){
        if ((s1 == s2) && (s1 == s3) && (s2 == s3) ) {
            return true; 
        }
        else {return false;}
    }
    
    /**
     * Return true if q, x, and c are a valid pythagorean triple (i.e. a^2 + b^2 = c^2)
     * Any combination of the three can make it valid, not necessarily in the order given.
     */
    public static boolean isPythTrip(int q, int x, int c){
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
    
    /**
     * return true if s1, s2, and s3 represent the length of the sides of a triangle.
     */
    public static boolean isTriangle(int s1, int s2, int s3){
        if (s1 + s2 < s3) {return true;}
        else if (s1 + s2 < s3) {return true;}
        else if (s1 + s2 < s3) {return true;}
        else{return false;}
    }
    
    /**
     * return true if word begins and ends with ps
     */
    public static boolean isPrefixAndSuffix(String ps, String word){
        int prel = ps.length();
        int wordl= word.length();
        String prefix = word.substring(0, prel);
        String suffix = word.substring (wordl - prel);
        if (ps.equals(prefix) || ps.equals(suffix)){ return true;}
        else{return false;}
    }
    
    /**
     * split the word at character c.
     * return the shorter of the 2 strings on either side of the split.
     * if they are the same length concatenate them and return
     * example:
     * c -> "c"
     * word -> "racecar"
     * return value -> "ra"
     * 
     * c -> "e"
     * word -> "racecar"
     * return -> "raccar"
     * 
     * c -> "u"
     * word -> "computer"
     * return -> "ter"
     */
    public static String shortSide(String word, String c){
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
        return "";
    }
    
    /**
     * return true if there are more than 3 occurances of c in the string word.
     * 
     * word -> "banana"
     * c -> "a"
     * return -> false
     * 
     * word -> "alabama"
     * c -> "a"
     * return -> true
     */
    public static boolean tooMany(String word, String c){
        int index1 = word.indexOf(c);
        if (index1 >= 0) {
            String word2 = word.substring(index1+1);
            int index2 = word2.indexOf(c);
            if (index2 >= 0){
                String word3 = word2.substring(index2+1);
                int index3 = word3.indexOf(c);
                if (index3 >= 0) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}