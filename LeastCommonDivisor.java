public class LeastCommonDivisor {
    public static void main(String[] args) {
        int a = 15, b = 12, gcd = 1;
        //finds GCD
        for (int i = 1; i <= a && i <= b; ++i) {
            if (a % i == 0 && b % i == 0)
                //assigns i into gcd
                gcd = i;
        }
        System.out.println("The LCM of " + a + "and " + b + "is " + (a * b / gcd));
    }
}