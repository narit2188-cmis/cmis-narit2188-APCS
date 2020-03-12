
/**
 * Write a description of class RecursiveArrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RecursiveArrays
{
    
    public static void main (String argv[]){
        int[] array = {1,2,3,4,5,6,7,8,9,10}; 
        printArray(array, 0, 9); 
        System.out.println(sum(array,0)); 
        System.out.println(greatestValue(array, 0, 0)); 
    }
    public static void printArray (int[] array, int idx1, int idx2){
        if (idx1<idx2){
            System.out.println(array[idx1]); 
            printArray(array, idx1+1, idx2); 
        }
        else System.out.println("done"); 
    }
    public static int sum (int[] array, int idx){
        if (idx < array.length){
           return (sum(array, idx+1) + array[idx]); 
        }
        else return 0; 
    }
    public static int greatestValue (int[] array, int idx, int greatest){
        if (idx < array.length){
            if (array[idx] > greatest){
                greatest = array[idx]; 
            }
            return (greatestValue(array, idx+1, greatest));
        }
        else return greatest; 
    }
    public static int smallestValue (int[][] array, int idxRow, int idxCol, int smallest){
        smallest = array[0][0]; 
        if (idxRow < array.length){
            if (idxCol < array[idxRow].length){
                if (array[idxRow][idxCol] < smallest){
                return (smallestValue(array, idxRow, idxCol+1, smallest)); }
            }
        }
        else return smallest; 
    }
}
