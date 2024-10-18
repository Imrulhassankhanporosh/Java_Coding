package OOP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ioException{

    // This method declares it throws an IOException
    public static void readFile(String filePath) throws IOException {
        FileReader file = new FileReader(filePath);
        BufferedReader fileInput = new BufferedReader(file);

        // Read the first line of the file
        System.out.println(fileInput.readLine());

        // Closing resources
        fileInput.close();
    }

    public static void main(String[] args) {
        try {
            // Calling the method which may throw IOException
            readFile("test.txt");
        } catch (IOException e) {
            System.out.println("Error: File not found or unable to read file.");
        }
        finally {
            System.out.println("Program continues...");
        }
    }

}
