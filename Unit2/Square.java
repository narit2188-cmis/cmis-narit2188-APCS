public class Square {
    
    private double sideLength = 5;
    private String color = "red";
    private int weight = 10;     
    public Square (double side, String color, int weight){
        this.sideLength = side;
        this.color = color;
        this.weight = 10;       
    }
    public Square (double side){
        this.sideLength = side; 
    }
    public Square (String color){
        this.color = color;
    }
    public Square (int weight){
        this.weight = 10;       
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
    public int getWeight (){
        return weight;
    }
    public void setWeight (int newWeight){
        weight = newWeight;                                                     
    }
    public double getArea (){
        return (sideLength * sideLength);
    }
    public void setArea (double area){
        sideLength = (Math.sqrt(area));
    }
    public Square sub(Square other){
        double one = this.getArea(); 
        double two = other.getArea();
        double result = Math.max(one,two);
        double result2 = Math.min(one,two);
        double finalResult = result -result2; 
        Square newArea = new Square(Math.sqrt(finalResult));
        return newArea;
    }
    public String toString (){
        return "Square legnth of " + sideLength + " color " + color + " weight " + weight; 
    }
}
