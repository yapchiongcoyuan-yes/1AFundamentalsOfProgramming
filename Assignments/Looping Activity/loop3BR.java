import java.io.*;
public class loop3BR {
    public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(System.in));

                double balance = 20000;
                double amount;

                do {
                    System.out.print("Enter amount (0 to stop): ");
                    amount = Double.parseDouble(br.readLine());

                    if (amount > 0) {
                        balance += amount;
                    } else if (amount < 0) {
                        if (balance >= Math.abs(amount)) {
                            balance += amount;
                        } else {
                            System.out.println("INSUFFICIENT FUNDS!");
                        }
                    }

                    System.out.println("Balance: P" + balance);

                } while (amount != 0);
            }
        }