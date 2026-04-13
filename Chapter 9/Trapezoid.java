class Trapezoid extends Quadrilateral {

    public Trapezoid(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double area() {
        double a = Math.abs(getP1().getX() - getP2().getX());
        double b = Math.abs(getP3().getX() - getP4().getX());
        double h = Math.abs(getP1().getY() - getP3().getY());
        return ((a + b) / 2) * h;
    }
}