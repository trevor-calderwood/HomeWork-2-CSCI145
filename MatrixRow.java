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
        int column = value.getColumn();
        if(first==null){
            first = value;
        }
        else{
            ValueNode currentNode = first;

            while(currentNode.getColumn() < column - 1){
                currentNode = currentNode.getNextRow();
            }
            ValueNode newNextRow = currentNode.getNextRow();
            currentNode.setNextRow(value);
            value.setNextRow(newNextRow);
        }

        //  Set node before node being inserted to point to node in order if it is first have head point too.
        // Iterate through untile node index - 1 to set the pointer of that to node being inserted.
        // Iterate through again until the index of value being iserted and set next o null if nothing after or whatever the next node is
        //  Set node being inserting to point ot next node or null if nothing after




    }

    public int get(int position) {
        //  iterate through list of values until finding position that you're looking for and return what number it is in the list
        ValueNode currentNode = first;
        int column = 0;
        while(column < position){
            currentNode = currentNode.getNextColumn();
        }
        return currentNode.getRow();

         //return count of list that has gone through.
    }

}
