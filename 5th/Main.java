class Main {
    public static void main(String[] args) {
        Point a = new Point();// Origin
        Point b = new Point(0, 4);
        Point c = new Point(3, 4);
        Point d = new Point(3, 0);
        System.out.println("\nTriangle:");
        Triangle t1 = new Triangle(a, b, c);
        System.out.println("Area=" + t1.area());
        System.out.println("Perimeter=" + t1.perimeter());
        System.out.println("\nCircle:");
        Circle c1 = new Circle(b, c);
        System.out.println("Area=" + c1.area());
        System.out.println("Perimeter=" + c1.perimeter());
        System.out.println("\nRectangle");
        Rectangle r1 = new Rectangle(a, b, c, d);
        System.out.println("Area=" + r1.area());
        System.out.println("Perimeter=" + r1.perimeter());
        System.out.println("Comparing1:" + r1.compareShape(new Rectangle(a, b, c, d)));
        System.out.println("Comparing2:" + r1.compareShape(t1));
    }
}