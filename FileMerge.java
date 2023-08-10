
import java.io.*;

public class FileMerge {
    public static void main(String[] args) throws IOException {
        //Printer object for file3.txt

        PrintWriter pw = new PrintWriter(new FileWriter("C:/Users/Admin/Desktop/java/file3.txt "));
        //Read and write content  from file1.txt
        BufferedReader br1 = new BufferedReader(new FileReader("C:/Users/Admin/Desktop/java/file1.txt "));
        String line = br1.readLine();
        //loop to copy the line from file1 to file3
        while (line != null) {
            pw.print(line);
            line = br1.readLine();
        }
        br1.close();
        //Read and write content from file2.txt
        BufferedReader br2 = new BufferedReader(new FileReader("C:/Users/Admin/Desktop/java/file2.txt "));
        String line2 = br2.readLine();
        //loop to copy  the line of file2.txt to file3.txt
        while (line2 != null) {
            pw.print(line2);
            line2 = br2.readLine();
        }

        br2.close();
        pw.close();

        System.out.println("Merged content  from file1.txt and file2.txt into file3.txt: ");
    }
}








