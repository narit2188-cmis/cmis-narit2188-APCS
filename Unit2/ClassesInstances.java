import java.lang.Integer;
import java.lang.String;
/**
 * Write a description of class ClassesInstances here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClassesInstances
{
   public static String binMaxInt() {
       int max = Integer.MAX_VALUE;
       String result = Integer.toBinaryString(max);
       return result;
    }
    
   public static String binDiffMax(Integer i) {
       int max = Integer.MAX_VALUE;
       int stepOne = max - i;
       String result = Integer.toBinaryString(stepOne);
       return result;
    }
    
   public static String mutant(String a, String b){
       int aa = a.length();
       int bb = b.length();
       int step1 = aa/2;
       int step2 = bb/2;
       String result1 = a.substring(0,step1);
       String result2 = b.substring(step2); 
       return result1+result2;
    }
    
   public static String triMutant(String a, String b, String c){
       int aa = a.length();
       int bb = b.length();
       int cc = c.length();
       int aaa = aa/3;
       int bbb = bb/3;
       int ccc = cc/3;
       String result1 = a.substring(0,aaa);
       String result2 = b.substring(bbb,(bbb+bbb));
       String result3 = c.substring ((2 * ccc));
       return (result1 + result2 + result3); 
    }
    
   public static String swapEnds(String a) {
       int aa = a.length();
       String result1 = a.substring(0,1);
       String result2 = a.substring(aa-1); 
       String resultMid = a.substring (1, aa-1);
       return (result2 + resultMid + result1);
    }
    
   public static int indexOf2nd(String haystack, String needle) {
      int a = haystack.indexOf(needle);
      int b = haystack.indexOf(needle, a+1);
      return b;
    }

   public static int indexOf2ndLast(String haystack, String needle){
      int a = haystack.lastIndexOf(needle);
      int b = haystack.lastIndexOf(needle, a-1);
      return b;
    }
   
   public static boolean reduplication(String word){
      int a = word.length();
      int aa = a/2;
      String one = word.substring(0,aa);
      String two = word.substring(aa);
      boolean result = one.equalsIgnoreCase(two);
      return result; 
    }
    
   public static boolean binContains(Integer i, String p){
      String a = Integer.toBinaryString(i);
      boolean result = a.contains(p);
      return result;
    }
    
   public static boolean isPalindrome(Integer i) {
       int a = Integer.reverse(i);
       System.out.println(a);
       String bb = Integer.toBinaryString(i);
       System.out.println(bb);
       String aa = Integer.toBinaryString(a);
       System.out.println(aa);
       int aaa = bb.length();
       String aaaa = aa.substring(0,aaa); 
       System.out.println(aaaa);
       boolean result = bb.contains(aaaa);
       return result; 
    }
  
   public static boolean isAnagram(Integer a, Integer b) {
       String aa = Integer.toBinaryString(a);
       String bb = Integer.toBinaryString(b);
       int one = Integer.bitCount(a); 
       int two = Integer.bitCount(a);
       boolean result = 0 == (one-two); 
       return result;
    }
    
   public static boolean cubeContainsSelf(Integer i) {
       int ii = i * i * i; 
       String a = Integer.toBinaryString(ii);
       String b = Integer.toString(i); 
       boolean result = a.contains(b);
       return result; 
    }
   
   public static double maxValue(double a, double b, double c, double d) {
       double ab = Math.max(a,b);
       double cd = Math.max(c,d);
       double result = Math.max(ab,cd);
       return result;
    }

   public static Integer middleValue(Integer a, Integer b, Integer c){
       int ab = Math.max(a,b);
       int bc = Math.max(b,c);
       int result = Math.min (ab,bc);
       return result;
    }
}

