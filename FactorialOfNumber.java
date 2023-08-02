import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int n,fact=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number:");
         n= scanner.nextInt();
         for (int i=1;i<=n;i++){
             fact=fact*i;
         }
         System.out.print(" factorial :" + fact);
    }
}
