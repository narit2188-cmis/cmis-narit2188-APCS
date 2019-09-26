public class SquareTester {
    
    public static void main (String[]argv) {
        Square s = new Square(10,"red",10.0);
        System.out.println (s);
        s.setLength(324);
        s.setColor ("danny");
        s.setWeight (101.1);
        System.out.println(s);
        System.out.println(s.getArea());
        s.setArea (400.0);
        System.out.println(s.getArea());

    }
}