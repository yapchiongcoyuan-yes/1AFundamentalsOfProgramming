import javax.swing.JOptionPane; // Imports JOptionPane
public class Assignment3JOption {
    public static void main(String[] args) {
        // Gets the NSAT score
        String nsatInput = JOptionPane.showInputDialog(
                "Enter NSAT score: ");

        // Converts the input into a number
        double nsat = Double.parseDouble(nsatInput);

        // Gets the parents' monthly salary
        String salaryInput = JOptionPane.showInputDialog(
                "Enter parents' monthly salary: Php ");

        // Converts the input into a number
        double salary = Double.parseDouble(salaryInput);

        // Gets the entrance examination score
        String entranceInput = JOptionPane.showInputDialog(
                "Enter entrance examination score: ");

        double nsat = Double.parseDouble
                (JOptionPane.showInputDialog("Enter NSAT score: "));
        double salary =  Double.parseDouble
                (JOptionPane.showInputDialog("Enter parents' monthly salary: "));
        double entrance = Double.parseDouble
                (JOptionPane.showInputDialog("Enter entrance exam score: "));
        double average = (nsat + entrance) / 2;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            JOptionPane.showMessageDialog(null,"Application: Rejected");
        } else if (salary <= 3500 && average >= 91) {
            JOptionPane.showMessageDialog(null,"Application: Accepted!");
        } else {
            JOptionPane.showMessageDialog(null, "Application: Further Study");
        }
    }
}