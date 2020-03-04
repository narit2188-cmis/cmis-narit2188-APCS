 public class GameOfLife
{
    /*
     * Game Of Life Rules
     * 1. Any live cell with fewer than two live neighbours dies, as if caused by under-population.
     * 2. Any live cell with two or three live neighbours lives on to the next generation.
     * 3. Any live cell with more than three live neighbours dies, as if by over-population.
     * 4. Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
     */
    public static void main(String[] argv){
        int[][] board = {{0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,1,0,0,0,0},
                         {0,0,0,0,1,1,1,0,0,0},
                         {0,0,0,0,1,0,1,0,0,0},
                         {0,0,0,0,0,1,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0},
                         {0,0,0,0,0,0,0,0,0,0}};
        print1(board); 
        nextGeneration(board);
        System.out.println(); 
        print1(board); 
    }    
    public static int[][] nextGeneration(int[][] board){
        int current = 0; 
        int surrounding = 0; 
        for (int row = 0; row < board.length; row ++){
            for (int column = 0; column < board[row].length; column++){
                current = board[row][column]; 
                if (current == 1){
                    if (board[row-1][column-1] == 1){
                        surrounding ++; 
                    }
                    if (board[row-1][column] == 1){
                        surrounding ++; 
                    }
                    if (board[row-1][column+1] == 1){
                        surrounding ++; 
                    }
                    if (board[row][column-1] == 1){
                        surrounding ++; 
                    }
                    if (board[row][column+1] == 1){
                        surrounding ++; 
                    }
                    if (board[row+1][column-1] == 1){
                        surrounding ++; 
                    }
                    if (board[row+1][column] == 1){
                        surrounding ++; 
                    }
                    if (board[row+1][column+1] == 1){
                        surrounding ++; 
                    }
                    if (surrounding<2){
                        board[row][column] = 0; 
                    }
                    else if (surrounding < 4){
                    }
                    else if (surrounding > 3){
                        board[row][column] = 0; 
                    }
                    surrounding = 0; 
                }
            }
        }
        return board; 
    }
    public static void print1 (int[][] matrix1){
        for (int[] x : matrix1){
            for(int y : x){
                System.out.print(y + " "); 
            }
            System.out.println(); 
        }
    }
}