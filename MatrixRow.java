public class MatrixRow {
    private ValueNode first;
    private MatrixRow next;


    public ValueNode getFirst() {
        return first;
    }

    public MatrixRow getNext() {
        return next;
    }

    public void setNext(MatrixRow next) {
        this.next = next;
    }

    public void insert(ValueNode value) {
        if(this.first==null){
            this.first = value;
        }
        else if(value.getColumn() < first.getColumn()){
            value.setNextRow(first);
            first = value;
        }
        else{
            ValueNode current = first;
            ValueNode next = current.getNextRow();

            while((next != null) && (next.getColumn() < value.getColumn())){
                current = next;
                next = next.getNextRow();
            }

            current.setNextRow(value);
            value.setNextRow(next);
        }


    }

    public int get(int position) {
        //  iterate through list of values until finding position that you're looking for and return what number it is in the list
        ValueNode currentNode = first;
        int column = 0;
        while(column < position){
            currentNode = currentNode.getNextColumn();
            column += 1;
        }
        if(currentNode.getRow() == position){
            return column;
        }else{
            return 0;
        }

         //return count of list that has gone through.
    }

}
