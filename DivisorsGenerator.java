//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class DivisorsGenerator {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer:");
//        int number = scanner.nextInt();
//        scanner.close();
//        List<Integer> divisors = findDivisors(number);
//        System.out.println("Divisors of" + number + ":" + divisors);
//    }
//
//    private static List<Integer> findDivisors(int number) {
//
//
//        List<Integer> divisors = new ArrayList<>();
//        for (int i = 1; i <= number; i++) {
//            if (number % i == 0) {
//                divisors.add(i);
//            }
//        }
//            return divisors;
//        }
//    }
//
