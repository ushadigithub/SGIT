import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input principal amount,rate of interest, time
        System.out.println("Enter the principle amount");
        scanner.nextDouble();

        System.out.println("Enter the rate of interest(as a percentage):");
        double rate = scanner.nextDouble();

        System.out.println("Enter the time period (in years):");
        int time = scanner.nextInt();


        System.out.println("Enter the number of times the interest is compounded per year(for compound interest):");
        int compoundFrequency = scanner.nextInt();

        //calculate Simple Interest
        double principal = scanner.nextDouble();
        double Principal = 0;
        double simpleInterest = Principal * rate * time / 100;

        //calculate Compound Interest;
        double compoundInterest = Principal * Math.pow(1 + rate / 100, time) - principal;
        //print the results
        System.out.println("SimpleInterest:" + simpleInterest);
        System.out.println("Compound Interest:" + compoundInterest);
        scanner.close();
    }

}
