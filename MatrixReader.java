import java.util.Scanner;

public class MatrixReader {

    public SparseMatrix read(String file){
        Scanner scan = new Scanner(new File(file));
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        String valueTemp;
        String tempLine;
        
        //could do a switch case method like
        // switch(scan), case: matrixA <instert for loop> 
        //  then do the same thing for case: matrixB
        switch(scan){
            case matrixA:
                for(int i = 0; i <= rows; i++){
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
            
            case matrixB:
            for(int i = 0; i <= rows; i++){
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
        /* Honestly, im stumped, I know there is a way we can parse through that for loop below
         */
    }
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
