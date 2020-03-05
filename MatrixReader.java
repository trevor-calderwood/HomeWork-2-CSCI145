import java.util.Scanner;

public class MatrixReader {

    public SparseMatrix read(String file){
        Scanner scan = new Scaner(new File(file));
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        String valueTemp;
        String tempLine;

    }



        /* for(int i = 0; i <= rows; i++){
            tempLine = scan.nextLine();
            for(int j = 0; j <= tempLine.length(); j++){
                if(tempLine.charAt(j) == " "){
                    valueTemp = tempLine.split(" ");
                }
                if(tempLine.charAt(j) == ","){
                    valueTemp = tempLine.split(",");
                }
            }
        }
        return null;
    }
}

*/
