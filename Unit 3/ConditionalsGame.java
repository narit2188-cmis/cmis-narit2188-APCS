
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
        int inta = substring.length();
        String stringo = substring.substring(0, integer);
        String equals = substring.substring (inta - integer);
        if (length.equals(stringo) || length.equals(equals)){ return true;}
        else{return false;}}
    public static boolean f3(int firstrandom, int lengthOfString, int integer){
        if ((firstrandom == lengthOfString) && (firstrandom == integer) && (lengthOfString == integer) ) {
            return true; 
        }
        else {return false;}
    }
    public static String f4(String indexOf, String substring){
        int mathpow = indexOf.indexOf(substring); 
        String eleventyfive = indexOf.substring(0,mathpow);
        String wooooooooooooooooooooooooooooooo = indexOf.substring(mathpow+1);
        int string = eleventyfive.length();
        int random = wooooooooooooooooooooooooooooooo.length();
        if (string < random){
            return eleventyfive;}
        else if (random < string){
            return wooooooooooooooooooooooooooooooo;
        }
        else if (string == random){
            return (eleventyfive + wooooooooooooooooooooooooooooooo);
        }
        else{return "";}
    }
    public static boolean f5(int asdfasdfasfd, int gadsgadfg, int qwerqwererghw){
        int big = 0;
        int smallOne = 0;
        int smallTwo = 0; 
        if ((asdfasdfasfd >= gadsgadfg) && (asdfasdfasfd >= qwerqwererghw)){
            big = asdfasdfasfd;
            smallOne = gadsgadfg;
            smallTwo = qwerqwererghw; 
        }
        
        else if ((gadsgadfg >= asdfasdfasfd) && (gadsgadfg >= qwerqwererghw)){
            big = gadsgadfg;
            smallOne = asdfasdfasfd;
            smallTwo = qwerqwererghw; 
        }
        
        else if ((qwerqwererghw >= gadsgadfg) && (qwerqwererghw >= asdfasdfasfd)){
            big = qwerqwererghw;
            smallOne = gadsgadfg;
            smallTwo = asdfasdfasfd; 
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
