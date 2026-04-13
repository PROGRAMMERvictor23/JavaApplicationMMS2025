class Rectangle extends Parallelogram {

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double area() {
        double length = Math.abs(getP1().getX() - getP2().getX());
        double width = Math.abs(getP1().getY() - getP3().getY());
        return length * width;
    }
}