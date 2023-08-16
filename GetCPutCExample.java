import java.io.IOException;
public class GetCPutCExample {
        public static void main(String[] args) {
            System.out.println("Enter a character:");

            try {
                // Using GetC equivalent in Java
                char inputChar = (char) System.in.read(); // Reads a single character from the console

                // Using PutC equivalent in Java
                System.out.println("Character entered:");
                System.out.write(inputChar); // Writes the character to the console
                System.out.flush(); // Flushes the output stream to ensure it's printed

            } catch (IOException e) {
                System.out.println("An error occurred while reading/writing: " + e.getMessage());
            }
        }
    }


