//import com.sun.jdi.Value;

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

    public int getTotalRows(){
        return totalRows;
    }

    public int getTotalColumns(){
        return totalColumns;
    }

    public void insert(int row, int column, int value) {
        // create a ValueNode for this row, column, value
        ValueNode node = new ValueNode(row, column, value);
        // get the MatrixRow of row
        MatrixRow rowObject = firstRow;
        for(int i=0; i < row; i++){
            // insert the ValueNode into the row
            if(rowObject.getFirst() == null){
                rowObject.setFirst(node);
                System.out.println("setFirst to row");
            }else{
                rowObject.insert(node);
            }
            rowObject = rowObject.getNext();
        }


        // get the MatrixColumn of column
        MatrixColumn columnObject = firstColumn;
        for(int i=0; i < column; i++){
            // insert the same ValueNode into the column
            if(columnObject.getFirst() == null){
                columnObject.setFirst(node);
                System.out.println("setFirst to column");
            }else{
                columnObject.insert(node);
            }
            columnObject = columnObject.getNext();
        }


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
        MatrixRow row = firstRow;
        if(firstRow == null){
            System.out.println("firstRow is null");
        }else if(row.getFirst() == null){
            System.out.println("row.getFirst() is null");
        }
        ValueNode node = row.getFirst();
        System.out.println("node.getRow() : " + node.getRow());
        System.out.println("node.getColumn() : " + node.getColumn());
        for(int j = 0; j < totalRows; j++){
            for(int i = 0; i < totalColumns; i++){
                //System.out.println("node.getRow() : " + node.getRow());
                //System.out.println("node.getColumn() : " + node.getColumn());
                if(j+1 == node.getRow() && i+1 == node.getColumn()){
                    System.out.print(node.getValue());
                }else{
                    System.out.print(0);
                }
                System.out.print(" ");
                node = node.getNextRow();
            }
            System.out.println();
            row = row.getNext();
        }
    }

    public SparseMatrix transpose() {   // Flips columns and rows
        SparseMatrix transpose  = new SparseMatrix(this.totalColumns, this.totalRows);
        ValueNode node = this.firstRow.getFirst();

        for (int i = 0; i < totalRows; i++ ) {		//iterates through row
            for(int j = 0; j < totalColumns; j++){    //iterates through column
                transpose.insert(node.getColumn(), node.getRow(), node.getValue());
                node = node.getNextRow();
            }
        }
                    return transpose;
    }

    public SparseMatrix produce(SparseMatrix other) {   //Multiplies both matrices together
        int rows = Math.max(this.totalRows, other.getTotalRows());
        int columns = Math.max(this.totalColumns, other.getTotalColumns());

        SparseMatrix product = new SparseMatrix(rows, columns);
/*
        for (int i = 1 -> rowsA) {		//computes each row in the product
            for(int j = 1 -> columnsB) {	//computes each column in the product
                for(int k = 1 -> columnsA) {	//computes each value in the product
                    sum += (value of matrixA at i, k) * (other.getValue(j, k));
                }
                product.insert(sum);
            }
        }
*/
        return product;
    }
}
