public class MatrixSumRowsColumns {
    public static void main(String[] args) {
        int[][] matrix = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}};
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] rowSums = new int[rows];
        int[] colSums = new int[cols];
        //calculate row sums
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rowSums[i] += matrix[i][j];
            }
        }//print rowSums
        System.out.println("sum of rows:");
        for (int i=0;i<rows;i++) {
            System.out.println("Row " + (i + 1) + ": " + rowSums[i]);

        }
        //calculate col sums
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < cols; i++) {
                colSums[j] += matrix[i][j];
            }
        }
            //print col sums
            System.out.println("Sum of cols:");
            for (int j=0;j<cols;j++){
                System.out.println("Column " + (j + 1) + ": " + colSums[j]);
            }
        }
    }























