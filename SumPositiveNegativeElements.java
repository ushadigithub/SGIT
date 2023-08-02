import java.util.Vector;

public class SumPositiveNegativeElements {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(12);
        vector.add(-11);
        vector.add(-13);
        vector.add(14);
        vector.add(-15);
        vector.add(45);
        int positiveSum = 0;
        int negativeSum = 0;
        for (int num : vector) {
            if (num > 0) {
                positiveSum = positiveSum + num;
            } else if (num < 0) {
                negativeSum = negativeSum + num;
            }
        }
        System.out.println("PositiveSum:" + positiveSum);
        System.out.println("NegativeSum:" + negativeSum);

    }
}