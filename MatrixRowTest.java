public class MatrixRowTest {
  public void testInsertToEmtpy() {
    MatrixRow rowHead = new MatrixRow();
    ValueNode v1 = new ValueNode(1, 3, 13);
 
    rowHead.insert(v1);
    if(rowHead.getFirst() == v1){
      System.out.println("Insert to empty : PASS");
    }else{
      System.out.println("Insert to empty : FAIL");
    }
  }
 
  public void testInsertToEnd() {
    MatrixRow rowHead = new MatrixRow();
    ValueNode v1 = new ValueNode(1, 3, 13);
    ValueNode v2 = new ValueNode(1, 5, 45);
    ValueNode v3 = new ValueNode(1, 8, 18);
 
    rowHead.insert(v1);
    rowHead.insert(v2);
    rowHead.insert(v3);

    if(rowHead.getFirst() == v1 && rowHead.getFirst().getNextRow() == v2 && rowHead.getFirst().getNextRow().getNextRow() == v3){
      System.out.println("Insert to end : PASS");
    }else{
      System.out.println("Insert to end : FAIL");
    }
  }
 
  public void testInsertBeforeFirst() {
    MatrixRow rowHead = new MatrixRow();
    ValueNode v1 = new ValueNode(1, 3, 13);
    ValueNode v2 = new ValueNode(1, 2, 22);
 
    rowHead.insert(v1);
    rowHead.insert(v2);
    //print values in MatrixRow
    System.out.println("First: " + rowHead.getFirst().getValue());
    System.out.println("Second: " + rowHead.getFirst().getNextRow().getValue());
  }
 
  public void testInsertBeforeLast() {
    MatrixRow rowHead = new MatrixRow();
    ValueNode v1 = new ValueNode(1, 3, 13);
    ValueNode v2 = new ValueNode(1, 8, 18);
    ValueNode v3 = new ValueNode(1, 5, 45);
 
    rowHead.insert(v1);
    rowHead.insert(v2);
    rowHead.insert(v3);
    //print values in MatrixRow
  }
}
