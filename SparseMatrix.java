
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
        MatrixRow tempRow = MatrixRow.get(position);
        return tempRow;
    }

    public MatrixColumn getColumn(int position) {
        MatrixColumn tempCol = MatrixColumn.get(position);
        return tempCol;
    }

    public int getValue(int row, int column) {
        MatrixColumn tempCol;
        MatrixRow tempRow;

        for(int i = 0; i <= row; i++){
            tempCol = tempCol.getNext();
        }
        for(int j = 0; j <= row; j++){
            tempRow = tempRow.getNext();
        }
        Valuenode tempC = tempCol.get();
        Valuenode tempR = tempRow.get();
        if(tempC.getValue() == tempR.getValie()){
            return tempC.getValue();
        }
        else{
            return 0;
        }
    }

    public void print() {
        //Need to do
    }

    public SparseMatrix transpose() {   // Flips columns and rows
        // Need to do
        return null;
    }

    public SparseMatrix produce(SparseMatrix other) {   //Multiples both matrixes together
        // Need to do 
        return null;
    }
}
