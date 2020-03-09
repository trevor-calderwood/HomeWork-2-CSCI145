public class MatrixColumn {
    private ValueNode first;
    private MatrixColumn next;


    public ValueNode getFirst() {
        return first;
    }

    public MatrixColumn getNext() {
        return next;
    }

    public void setNext(MatrixColumn next) {
        this.next = next;
    }

    public void insert(ValueNode value) {
        if(this.first==null){
            this.first = value;
        }
        else if(value.getRow() < first.getRow()){
            value.setNextColumn(first);
            first = value;
        }
        else{
            ValueNode current = first;
            ValueNode next = current.getNextColumn();

            while((next != null) && (next.getRow() < value.getRow())){
                current = next;
                next = next.getNextColumn();
            }

            current.setNextColumn(value);
            value.setNextColumn(next);
        }


    }

    public int get(int position) {
             //  iterate through list of values until finding position that you're looking for and return what number it is in the list
             ValueNode currentNode = first;
             int row = 0;
             while(row < position){
                 currentNode = currentNode.getNextColumn();
                 row += 1;  // Shows what row the loop is checking
             }
             return currentNode.getRow();
     
              //return value of node when position = count 
         }
    }

