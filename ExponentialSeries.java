public class ExponentialSeries {
    public  static  double computeExponential(double x,int terms) {
        double result = 1.0;
        double term = 1.0;
        for (int i = 1; i < terms; i++) {
            term *= x / i;
            result += term;
        }
        return result;
    }

    public static void main(String[] args) {
        double x=2.0;
        int terms=10;
        System.out.println("Value of x:"+x);
        System.out.println("Number of terms:"+terms);
        double result=computeExponential(x,terms);
        System.out.println("Approximated Exponential:"+result);
        System.out.println("Actual Exponential(Math.exp):"+Math.exp(x));
    }
    }

