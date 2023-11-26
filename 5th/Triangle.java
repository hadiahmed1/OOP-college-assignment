import java.lang.Math;

class Triangle extends Shape {
    double a, b, c;

    Triangle() {
        setDimension(0, 0, 0);
    }

    Triangle(double side) {
        setDimension(side, side, side);
    }

    Triangle(double a, double b, double c) {
        setDimension(a, b, c);
    }

    Triangle(Point a, Point b, Point c) {
        setDimension(a.distance(b), b.distance(c), c.distance(a));
    }

    private void setDimension(double x, double y, double z) {
        this.a = x;
        this.b = y;
        this.c = z;
    }

    @Override
    double area() {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    @Override
    double perimeter() {
        return a + b + c;
    }

    @Override
    double colour() {
        // TODO Auto-generated method stub
        return 0;
    }
}