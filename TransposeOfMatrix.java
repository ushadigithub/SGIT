import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows of a matrix:");
        int r = scanner.nextInt();
        System.out.println("Enter number of columns of a matrix:");
        int c = scanner.nextInt();
        int[][] matA = new int[r][c];
        System.out.println("Enter "+ (r * c)+" values:");
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
                matA[i][j] = scanner.nextInt();
        }
        System.out.println("Original matrix is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matA[i][j] +"\t");
            }
            System.out.println();
        }
        System.out.println("TransposeMatrix matrix is:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(matA[j][i] + "\t");
            }
            System.out.println();
        }

    }
}




