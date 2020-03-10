import java.io.File;
import java.util.*;

public class MatrixReader {

    public SparseMatrix read(String filename){
        File file = new File(filename);

        try{ // has to be in try catch to avoid FileNotFoundException error. The program won't compile otherwise.
            Scanner scan = new Scanner(file);
            int rows = scan.nextInt();
            int columns = scan.nextInt();
            String[] valueTemp;
            String tempLine;
            System.out.println("rows : " + rows + "\n" + "columns : " + columns);

            SparseMatrix matrix = new SparseMatrix(rows, columns); //initialize matrix to eventually return

            for(int i = 0; i <= rows; i++){
                tempLine = scan.nextLine();
                for(int j = 0; j <= tempLine.length(); j++){
                    if(tempLine.charAt(j) == ' '){
                        valueTemp = tempLine.split(" ");
                    }
                    if(tempLine.charAt(j) == ','){
                        valueTemp = tempLine.split(",");
                    }
                }
            }
            return matrix;
        }catch(Exception e){
            System.out.println("FILE NOT FOUND");
        }





        return null;
    }
}



        /*int rows = scan.nextInt();
        int columns = scan.nextInt();
        String[] valueTemp;
        String tempLine;
        System.out.println("rows : " + rows + "\n" + "columns : " + columns);

        SparseMatrix matrix = new SparseMatrix(rows, columns);

        for(int i = 0; i <= rows; i++){
            tempLine = scan.nextLine();
            for(int j = 0; j <= tempLine.length(); j++){
                if(tempLine.charAt(j) == ' '){
                    String splitCharSpace = " ";
                    valueTemp = tempLine.split(splitCharSpace);
                }
                if(tempLine.charAt(j) == ','){
                    valueTemp = tempLine.split(",");
                }
            }
        }*/
