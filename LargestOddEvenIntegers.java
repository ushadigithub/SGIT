 /*   import java.util.ArrayList;
 import java.util.List;

public class LargestOddEvenIntegers {
    public static void main(String[] args) {
        List<Integer>numbers=new ArrayList<>();
        numbers.add(23);
        numbers.add(10);
        numbers.add(151);
        numbers.add(17);
        numbers.add(26);
        numbers.add(348);
        int largestOdd=findLargestOdd(numbers);
        int largestEven=findLargestEven(numbers);
        if(largestOdd!=Integer.MIN_VALUE){
            System.out.println("Largest Odd Integer:"+largestOdd);
        }else {
            System.out.println("No Odd Numbers found");
        }
        if(largestEven!=Integer.MIN_VALUE) {
            System.out.println("Largest Even Integer:" + largestEven);
        }else{
            System.out.println("No Even Numbers found");
        }
    }
     public static int findLargestOdd(List<Integer>numbers){
        int largestOdd=Integer.MIN_VALUE;
        for(int num:numbers) {
            if (num % 2 == 1 && num > largestOdd) {
                largestOdd = num;
            }
        }
        return largestOdd;
    }
        public static  int findLargestEven(List<Integer>numbers){
        int largestEven=Integer.MIN_VALUE;
        for(int num:numbers){
            if (num % 2==0&&num>largestEven){
                largestEven=num;
            }
        }
        return largestEven;
        }


    }
*/



