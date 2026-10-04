import javax.swing.JOptionPane;
public class Assignment4JOption {
    public static void main(String[] args) {
        // Get the applicant's information
        double height = Double.parseDouble(
                JOptionPane.showInputDialog("Height:"));

        int age = Integer.parseInt(
                JOptionPane.showInputDialog("Age:"));

        String citizen = JOptionPane.showInputDialog("Citizenship (C/N):");

        String rec = JOptionPane.showInputDialog(
                "Recommendee (R/N):");

        // Check if accepted
        String result;

        if (rec.equalsIgnoreCase("R") ||
                (height >= 200 && age >= 21 && age <= 25 &&
                        citizen.equalsIgnoreCase("C"))) {
            result = "ACCEPTED";
        } else {
            result = "REJECTED";
        }

        JOptionPane.showMessageDialog(null, result); // Show result
    }
}
