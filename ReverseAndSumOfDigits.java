//import java.util.Scanner;
//
//public class ReverseAndSumOfDigits {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number:");
//       // int num = scanner.nextInt();
//        scanner.close();
//        int Number = 12345;
//        int reversedNumber = reversedNumber(Number);
//        int sum = Number + reversedNumber;
//        System.out.println("Reversed number:" + reversedNumber);
//        System.out.println("sum of original and reversed numbers:" + sum);
//    }
//
//    private static int reversedNumber(int number) {
//        int reversedNumber=0;
//            while (number!=0){
//                int digit=number%10;
//                reversedNumber=reversedNumber*10+digit;
//                number=number/10;
//            }
//            return reversedNumber;
//    }
//    }
