public class BoxMain {
    public static void main(String[] args) {
        Box b1=new Box();
        System.out.println("b1's area:"+b1.volume());
        Box b2=new Box(5);
        System.out.println("b2's area:"+b2.volume());
        Box b3=new Box(3,4,5);
        System.out.println("b3's area:"+b3.volume());
        
    }
}
