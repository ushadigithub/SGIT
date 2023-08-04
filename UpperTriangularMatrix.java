public class UpperTriangularMatrix {
    public static void main(String[] args) {
        int rows, cols;
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rows = a.length;
        cols = a[0].length;
        if (rows != cols) {
            System.out.println("Matrix should bre a square matrix:");
        }else{
              boolean isUpperTriangular=true;

            for (int i = 1; i < rows; i++) {
                for (int j = 0; j < i; j++) {
                    if (a[i][j] != 0) {
                        isUpperTriangular = false;
                        break;
                    }
                }
                if (!isUpperTriangular) {
                    break;
                }
            }
            if (isUpperTriangular){

                    System.out.println("Matrix is an UpperTriangularMatrix");
                } else {
                    System.out.println("Matrix is not an UpperTriangularMatrix");
                }
            }
        }
    }




