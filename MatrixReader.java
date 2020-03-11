import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static java.lang.Integer.parseInt;

public class MatrixReader {

    public SparseMatrix read(String filename){ //returns set up sparse matrix; returns null if file doesn't exist
        File file = new File(filename);

        try{ // has to be in try catch to avoid FileNotFoundException error. The program won't compile otherwise.
            Scanner scan = new Scanner(file);
            int rows = parseInt(scan.nextLine());
            int columns = parseInt(scan.nextLine());
            String[] splitLine;
            String[] tempPair = new String[2];
            String tempLine;
            //System.out.println("rows : " + rows + "\n" + "columns : " + columns);

            SparseMatrix matrix = new SparseMatrix(rows, columns); //initialize matrix to eventually return

            for(int i = 0; i < rows; i++){
                //System.out.println("step 1");
                tempLine = scan.nextLine();
                //System.out.println(tempLine);
                for(int j = 0; j < tempLine.length(); j++){
                    //System.out.println("step 2");
                    if(tempLine.charAt(j) == ' '){
                        //System.out.println("step 3");
                        splitLine = tempLine.split(" ");
                        for(int k = 0; k < splitLine.length; k++){
                            //System.out.println("step 4");
                            tempPair = splitLine[k].split(",");
                        }
                        //System.out.println("step 5");
                        matrix.insert(i+1, parseInt(tempPair[0]), parseInt(tempPair[1]));
                    }
                }
            }
            return matrix;
        }catch(FileNotFoundException e){
            System.out.println("FILE NOT FOUND");
        }catch(Exception e){
            System.out.println("OTHER ERROR IN MATRIX READER");
            System.out.println(e.toString());
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
