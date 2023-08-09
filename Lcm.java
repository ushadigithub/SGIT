import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number:");
        int num2 = sc.nextInt();
        int lcm = Math.max(num1, num2);
        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.println("lcm of entered numbers:" + lcm);
                break;
            }
            ++lcm;
        }
    }
}