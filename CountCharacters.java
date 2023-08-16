public class CountCharacters {
    public static void main(String[] args) {
        int vowels = 0, consonants = 0, whitespaces = 0;

        String str1 = "Every One Should Learn";
        str1 = str1.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;   
            } else if (Character.isWhitespace(ch)) {
                whitespaces++;
            }
        }
        System.out.println("Number of vowels:" + vowels);
        System.out.println("Number of consonants:" + consonants);
        System.out.println("Number of whitespaces:" + whitespaces);
    }
}