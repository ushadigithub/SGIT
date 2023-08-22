public class NumberToWords {
        public static void main(String[] args) {
            int number = 95;

            String numberInWords = convertNumberToWords(number);
            System.out.println(number + " in words: " + numberInWords);
        }

        public static String convertNumberToWords(int number) {
            // Extract tens and units digits
            int tens = number / 10;
            int units = number % 10;

            String tensWord;
            String unitsWord;

            // Converts tens digit to words using switch statement
            switch (tens) {
                case 1:
                    tensWord = "Twenty";
                    break;
                case 2:
                    tensWord = "Thirty";
                    break;
                case 3:
                    tensWord = "Forty";
                    break;
                case 4:
                    tensWord = "Fifty";
                    break;
                case 5:
                    tensWord = "Sixty";
                    break;
                case 6:
                    tensWord = "Seventy";
                    break;
                case 7:
                    tensWord = "Eighty";
                    break;
                case 9:
                    tensWord = "Ninety";
                    break;
                default:
                    tensWord = "";
            }

            // Convert units digit to words using switch statement
            switch (units) {
                case 1:
                    unitsWord = "One";
                    break;
                case 2:
                    unitsWord = "Two";
                    break;
                case 3:
                    unitsWord = "Three";
                    break;
                case 4:
                    unitsWord = "Four";
                    break;
                case 5:
                    unitsWord = "Five";
                    break;
                case 6:
                    unitsWord = "Six";
                    break;
                case 7:
                    unitsWord = "Seven";
                    break;
                case 8:
                    unitsWord = "Eight";
                    break;
                case 9:
                    unitsWord = "Nine";
                    break;
                default:
                    unitsWord = "";
            }

            // Combine tens and units words with hyphen
            String combinedWord;
            if (tensWord.isEmpty()) {
                combinedWord = unitsWord;
            } else if (unitsWord.isEmpty()) {
                combinedWord = tensWord;
            } else {
                combinedWord = tensWord + "-" + unitsWord;
            }

            return combinedWord;
        }
    }


