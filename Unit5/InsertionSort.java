public class InsertionSort
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
        int sorted = 1; 
        int current = 0; 
        for (int x = 0; x < length -1; x++){
            for (int y = sorted; y > 0; y--){
                current = array[y-1]; 
                int next = array[y];
                if (next < current){
                    int temp = array[y]; 
                    array[y] = current;
                    array[y-1] = temp; 
                }
            }
            sorted += 1; 
        }
    }
}
