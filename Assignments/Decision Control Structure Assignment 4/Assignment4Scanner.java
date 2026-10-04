import java.util.Scanner;
public class Assignment4Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get information
        System.out.print("Height: ");
        double height = input.nextDouble();

        System.out.print("Age: ");
        int age = input.nextInt();

        System.out.print("Citizenship (C/N): ");
        String citizen = input.next();

        System.out.print("Recommendee (R/N): ");
        String rec = input.next();

        // Check recommendee
        if (rec.equals("R")) {
            System.out.println("ACCEPTED");
        }
        // Check normal requirements
        else if (height >= 200 && age >= 21 && age <= 25 && citizen.equals("C")) {
            System.out.println("ACCEPTED");
        }
        else {
            System.out.println("REJECTED");
        }

        input.close();
    }
}

