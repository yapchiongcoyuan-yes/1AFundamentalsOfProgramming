import java.util.Scanner; // Imports Scanner
public class Assignment3Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter NSAT score: ");
        double nsat = scanner.nextDouble();
        System.out.print("Enter parents' monthly salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter entrance exam score: ");
        double entrance = scanner.nextDouble();
        double average = (nsat + entrance) / 2;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            System.out.println("Application: Rejected");
        } else if (salary <= 3500 && average >= 91) {
            System.out.print("Application: Accepted!");
        } else {
            System.out.print("Application: Further Study");
        }
        scanner.close();
    }
}