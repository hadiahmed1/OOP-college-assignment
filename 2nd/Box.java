class Box {
    private int l;
    private int b;
    private int h;

    // using constructor to initialize
    Box(int l, int b, int h) {
        setDimension(l, b, h);
    }

    Box() {
        setDimension(-1, -1, -1);
    }
    Box(int side) {// cube
        setDimension(side, side, side);
    }
    Box(Box src) {//Copying values from another object
        setDimension(src.l, src.b, src.h);
    }

    // using method to set
    void setDimension(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    double volume() {
        return l * b * h;
    }
}