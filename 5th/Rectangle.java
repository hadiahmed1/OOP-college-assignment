class Rectangle extends Shape {
    double l;
    double b;

    Rectangle(Point a, Point b, Point c, Point d) {
        if (a.distance(b) == c.distance(d) && a.distance(c) == b.distance(d)) {
            this.l = a.distance(b);
            this.b = a.distance(c);
        } else {
            this.l = 0;
            this.b = 0;
        }
    }

    @Override
    double area() {
        return l * b;
    }

    @Override
    double perimeter() {
        return 2 * (l + b);
    }

    @Override
    double colour() {
        // TODO Auto-generated method stub
        return 0;
    }
}