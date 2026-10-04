import javax.swing.JOptionPane;
public class Assignment2JOption {
    public static void main(String[] args) {
        // Gets the hourly rate
        double rate = Double.parseDouble(
                JOptionPane.showInputDialog("Enter hourly pay rate:"));

        // Gets the hours worked
        double hours = Double.parseDouble(
                JOptionPane.showInputDialog("Enter hours worked:"));

        // Calculates gross pay
        double gross = rate * hours;

        // Finds the tax rate
        double tax;

        if (gross <= 2000) {
            tax = 0.10;
        } else if (gross <= 4000) {
            tax = 0.12;
        } else if (gross <= 10000) {
            tax = 0.15;
        } else {
            tax = 0.20;
        }

        // Calculates tax and net pay
        double withholding = gross * tax;
        double net = gross - withholding;

        // Shows the result
        JOptionPane.showMessageDialog(null,
                "Gross Pay: Php " + gross +
                        "\nWithholding Tax: Php " + withholding +
                        "\nNet Pay: Php " + net);
    }
}