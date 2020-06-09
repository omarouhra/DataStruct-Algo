

public class spiralMatrix {
    public static void main(final String[] args) {
        final int[][] data = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        new spiralMatrix().spiral(data);


    }

    void spiral(final int[][] array) {

         int rowS=0;
         int rowF=array.length-1;
         int colS=0;
         int colF=array.length-1;

    while ( rowS<rowF&&colS<colF){

    for (int i = colS; i <= colF; i++) {
        System.out.print(array[rowS][i] + "\t");
    }
        System.out.println("\n");
    for (int i = rowS+1; i <= rowF; i++) {
        System.out.print(array[i][colF] + "\t");    
    }
        System.out.println("\n");
    for (int i = rowF-1;i >= rowS; i--) {
        System.out.print(array[rowF][i] + "\t");
    }
        System.out.println("\n");
    for (int i = colF-1; i > colS; i--) {
        System.out.print(array[i][colS] + "\t");
    }
    rowS++;
    rowF--;
    colS++;
    colF--;
       

    }
    
  }
  
}

