public class MatrixRowTest {
  public void testInsertToEmtpy() {
    MatrixRow rowHead = new MatrixRow();
    ValueNode v1 = new ValueNode(1, 3, 13);
 
    rowHead.insert(v1);
    //print values in MatrixRow
  }
 
  public void testInsertToEnd() {
    MatrixRow rowHead = new MatrixRow();
    ValueNode v1 = new ValueNode(1, 3, 13);
    ValueNode v2 = new ValueNode(1, 5, 45);
    ValueNode v3 = new ValueNode(1, 8, 18);
 
    rowHead.insert(v1);
    rowHead.insert(v2);
    rowHead.insert(v3);
    //print values in MatrixRow
  }
 
  public void testInsertBeforeFirst() {
    MatrixRow rowHead = new MatrixRow();
    ValueNode v1 = new ValueNode(1, 3, 13);
    ValueNode v2 = new ValueNode(1, 2, 22);
 
    rowHead.insert(v1);
    rowHead.insert(v2);
    //print values in MatrixRow
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
