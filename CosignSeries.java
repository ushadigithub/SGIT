public class CosignSeries {
    public static void main(String[] args) {
        int terms = 10; // Number of terms in the series
        double x = Math.PI / 3; // Angle in radians (example: pi/3)
        double sum = 1.0; // First term of the series (cos(0) = 1)
        double power = 1.0; // Initialize power of x
        int sign = -1; // Initialize the sign (negative for the first term)
        System.out.println("Cosine Series:");for (int i = 1; i < terms; i++) {
            power *= x * x; // Calculate the next power of x (x^n)
            int factorial = 2 * i; // Calculate 2n!
            sum += (sign * power) / factorial; // Add the next term to the sum

            sign *= -1; // Toggle the sign for the next term
        }

        System.out.println("Cos(" + x + ") = " + sum);
    }
}
