import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j, k;
        int[] array = new int[20];
        System.out.println("enter the number of rows:");
        int rows = scanner.nextInt();
        for (i = 0; i < rows; i++) {
            for (k = rows; k > i; k--) {
                System.out.print(" ");
            }
            array[i] = 1;
            for (j = 0; j <= i; j++) {
                System.out.print(array[i] + " ");
                array[i] = array[i] * (i - j) / (j + 1);
            }
            System.out.println();

        }


    }
}
