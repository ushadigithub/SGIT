/*public class PolynomialAddOfBitVector {
    public static int[] addPolynomials(int[] poly1, int[] poly2) {
        int n = Math.max(poly1.length, poly2.length);
        int[] result = new int[n];
        for (int i = 0; i < poly1.length; i++) {
            result[i] ^= poly1[i];
        }
        for (int i = 0; i < poly2.length; i++) {
            result[i] ^= poly2[i];
        }
        return result;
    }

    public static void displayPolynomial(int[] poly) {
        boolean isFirstTerm = true;
        for (int i = poly.length - 1; i >= 0; i--) {
            if (poly[i] != 0) {
                if (isFirstTerm) {
                    System.out.print(poly[i]);
                    isFirstTerm = false;
                } else {
                    if (poly[i] > 0) {
                        System.out.print("+");
                    } else {
                        System.out.print("-");
                    }
                    System.out.print(Math.abs(poly[i]));
                }
                if (i > 0) {
                    System.out.print("x^" + i);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] poly1 = {2, 3, 4, 5};
        int[] poly2 = {2, -1, 3};
        int[] result = addPolynomials(poly1, poly2);
        System.out.print("First Polynomial:");
        displayPolynomial(poly1);
        System.out.print("Second Polynomial:");
        displayPolynomial(poly2);
        System.out.print("Result Polynomial:");
        displayPolynomial(result);
    }
    }*/





