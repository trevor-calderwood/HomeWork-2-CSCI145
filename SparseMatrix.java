
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
        // create a ValueNode for this row, column, value
        ValueNode node = new ValueNode(row, column, value);
        // get the MatrixRow of row
        MatrixRow rowObject = firstRow;
        for(int i=0; i < row; i++){
            rowObject = rowObject.getNext();
        }
        // insert the ValueNode into the row
        rowObject.insert(node);
        // get the MatrixColumn of column
        MatrixColumn columnObject = firstColumn;
        for(int i=0; i < column; i++){
            columnObject = columnObject.getNext();
        }
        // insert the same ValueNode into the column
        columnObject.insert(node);

    }

    public MatrixRow getRow(int position) {
        MatrixRow tempRow = firstRow;
        for(int i = 0; i < position; i++){
            tempRow = tempRow.getNext();
        }
        return tempRow;
    }

    public MatrixColumn getColumn(int position) {
        MatrixColumn tempColumn = firstColumn;
        for(int i = 0; i < position; i++){
            tempColumn = tempColumn.getNext();
        }
        return tempColumn;
    }

    public int getValue(int row, int column) {
        MatrixColumn tempColumn = firstColumn;
        MatrixRow tempRow = firstRow;

        for(int i = 0; i < row; i++){
            tempColumn = tempColumn.getNext();
        }
        for(int j = 0; j < column; j++){
            tempRow = tempRow.getNext();
        }
        //at this point, tempColumn and tempRow point to the correct column and row
        ValueNode columnNode = tempColumn.getFirst();
        for(int i = 0; i < row; i++){
            columnNode = columnNode.getNextRow();
        }
        ValueNode rowNode = tempRow.getFirst();
        for(int i = 0; i < column; i++){
            rowNode = rowNode.getNextRow();
        }
        if(columnNode.getValue() == rowNode.getValue()){
            return columnNode.getValue();
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

    public SparseMatrix produce(SparseMatrix other) {   //Multiplies both matrices together
        for (int i = 1 -> rowsA) {		//computes each row in the product
            for(int j = 1 -> columnsB) {	//computes each column in the product
                for(int k = 1 -> columnsA) {	//computes each value in the product
                    sum += (value of matrixA at i, k) * (value of matrixB at k, j)
                }
                insert sum into product
            }
        }

        return null;
    }
}
