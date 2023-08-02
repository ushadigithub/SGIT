public class PolynomialAddition {
    public static int[] addPolynomials(int[] ploy1, int[] poly2) {
        int n = Math.max(ploy1.length, poly2.length);
        int[] result = new int[n];
        for (int i = 0; i < ploy1.length; i++) {
            result[i] = result[i] + ploy1[i];
        }
        for (int i = 0; i < poly2.length; i++) {
            result[i] = result[i] + poly2[i];
        }
        return result;
    }

    public static void displayPolynomial(int[] poly) {
        int n = poly.length;
        for (int i = n - 1; i >= 0; i--) {
            if (poly[i] != 0) {
                if (i == n - 1) {
                    System.out.print(poly[i] + "x^" + i);
                } else {
                    System.out.print("+" + poly[i] + "x^" + i);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] poly1 = {4, 3, 2, 1};
        int[] poly2 = {3, -1, 2};
        int[] result = addPolynomials(poly1, poly1);
        System.out.println("First Polynomial:");
        displayPolynomial(poly1);
        System.out.println("Second Polynomial:");
        displayPolynomial(poly2);
        System.out.println("Result Polynomial:");
        displayPolynomial(result);
    }
}
