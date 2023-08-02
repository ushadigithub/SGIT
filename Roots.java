import java.util.Scanner;

public class Roots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r1, r2;
        System.out.println("Enter the a,b,c values:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = b * b - (4 * a * c);
        double x = 0;
        double y = 0;
        if (d == 0) {
            System.out.println("Roots are real and equal:");
            r1 = r2 = -b / (2 * a);
            System.out.println("R1= " + r1);
            System.out.println("R2= " + r2);
        } else if (d > 0) {
            System.out.println("Roots are real and distinct:");
            r1 = -b + Math.sqrt(d) / (2 * a);
            r2 = -b - Math.sqrt(d) / (2 * a);
            System.out.println("R1= " + r1);
            System.out.println("R2= " + r2);
        } else {
            System.out.println("Roots are distinct and imaginary");
            x = -b / (2 * a);
            y = Math.sqrt(d) / (2 * a);
            System.out.println("R1=" + x + "i" + y);
        }
        System.out.println("R1=" + x + "-i" + y);
    }
}
