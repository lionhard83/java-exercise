public abstract class AShape {

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "area:" + this.getArea() + " perimeter:" + this.getPerimeter();
    }
}
