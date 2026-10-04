import java.util.Scanner; // Imports Scanner for user input
public class Assignment2Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Asks the employee for the hourly pay rate
        System.out.print("Enter hourly pay rate:  ");
        double rate = input.nextDouble();

        // Asks the employee for the hours worked
        System.out.print("Enter hours worked: ");
        double hours = input.nextDouble();

        // Computes the gross pay
        double grossPay = rate * hours;

        // Variable for the withholding tax percentage
        double taxRate;

        // Determines the tax rate using decision control
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

        // Displays the payroll results
        System.out.println("\n--- PAYROLL DETAILS ---");
        System.out.printf("Gross Pay: Php %.2f%n", grossPay);
        System.out.printf("Withholding Tax: Php %.2f%n", withholdingTax);
        System.out.printf("Net Pay: Php %.2f%n", netPay);

        // Closes the Scanner
        input.close();
    }
}
