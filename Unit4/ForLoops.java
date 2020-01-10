
/**
 * Write a description of class ForLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ForLoops
{
    public static String table(int rows, int columns, int operation){
        String result = "";
        int add = 0; 
        if (operation == 0){
            for (int x = 0; x<rows; x++){
                for (int y = 0; y < columns; y++){
                add = x + y;
                result += add;}
                result += "\n";
            }
        }
        if (operation == 1){
            for (int x = 0; x<rows; x++){
                for (int y = 0; y < columns; y++){
                add = x - y;
                result += add;}
                result += "\n";
            }
        }
        if (operation == 2){
            for (int x = 0; x<rows; x++){
                for (int y = 0; y < columns; y++){
                add = x * y;
                result += add;}
                result += "\n";
            }
        }
        if (operation == 3){
           for (int x = 0; x<rows; x++){
                for (int y = 0; y < columns; y++){
                add = x / y;
                if (add==0){
                    result += "e";}
                else{
                    result += add;}}
                result += "\n";
            }
           }   
        if (operation == 4){
            for (int x = 0; x<rows; x++){
                for (int y = 0; y < columns; y++){
                add = (int)Math.pow(x,y);
                result += add;}
                result += "\n";
            }
        }
        return result;
    }
    public static String map(int height, int width, String symbols){
        int length = symbols.length();
        String result = "";
        for (int y = 0; y<height;y++){
            for (int x =0; x<width; x++){
                int rando = (int)(Math.random() * length);
                char add = symbols.charAt(rando); 
                result += add;
            }
            result +="\n";
        }
        System.out.print(result);
        return result; 
    }
}
