
public class WhileLoops
{   
   public static void main(){
       System.out.println(multiplicationTable(3,5)); 
    }
   public static String squareTable(){
       int integer = 1;
       while (integer <= 10) {
           int square = integer * integer;
           int random = (int)(Math.random() * (square-integer)) + integer;
           System.out.println(integer + "\t" + square + "\t" + random);
           integer += 1;
        }
       return "done"; 
   }
   
   public static int triangle(int input){
       int increment = 0; 
       while (input >= 1) {
           increment += input;
           input -= 1; 
        }
       return increment; 
    }
   
   public static int pyramid (int input) {
       int result = 0;
       while (input >= 1){
           result += input * input;
           input -= 1;
        }
       return result; 
    }
    
   public static String multiplicationTable(int input1, int input2){
       int across = 1;
       int down = 1; 
       String result = "\t";
       int max = Math.max(input1,input2);
       int increment = 0; 
       int increment2 = 0;
       int increment3 = 0;
       while (increment <= max) {
           if (increment == 0) {
               while (across <= input1){
                   result += across + "\t";
                   across += 1; 
                }
            }
           result += "\n";
           if (increment2 <= input2){
               result+= down + "\t";
               down +=1;
            }
           while (increment3 <= max){
               result += (int)(input1 * input2); 
               increment3 += 1; 
            }
           increment += 1;
           
        }
       return result; 
    }
}
