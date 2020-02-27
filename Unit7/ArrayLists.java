import java.util.*;
public class ArrayLists
{
    public static void main(String[] argv){
        List<Integer> original = new ArrayList<Integer>(); 
        for (int x = 0; x < 10; x ++){
            original.add((int) (Math.random() * 10)); 
        }
        List<Double> originalDub = new ArrayList<Double>(); 
        for (int x = 0; x < 10; x ++){
            Double add = Math.random() * 10; 
            originalDub.add(add); 
        }
        List<String> originalS = new ArrayList<String>(); 
        originalS.add("fish");
        originalS.add("cat");
        originalS.add("dog");
        System.out.println("original " + original); 
        System.out.println("getOdds " + getOdds(original)); 
        System.out.println("original double " + originalDub); 
        insertAvgs(originalDub); 
        System.out.println("averages inserted " + originalDub); 
        System.out.println("original string " + originalS);
        System.out.println("Chopped " + chopper(originalS)); 
    }
    
    public static List<Integer> getOdds(List<Integer> al){
       /*remove all odd integers from al. return an arraylist of all of the odds found*/
       List<Integer> oddsFound = new ArrayList<Integer>();
       for (int x = 0; x < al.size(); x ++){
           Integer odd = al.get(x); 
           if (odd%2!=0 && !odd.equals(null)){
               oddsFound.add(odd); 
               al.remove(x);
            }
       }
       return oddsFound; 
    }
    
    public static void insertAvgs(List<Double> al){
        /*insert the average between each pair of integers in the arraylist*/
        int size = al.size() + (al.size()-1); 
        for (int x = 0; x < al.size()-1; x+=2){
            Double avg = (al.get(x) + al.get(x+1) )/ 2; 
            al.add(x+1, avg); 
        }
    }
    
    public static List<String> chopper(List<String> words){
        /*return an arraylist composed of the 
         * front half of each word from words combined with the
         * back half of the next word.
         */
        List<String> chopped = new ArrayList<String>();
            for (int x = 0; x < words.size(); x++){
              String current = words.get(x);
              if (x+1 == words.size()){
                  String next = words.get(0); 
                  int currentSize = current.length()/2; 
                  int nextSize = next.length()/2; 
                  String insert = current.substring(0,currentSize) + next.substring(nextSize); 
                  chopped.add(x,insert); 
                }
              else{
                  String next = words.get(x+1); 
                  int currentSize = current.length()/2; 
                  int nextSize = next.length()/2;
                  String insert = current.substring(0,currentSize) + next.substring(nextSize); 
                  chopped.add(x,insert); 
                }
            }
            return chopped;
    }

}