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
    
    
}
