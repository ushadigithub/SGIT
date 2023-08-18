import java.util.Arrays;
import java.util.Scanner;
public class MeanMedianCalculation {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        //prompt user for the number of elements

        System.out.println("Enter number of elements:");
        int n= scanner.nextInt();
        //create an array to store the elements
        double[] VectorA=new double[n];

        System.out.println("Enter "+ n +"Elements");
        for (int i=0;i<n;i++){
            VectorA[i]=scanner.nextDouble();
        }
        //calculate and display the mean
        double mean=calculateMean(VectorA);

        System.out.println("Mean:"+mean);
        //calculate and display the median
        double median=calculateMedian(VectorA);

        System.out.println("Median:"+median);
    }
    //function to calculate the mean of an array
    public  static  double calculateMean(double[]array){
        double sum=0;
        for (double num:array){
            sum+=num;
        }
        return  sum/array.length;
    }
    //function to calculate the median of an array
    public  static  double calculateMedian(double[]array){
        Arrays.sort(array);//sort the array in ascending order
        int middleIndex = array.length / 2;
        if (array.length%2==0) {
            //if the array length is even calculate the average of the middle two elements
             return (array[middleIndex - 1] + array[middleIndex]) / 2.0;
        }else {
            //if the length of array is odd return the median
            return  array[middleIndex];
        }
    }
}
