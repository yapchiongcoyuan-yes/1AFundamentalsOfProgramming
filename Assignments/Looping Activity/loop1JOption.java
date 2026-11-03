import javax.swing.JOptionPane;
public class loop1JOption {
    public static void main(String[] args) {

                int highest = Integer.MIN_VALUE;
                int lowest = Integer.MAX_VALUE;

                for (int i = 1; i <= 10; i++) {
                    int num = Integer.parseInt(
                            JOptionPane.showInputDialog("Enter number:"));

                    if (num > highest) highest = num;
                    if (num < lowest) lowest = num;
                }

                JOptionPane.showMessageDialog(null,
                        "Highest: " + highest + "\nLowest: " + lowest);
            }
        }


