public class MainStack2 {
    public static void main(String[] args) {
        Stack2 si= new Stack2(5);
        si.push(5);
        si.push(6);
        si.push(1);
        si.push(4);
        si.push(7);
        si.push(3);
        System.out.println(si.pop()+" is Popped");
        System.out.println(si.pop()+" is Popped");
        System.out.println(si.pop()+" is Popped");
        System.out.println(si.pop()+" is Popped");
        System.out.println(si.pop()+" is Popped");
        System.out.println(si.pop()+" is Popped\n");

        Stack2 sd= new Stack2(5);
        sd.push(5.7);
        sd.push(7.6);
        sd.push(1.4);
        sd.push(2.4);
        sd.push(7.5);
        sd.push(3.9);
        System.out.println(sd.pop()+" is Popped");
        System.out.println(sd.pop()+" is Popped");
        System.out.println(sd.pop()+" is Popped");
        System.out.println(sd.pop()+" is Popped");
        System.out.println(sd.pop()+" is Popped");
        System.out.println(sd.pop()+" is Popped\n");

        Stack2 ss= new Stack2(5);
        ss.push("abc");
        ss.push("def");
        ss.push("xyz");
        ss.push("ghi");
        ss.push("klm");
        ss.push("nop");
        ss.push("uvw");
        System.out.println(ss.pop()+" is Popped");
        System.out.println(ss.pop()+" is Popped");
        System.out.println(ss.pop()+" is Popped");
        System.out.println(ss.pop()+" is Popped");
        System.out.println(ss.pop()+" is Popped");
        System.out.println(ss.pop()+" is Popped");
    }
}
