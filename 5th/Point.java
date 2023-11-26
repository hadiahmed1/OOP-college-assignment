import java.lang.Math;

class Point {
    int x;
    int y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int x) {
        this.x = x;
        this.y = x;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double distance(Point p) {
        return Math.sqrt((this.y - p.y) * (this.y - p.y) + (this.x - p.x) * (this.x - p.x));
    }
}