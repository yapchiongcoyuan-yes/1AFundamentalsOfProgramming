import java.io.*; // Imports classes needed for BufferedReader
public class Assignment2BR {
    public static void main(String[] args) throws IOException {

        // Creates a BufferedReader object for reading user input
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        // Asks the employee to enter the hourly pay rate
        System.out.print("Enter hourly pay rate:  ");
        double rate = Double.parseDouble(br.readLine());

        // Asks the employee to enter the number of hours worked
        System.out.print("Enter hours worked: ");
        double hours = Double.parseDouble(br.readLine());

        // Computes the gross pay
        double grossPay = rate * hours;

        // Variable for the withholding tax percentage
        double taxRate;

        // Determines the tax rate based on gross pay
        if (grossPay <= 2000) {
            taxRate = 0.10; // 10% tax
        } else if (grossPay <= 4000) {
            taxRate = 0.12; // 12% tax
        } else if (grossPay <= 10000) {
            taxRate = 0.15; // 15% tax
        } else {
            taxRate = 0.20; // 20% tax
        }

        // Computes the withholding tax
        double withholdingTax = grossPay * taxRate;

        // Computes the net pay
        double netPay = grossPay - withholdingTax;

        // Displays the results
        System.out.println("\n--- PAYROLL DETAILS ---");
        System.out.printf("Gross Pay: Php %.2f%n", grossPay);
        System.out.printf("Withholding Tax: Php %.2f%n", withholdingTax);
        System.out.printf("Net Pay: Php %.2f%n", netPay);
    }
}