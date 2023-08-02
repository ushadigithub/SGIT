public class PalindromeString {
    public static void main(String[] args) {
        String input = "Madam";
        if (isPalindrome(input)) {
            System.out.println("'" + input + " 'is a palindrome:");
        } else {
            System.out.println("'" + input + " 'is not a palindrome:");
        }
    }
    private static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
