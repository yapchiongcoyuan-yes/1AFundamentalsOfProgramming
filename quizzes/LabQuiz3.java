import javax.swing.JOptionPane;
import java.awt.*;
public class LabQuiz3 {
    public static void main(String[] args) {
        double old = Double.parseDouble(JOptionPane.showInputDialog("Old salary :"));
        double newSalary = old * 1.1775;
        double two = (newSalary - old) * 2;

        JOptionPane.showMessageDialog(null, "New Salary: " + newSalary + " Retroactive pay for 2 months: " + two);
       }
    }
