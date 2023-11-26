import java.util.*;

class Matrix {
    int[][] arr;// creating refrence variable

    Matrix(int r, int c) {
        arr = new int[r][c];// Dynamically alocating memory to the array
    }

    void setMatrix() {// taking input in the Matrix
        Random r = new Random();// using Random class to genrate random integer
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(10);
            }
        }
    }

    void getMatrix() {// printing Matrix
        System.out.println("Printing Matrix:");
        for (int[] c : arr) {
            for (int element : c) {
                System.out.print(element + "  ");
            }
            System.out.println();
        }
    }

    Matrix matrixMul(Matrix m) { // this * m
        if (this.arr[0].length == m.arr.length) {// if(colum of 1st(this) matrix=rows of 2nd(m) Matrix)->multiply
            Matrix res = new Matrix(this.arr.length, m.arr[0].length);
            // Dimension of res=(rows of this) X (colums of m)
            for (int i = 0; i < res.arr.length; i++) {// iterating rows of res
                for (int j = 0; j < res.arr[0].length; j++) {// iteraring colum of res
                    // res= sumation(elemnt of i'th row of this+ corresponding element of j'th colum
                    // of m)
                    for (int k = 0; k < this.arr[0].length; k++) {// calculating sumation
                        res.arr[i][j] += this.arr[i][k] * m.arr[k][j];
                    }
                }
            }
            // Printing resultant matrix
            return res;
        } else {// if matrix arent compatible for multiplication
            System.out.println("Matrices aren't compatible for Multiplication");
            return null;
        }
    }

    Matrix matrixAdd(Matrix m) {
        Matrix res = new Matrix(this.arr.length, this.arr[0].length);
        if (this.arr.length == m.arr.length && this.arr[0].length == m.arr[0].length) {
            for (int i = 0; i < res.arr.length; i++) {
                for (int j = 0; j < res.arr[0].length; j++) {
                    res.arr[i][j] = this.arr[i][j] + m.arr[i][j];
                }
            }
            return res;
        } else {
            System.out.println("Matrix aren't compatible for addition");
            return null;
        }
    }

    Matrix matrixTranspose() {
        Matrix trans = new Matrix(this.arr[0].length, this.arr.length);
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[0].length; j++) {
                trans.arr[j][i] = arr[i][j];
            }
        }
        return trans;
    }
}