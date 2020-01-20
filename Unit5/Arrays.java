    
/**
 * Write a description of class Arrays here.
 *
 * @Narit
 * @1.0
 */
public class Arrays
    
{
    public static int max(int[] array){
        int result;
        int length;
        int max = array[0]; 
        length = array.length; 
        for (int x=0;x<length;x++){
            result = array[x];
            if (result>max){
                max = result; 
            }
        }
        return max;}
    public static int minIdx(int[] array){
        int result;
        int length;
        int min = array[0]; 
        length = array.length; 
        for (int x=0;x<length;x++){
            result = array[x];
            if (result<min){
                min = x; 
            }
        }
        return min;}
    public static int sum(int[] array){
        int sum =0;
        int length = array.length;
        for (int x=0;x<length;x++){
            sum += array[x];}
        return sum;}
    public static double avg(int[] array){
        double avg = 0;
        int length = array.length;
        for (int x=0;x<length;x++){
            avg += array[x];}
        avg = avg/length;
        return avg;}
    public static boolean allGreater(int[] array, int threshold){
        int num =0;
        boolean ans = true; 
        int length = array.length;
        for (int x=0;x<length;x++){
            num = array[x];
            if (num<=threshold){
                ans = false; 
            }
        }
        return ans;}
    /*public static boolean oneGreater(int[] array, int threshold){
        return true exactly 1 value is greater than threshold}
    public static int sumOfLessThan(int[] array, int threshold){
        return sum of all values less than threshold}
    public static int greatestPairIdx(int[] array){
        return index of greatest sum of consecutive pairs}
    public static int[] reverse(int[] array){
        return array reveresed}
    public static int[] shiftLeft(int[] array, int distance){
        return array with values shifted to the left by distance}
    public static int[] shiftRight(int[] array, int distance){
        return array with values shifted to the right by distance}
    public static int[] interleave(int[] array1, int[] array2){
        return 2 arrays interleaved}
    public static int[] maxValues(int[] array1, int[] array2){
        return new array with max value from each index}
    public static boolean allUnique(int[] array){
        return true if all items in array are unique}
    public static int[] uniqueValues(int[] array){
        return new array containing unique values from array} */
}
