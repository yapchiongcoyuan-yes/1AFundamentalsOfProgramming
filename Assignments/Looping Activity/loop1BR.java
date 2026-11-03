import java.io.*;
public class loop1BR {
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(System.in));

                int highest = Integer.MIN_VALUE;
                int lowest = Integer.MAX_VALUE;

                for (int i = 1; i <= 10; i++) {
                    System.out.print("Enter number: ");
                    int num = Integer.parseInt(br.readLine());

                    if (num > highest) highest = num;
                    if (num < lowest) lowest = num;
                }
                System.out.println("Highest: " + highest);
                System.out.println("Lowest: " + lowest);
            }
        }
