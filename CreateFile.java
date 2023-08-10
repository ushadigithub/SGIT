import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File f = new File("C://Users//Admin//Desktop//text.txt//sg.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("File created successfully:");
            } else {
                System.out.println("File already exists:");
            }

        } catch (IOException e) {

            System.out.println("exception occurs");
        }
    }
}