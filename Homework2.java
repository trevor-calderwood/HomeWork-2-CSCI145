
public class Homework2 {
    public void run() {
        MatrixReader reader = new MatrixReader();
        //create new matrix objects
        SparseMatrix matrixA = reader.read("matrixA.txt");
        matrixA.print();
        SparseMatrix matrixB = reader.read("matrixB.txt");
        matrixB.print();

        //compute and print transpose of matrixA
        SparseMatrix transposeMatrixA = matrixA.transpose();
        transposeMatrixA.print();

        //compute and print transpose of matrixB
        SparseMatrix transposeMatrixB = matrixB.transpose();
        transposeMatrixB.print();

        //compute product of matrixA and matrixB and print
        /*
        SparseMatrix productMatrix = matrixA.produce(matrixB);
        productMatrix.print();

        */

    }
}
