import java.lang.Math;
class Circle extends Shape{
    double r;
    Circle(){
        r=0;
    }
    Circle(int r){
        this.r=r;
    }
    Circle(Point p){
        this.r=p.distance(new Point());
    }
    Circle(Point p1,Point p2){
        this.r=p1.distance(p2);
    }
    @Override
    double area() {
        return Math.PI*r*r;
    }
    @Override
    double perimeter() {
        return 2*Math.PI*r;
    }
    @Override
    double colour() {
        // TODO Auto-generated method stub
        return 0;
    }
}