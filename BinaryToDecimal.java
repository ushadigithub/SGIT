public class BinaryToDecimal {
    public static void main(String[] args) {
        String binaryString = "101011";
        int temp = Integer.parseInt(binaryString);
        System.out.println(temp);
        int power = 0;
        int decimalNo = 0;
        while (temp != 0) {
            int rem = temp % 10;
            decimalNo = (int) (decimalNo + rem * Math.pow(2, power));
            power++;
            temp = temp / 10;

        }

        System.out.println(decimalNo);
    }
    }

