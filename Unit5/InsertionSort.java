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
        int sorted = 0; 
        for (int x = 1; x < length -1; x++){
            int current = array[x]; 
            for (int minus = sorted; minus >= 0; minus--){
                int compare = array[sorted]; 
                if (current < compare){
                    for (int move = 0; move <= sorted; move ++){
                        int temp = array[sorted];
                        array[sorted] 
                    }
                }
            }
        }
    }
}
