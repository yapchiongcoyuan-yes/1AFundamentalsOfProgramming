import javax.swing.JOptionPane;
public class loop3JOption {
    public static void main(String[] args) {
        double balance = 20000;
                double amount;

                do {
                    amount = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Enter amount (0 to stop):"));

                    if (amount > 0) {
                        balance += amount;
                    } else if (amount < 0) {
                        if (balance >= Math.abs(amount)) {
                            balance += amount;
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "INSUFFICIENT FUNDS!");
                        }
                    }

                    JOptionPane.showMessageDialog(null,
                            "Balance: P" + balance);

                } while (amount != 0);
            }
        }
