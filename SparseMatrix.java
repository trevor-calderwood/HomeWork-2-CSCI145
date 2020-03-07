
public class SparseMatrix {
    private int totalRows;
    private int totalColumns;
    private MatrixRow firstRow;
    private MatrixColumn firstColumn;

    public SparseMatrix(int rows, int columns) {
        this.totalRows = rows;
        this.totalColumns = columns;

        this.firstColumn = new MatrixColumn();
        MatrixColumn tempColumn = firstColumn;

        for(int i = 0; i <= totalColumns; i++){

            tempColumn.setNext(new MatrixColumn());
            tempColumn = tempColumn.getNext();
        }

        this.firstRow = new MatrixRow();
        MatrixRow tempRow = firstRow;

        for(int j = 0; j <= totalRows; j++){
            tempRow.setNext(new MatrixRow());
            tempRow = tempRow.getNext();
        }



    }

    public void insert(int row, int column, int value) {
        ValeuNode temp = new ValueNode(row, column, value);
        MatrixRow.insert(temp.getRow());

        MatrixColumn.inset(temp.getColumn());

    }

    public MatrixRow getRow(int position) {
        return null;
    }

    public MatrixColumn getColumn(int position) {
        return null;
    }

    public int getValue(int row, int column) {
        return 0;
    }

    public void print() {

    }

    public SparseMatrix transpose() {
        return null;
    }

    public SparseMatrix produce(SparseMatrix other) {
        return null;
    }
}
