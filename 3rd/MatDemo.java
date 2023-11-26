class MatDemo {
    public static void main(String[] args) {
        Matrix m = new Matrix(3, 3);
        m.setMatrix();
        m.getMatrix();
        Matrix m2 = new Matrix(3, 3);
        m2.setMatrix();
        m2.getMatrix();
        System.out.println("Multipluing:");
        m.matrixMul(m2).getMatrix();
        System.out.println("Addition:");
        m.matrixAdd(m2).getMatrix();
        System.out.println("Transpose:");
        m.matrixTranspose().getMatrix();
    }
}
