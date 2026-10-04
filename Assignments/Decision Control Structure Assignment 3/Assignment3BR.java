import java.io.*; // Imports classes needed for BufferedReader
public class Assignment3BR {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter NSAT score: ");
            double nsat = Double.parseDouble(bufferedReader.readLine());
            System.out.print("Enter parents' monthly salary: ");
            double salary = Double.parseDouble(bufferedReader.readLine());
            System.out.print("Enter entrance exam score: ");
            double entrance = Double.parseDouble(bufferedReader.readLine());
            double average = (nsat + entrance) / 2;

            if (salary > 10000 || nsat < 90 || entrance < 85) {
                System.out.println("Application: Rejected");
            } else if (salary <= 3500 && average >= 91) {
                System.out.print("Application: Accepted!");
            } else {
                System.out.print("Application: Further Study");
            }
        } catch (IOException e) {
            System.out.print("Error reading input.");
        }
    }
}