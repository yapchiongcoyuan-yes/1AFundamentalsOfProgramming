import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fourthJava {
    public static void main(String[] args) {

        // The name or path of the file you want to overwrite
        String filepath = "Sia.txt";

        // Wrap a FileWriter inside a BufferedWriter
        // The try-with-resources block ensures the file is closed automatically
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))) {

            // Write text to the file
            writer.write("This is the first line of the text.");

            // Add a line break
            writer.newLine();

            // Write the second line
            writer.write("This is the second line of the text.");

            // Add another line break
            writer.newLine();

            // Write the third line
            writer.write("BufferedWriter makes writing fast and efficient.");

            // Display a success message
            System.out.println("Data successfully written to the file!");

        } catch (IOException e) {

            // Display an error message if something goes wrong
            System.err.println("An error occurred while writing to the file.");

            // Display the details of the error
            e.printStackTrace();
        }
    }
}
