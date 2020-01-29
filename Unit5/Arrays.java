    
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
        return max;
    }
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
        return min;
    }
    public static int sum(int[] array){
        int sum =0;
        int length = array.length;
        for (int x=0;x<length;x++){
            sum += array[x];}
        return sum;
    }
    public static double avg(int[] array){
        double avg = 0;
        int length = array.length;
        for (int x=0;x<length;x++){
            avg += array[x];}
        avg = avg/length;
        return avg;
    }
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
        return ans;
    }
    public static boolean oneGreater(int[] array, int threshold){
        int num =0;
        boolean ans = false; 
        int length = array.length;
        int number = 0; 
        for (int x=0;x<length;x++){
            num = array[x];
            if (num>threshold){
                ans = true; 
                number++; 
            }
            if (number>1){
                ans = false; 
            }
        }
        return ans;
    }
    public static int sumOfLessThan(int[] array, int threshold){
        int num =0;
        int ans = 0;  
        int length = array.length;
        for (int x=0;x<length;x++){
            num = array[x];
            if (num<threshold){
                ans+= num; 
            }
        }
        return ans;
    }
    public static int greatestPairIdx(int[] array){
        int index = 0;
        int sumBig = 0; 
        int length = array.length;
        int start = array[0] + array[1]; 
        for (int x =0; x<length-1; x++){
            int sum = array[x] + array[x+1]; 
            if (sum > sumBig){
                index = x; 
            }
        }
        return index; 
    }
    public static int[] reverse(int[] array){
        int length = array.length;
        int[] newArray = new int[length]; 
        int y = length - 1; 
        for (int x=0;x<length;x++){
            int place = array[x];
            newArray[y] = place;
            y--; 
        }
        return newArray;
    }
    public static int[] shiftLeft(int[] array, int distance){
        int length = array.length;
        int[] newArray = new int[length]; 
        int y = length; 
        for (int x=0;x<length;x++){
            if (x-distance <0 ){
                newArray[(length-distance)+x] = array[x]; 
            }
            else {
                newArray[x-distance] = array[x]; 
            }
        }
        return newArray;
    }
    public static int[] shiftRight(int[] array, int distance){
        int length = array.length;
        int[] newArray = new int[length]; 
        int y = length; 
        for (int x=0;x<length;x++){
            if (x+distance > length ){
                newArray[(length-distance)+x] = array[x]; 
            }
            else {
                newArray[x-distance] = array[x]; 
            }
        }
        return newArray;}
    public static int[] interleave(int[] array1, int[] array2){
        int length1 = array1.length;
        int length2 = array2.length; 
        int big = Math.max(length1,length2);
        int small = Math.min(length1, length2);
        int[] result = new int[big+small];
        int y =0; 
        for (int x=0; x<big;x++){
            if ((x)>=(length1-1)){
                result[y] = array1[x];
                System.out.print(result[y]);
                System.out.print(y);
                y++; 
                for (int z = x;z<big;z++){
                    System.out.print(x);

                    result[y]=array2[z];
                }
                return result; 
            }
            else{
            result[y]= array1[x];
            result[y+1]= array2[x]; 
            y+=2;}
        }
        return result; 
    }
    /*public static int[] maxValues(int[] array1, int[] array2){
        return new array with max value from each index}
    public static boolean allUnique(int[] array){
        return true if all items in array are unique}
    public static int[] uniqueValues(int[] array){
        return new array containing unique values from array} */
    }
