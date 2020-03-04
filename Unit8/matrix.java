public class matrix
{
    public static void main (String argv[]){
        int [][] matrix = new int[3][3];
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}, {10,11,12}}; 
        print1(matrix1); 
    }
    public static void print (int[][] matrix1){
        for (int x = 0; x<matrix1.length; x++){
            String result = ""; 
            for (int y = 0; y < matrix1[x].length; y++){
                result += matrix1[x][y] + " "; 
            }
            System.out.println(result); 
        }
        
    }
    public static void print1 (int[][] matrix1){
        for (int[] x : matrix1){
            for(int y : x){
                System.out.print(y + " "); 
            }
            System.out.println(); 
        }
    }
    public static void print3 (int[][] matrix1){
        for (int x = 0; x<matrix1.length; x++){
            for (int y = 0; y<matrix1.length; y++){
                System.out.print (matrix1[y][x] + " "); 
            }
            System.out.println(); 
        }
    
    }
}