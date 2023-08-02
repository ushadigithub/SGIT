public class StringCaseConverter {
    public static void main(String[] args) {
        String inputString = "EveryOne Should Learn";
        String uppercaseString = convertToUpperCase(inputString);
        String lowercaseString = convertToLowerCase(inputString);

        System.out.println("Original String:" + inputString);
        System.out.println("converted to UpperCase:" + uppercaseString);
        System.out.println("Converted to LowerCase:" + lowercaseString);
    }
    public static String convertToUpperCase(String str) {
        return str.toUpperCase();
    }

    public static String convertToLowerCase(String str) {
        return str.toLowerCase();
    }
}


