import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter  the first number:");
        int num1=r.nextInt();
        System.out.print("Enter the second number:");
        int num2=r.nextInt();
        int max= Math.max(num1, num2);
        System.out.println("The maximum of" +num1+ " and "+num2+ " is :" +max);


    }


}
