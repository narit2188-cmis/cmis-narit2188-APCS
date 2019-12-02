
public class WhileLoops
{   
   public static void main(){
       System.out.println(multiplicationTable(655,1111)); 
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
       int a = 1;
       int b = 1; 
       int c = 0; 
       int d = 0; 
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
           while (c < input1){
               result += a * b + "\t"; 
               a += 1;
               c += 1; 
            }
           a =1; 
           b+=1; 
           c = 0; 
           increment += 1;
           
        }
       return result; 
    }
}
