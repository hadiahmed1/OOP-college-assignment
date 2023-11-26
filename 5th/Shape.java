abstract class Shape {
    abstract double area();

    abstract double perimeter();

    abstract double colour();

    boolean compareShape(Shape obj) {
        if (this.area() == obj.area() && this.perimeter() == obj.perimeter()) {
            return true;
        }
        return false;
    }
}