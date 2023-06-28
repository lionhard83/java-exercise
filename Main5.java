import java.util.ArrayList;

public class Main5 {
    public static void main(String[] args) {
        Parallelogram p = new Parallelogram(10, 15, 30);
        // System.out.println(p.getArea());
        // System.out.println(p.getPerimeter());

        Rectangle r = new Rectangle(10, 10);

        // System.out.println(r.getArea());
        // System.out.println(r.getPerimeter());

        Square s = new Square(10);

        // System.out.println(s.getArea());
        // System.out.println(s.getPerimeter());

        ArrayList<Parallelogram> parallelograms = new ArrayList<>();
        parallelograms.add(p);
        parallelograms.add(r);
        parallelograms.add(s);

        Circle c = new Circle();

        ArrayList<AShape> shapes = new ArrayList<>();

        shapes.add(p);
        shapes.add(r);
        shapes.add(s);
        shapes.add(c);
        shapes.add(s);

        for (AShape shape : shapes) {
            System.out.println(shape.toString());
        }

        AShape a = new AShape() {
            public double getPerimeter() {
                return 0;
            };

            public double getArea() {
                return 0;
            };
        };
    }
}
