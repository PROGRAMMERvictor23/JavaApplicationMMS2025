public class TestShapes {
    public static void main(String[] args) {

        Square square = new Square(
            new Point(0,0),
            new Point(2,0),
            new Point(2,2),
            new Point(0,2)
        );

        Rectangle rectangle = new Rectangle(
            new Point(0,0),
            new Point(4,0),
            new Point(4,2),
            new Point(0,2)
        );

        Parallelogram para = new Parallelogram(
            new Point(0,0),
            new Point(3,0),
            new Point(4,2),
            new Point(1,2)
        );

        Trapezoid trap = new Trapezoid(
            new Point(0,0),
            new Point(4,0),
            new Point(3,2),
            new Point(1,2)
        );

        System.out.println("Square Area: " + square.area());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Parallelogram Area: " + para.area());
        System.out.println("Trapezoid Area: " + trap.area());
    }
}