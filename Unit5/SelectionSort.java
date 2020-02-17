public class SelectionSort
{
    public static void main(String[] args){
        int[] numbers = new int[15];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
        }
        print(numbers);
        sort(numbers);
        print(numbers);
    }

    public static void print(int[] array){
        for(int i : array){
            System.out.println(i);
        }
        System.out.println();
    }

    public static void sort(int[] array){
        int length = array.length; 
        int index = 0; 
        for (int sorted = 0; sorted < length - 1 ; sorted++){
            int minimum = array[sorted]; 
            for (int findMin = sorted; findMin < length -1; findMin++){
                int next = array[findMin+1]; 
                if (next < minimum){
                    minimum = next; 
                    index = findMin + 1 ; 
                }
            }
            int temp = array[sorted];
            array[sorted] = minimum; 
            array[index] = temp; 
        }
    }
}