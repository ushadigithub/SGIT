import java.util.Scanner;

public class Series{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n:");
        int n= scanner.nextInt();
        double sum=0.0;
        for (int i=1;i<=n;i++) {
            long f = 1;
            for (int j = 1; j <= i; j++)
                { f *= j;}
            sum += (1.0 / f);
        }
        System.out.println("sum="+sum);
        }
    }

