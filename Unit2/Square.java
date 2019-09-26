public class Square {
    
    private double sideLength = 5;
    private String color = "red";
    private double weight = 10.0;     
    public Square (int side, String color, double weight){
        this.sideLength = side;
        this.color = color;
        this.weight = 10.0;       
    }
    public Square (String color){
        this.color = color;
    }
    public Square (double weight){
        this.weight = 10.0;       
    }
    public double getLength(){
        return sideLength;
    }
    public void setLength(double newLength){
        sideLength = newLength; 
    }
    public String getColor () {
        return color;
    }
    public void setColor (String newColor){
        color = newColor;
    }
    public double getWeight (){
        return weight;
    }
    public void setWeight (double newWeight){
        weight = newWeight;                                                     
    }
    public double getArea (){
        return (sideLength * sideLength);
    }
    public void setArea (double area){
        sideLength = (Math.sqrt(area));
    }
    public String toString (){
        return "Square legnth of " + sideLength + " color " + color + " weight " + weight; 
    }
}
