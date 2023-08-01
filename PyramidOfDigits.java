//import java.util.Scanner;
//
//public class PyramidOfDigits {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number of rows for the pyramid:");
//        int numRows = scanner.nextInt();
//        constructPyramid(numRows);
//    }
//    private static void constructPyramid(int numRows) {
//        int currentDigits=1;
//        int spaces=numRows-1;
//        for (int i=1;i<=numRows;i++){
//            for(int j=1;j<=spaces;j++){
//            System.out.println(" ");
//            }
//            for (int k=1;k<=i;k++){
//                System.out.println(currentDigits+"");
//                currentDigits++;
//
//            }
//            System.out.println();
//            spaces--;
//
//        }
//
//    }
//
//}
