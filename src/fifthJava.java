import java.io.*;
public class fifthJava {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try {
            //Read Integer
            System.out.print("Enter your age:");
            String ageInput = dataIn.readLine(); //Read string
            int age = Integer.parseInt(ageInput); //Convert to int

            //2. Read a double

            System.out.print("Enter your exact height in meters: ");
            String heightInput = dataIn.readLine(); //Read as string
            double height = Double.parseDouble(heightInput); //Convert to double
            System.out.println("You are " + age + " years old and " + height + "m tall");
        } catch (IOException e) {
            //This happens if the user types "Twenty" instead of 20
            System.out.print("Invalid number format! Please enter digits only");
        }
    }
}