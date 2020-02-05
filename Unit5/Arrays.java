import java.util.Random; 
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
                y++; 
                for (;x<big;x++){
                    result[y]=array2[x];
                    y++; 
                }
                return result; 
            }
            else if ((x)>=(length2-1)){
                result[y] = array2[x];
                y++; 
                for (;x<big;x++){
                    result[y]=array1[x];
                    y++; 
                }
                return result; 
            }
            else{
            result[y]= array1[x];
            result[y+1]= array2[x]; 
            y+=2;
            }
        }
        return result; 
    }
    public static int[] maxValues(int[] array1, int[] array2){
        int length1 = array1.length;
        int length2 = array2.length; 
        int big = Math.max(length1,length2);
        int small = Math.min(length1, length2);
        int[] result = new int[big]; 
        for(int x = 0; x<big; x++){
            if (((big-small)!= 0) && x>=small){
                if (big == (length2)){
                        for (;x<big;x++){
                            result[x] = array2[x]; 
                            return result; 
                        }
                }
                else if (big == (length2)){
                        for (;x<big;x++){
                            result[x] = array1[x]; 
                            return result; 
                        }
                }
                    
            }
            int compare = Math.max(array1[x],array2[x]);
            result[x] = compare;
        }
        return result; 
    }
    public static boolean allUnique(int[] array){
        boolean result = true; 
        int length = array.length; 
        int[] newarray = new int[length];
        int uniq = 0; 
        for (int y = 0; y<length; y++){
            int current = array[y];
            newarray[y] = current; 
            System.out.print(current); 
        }
        for (int x =0; x<length; x++){
            int aa = array[x]; 
            System.out.println(aa); 
            for (int check = 0; check < length; check++){
                int all = newarray[check]; 
                System.out.print(all);
                if (aa == all){
                    uniq++; 
                }
                else {
                    uniq = 0; 
                }
                if (uniq > 1){
                    return false; 
                }
            }
            result = true; 
        }
        return result; 
    }
    public static int[] uniqueValues(int[] array){
        int length = array.length;
        int newArrayLength = 0; 
        int[] checkArray = new int[length];
        int increment = 0; 
        int arrayY = 0; 
        boolean hasZero = false; 
        int zeroMore = 0; 
        for (int y = 0; y<length; y++){
            int current = array[y];
            for (int x =0; x<length; x++){
                int check = checkArray[x];
                int current1 = array[x];
                if (current == 0) {
                    hasZero = true; 
                    zeroMore += 1; 
                }
               else if (current == check){
                    increment +=1; 
                }
            }
            if (hasZero){
                if(zeroMore == length){
                checkArray[arrayY] = current;
                arrayY +=1; 
                newArrayLength += 1; }
                hasZero = false; 
            }
            else if (increment < 1) {
                checkArray[arrayY] = current; 
                arrayY +=1; 
                newArrayLength += 1; 
            }
            increment = 0; 
        }
        int[] result = new int[newArrayLength]; 
        for (int z = 0; z <newArrayLength; z++){
            result[z] = checkArray[z]; 
        }
        return result; 
    } 
    public static int[] randomArray(int length, int min, int max){
        int[] array = new int [length]; 
        for (int x =0; x < length; x++){
            int random = min + (int)(Math.random() * ((max - min) +1)); 
            System.out.println (random + " x is " + x); 
            array[x] = random; 
        }
        return array; 
    }
    public static int[] bubbleSort(int[] array){
        int length = array.length; 
        int start = 0;
        int y= 0; 
        for (int x = 0; x < length; x++){
            int current = array[start]; 
            for (; y <length-1; y++){
                int next  = array[y+1]; 
                System.out.println ("current is " + current + " next is " + next); 
                if (current>next){
                    array[y] = next;
                    array[y+1] = current; 
                    System.out.println ("swapped"); 
                }
            }
            y = 0; 
        }
        return array; 
    }
}
