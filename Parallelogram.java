public class Parallelogram extends AShape {

    private double side;
    private double base;
    private double angleInDegrees;
    private double height;

    public Parallelogram(double side, double base, double angleInDegrees) {
        this.side = side;
        this.base = base;
        this.angleInDegrees = angleInDegrees;
        this.height = this.side * Math.sin(Math.toRadians(this.angleInDegrees));
    }

    @Override
    public double getPerimeter() {
        return (this.side + this.base) * 2;
    }

    @Override
    public double getArea() {
        return this.base * this.height;
    }

    public double getSide() {
        return side;
    }
}
