public class SeriesCalculator {
    public static void main(String[] args) {
        int n=20;
        double result=calculateSeries(n);
        System.out.println("The result of series is:"+result);
    }

    public static double calculateSeries(int n) {
        double sum=0.0;
        int numerator=2;
        int denominator=9;
        boolean isPositive=true;
        for (int i=0;i<n;i++){
            double term=(isPositive?1:-1)*(double)numerator/denominator;
            sum+=term;
            numerator+=3;
            denominator+=4;
            isPositive=!isPositive;
        }
        return sum;
    }
}

