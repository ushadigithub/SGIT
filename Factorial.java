import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        int num=9;
        long factorial=calculateFactorial(num);//call the calculate factorial method
        System.out.println("The factorial of" + num + "is" +factorial);//print the result
    }

    private static long calculateFactorial(int num) {
        //calculate the factorial using stream
        return  IntStream.rangeClosed(1,num)//generate a stream of integers from 1 to n
                .reduce(1,(x, y)-> Math.toIntExact(x  * y));//multiply the elements of the stream together

    }
}
