
/**
 * APCS Assignment, OCTOBER 2019
 *
 * @author Narit Trikasemsak
 * @version 0.1
 */
public class RegularPolygon
{
    private int nSides;
    private double sideLength;
    
    public String toString () {
        return "Length: " + sideLength + " # of sides= " + nSides;
    }
    public int getNSides(){
        return nSides;
    }
    public void setNSides (int newNSides) {
        nSides = newNSides; 
    }
    public double getSideLength (){
        return sideLength;
    }
    public void setSideLength (double newSideLength) {
        sideLength = newSideLength; 
    }
    public double getPerimeter () {
        return nSides * sideLength; 
    }
    public void setPerimeter (double newPerimeter) {
        sideLength = newPerimeter/sideLength; 
    }
    public double getRadius () {
        double radius = (sideLength) / (2 * Math.sin(180/nSides));
        return radius; 
    }
    public void setRadius(double newRadius) {
        sideLength = newRadius * (2 * Math.sin(180/nSides)); 
    }
    public double getApothem(){
        return ((sideLength)/(2 * Math.tan(180/nSides)));
    }
    /*public double getLengthOfLongestBisector () {
        
    }
    */  
    public double getArea() {
        return (0.5 * (nSides * sideLength) *((sideLength)/(2 * Math.tan(180/nSides))));
    }
    public void changeArea(double pct) {
        double newArea = pct * (0.5 * (nSides * sideLength) *((sideLength)/(2 * Math.tan(180/nSides))));
        sideLength = Math.sqrt(((2*newArea)/nSides) * 2 * Math.tan(180/nSides));
    }
    
}
