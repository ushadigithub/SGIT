    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;

    public class FileReadErrorExample {
        public static void main(String[] args) {
            // Case 1: Trying to read a non-existent file
            readNonExistentFile("nonexistent.txt");

            // Case 2: Reading a file without proper permissions
            readUnreadableFile("unreadable.txt");

            // Case 3: Reading a file with improper file path
            readFileWithInvalidPath("invalid/path/file.txt");
        }
          //method to demonstrate  reading a non-existent file
        public static void readNonExistentFile(String filePath) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        }
           //method to demonstrate reading an unreadable file
        public static void readUnreadableFile(String filePath) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        }
            //method to demonstrate reading a file with an invalid path
        public static void readFileWithInvalidPath(String filePath) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        }
    }


