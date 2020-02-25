import java.util.*;
public class ArrayLists
{
    public static void main(String[] argv){
        int random = (int) (Math.random() * 10); 
        List<Integer> original = new ArrayList<Integer>(); 
        for (int x = 0; x < random; x ++){
            original.add((int) (Math.random() * 10)); 
        }
        System.out.println("original " + original); 
        System.out.println("getOdds " + getOdds(original)); 
        System.out.pritnln("avg " + insertAvgs(original)); 
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
        for (int x = 0; x < al.size(); x+=2){
            Double avg = (al.get(x) + al.get(x+1) )/ 2; 
            al.add(x+1, avg); 
        }
    }
    
    public static List<String> chopper(List<String> words){
        /*return an arraylist composed of the 
         * front half of each word from words combined with the
         * back half of the next word.
         */
            return null;
    }

}