public class SquareTester {
    
    public static void main (String[]argv) {
        /*
        Square s = new Square(10.0,"red",10);
        System.out.println (s);
        s.setLength(324);
        s.setColor ("danny");
        s.setWeight (101);
        System.out.println(s);
        System.out.println(s.getArea());
        s.setArea (400.0);
        System.out.println(s.getArea());
        */
        Square a = new Square (10.0, "blue", 10);
        a.setArea(100);
        Square b = new Square(5.0, "blue", 8);
        b.setArea(36);
        Square newA = a.sub(b);
        System.out.println("This square is now " + newA);
        System.out.println("The new area is " + newA.getArea()); 

    }
    
}