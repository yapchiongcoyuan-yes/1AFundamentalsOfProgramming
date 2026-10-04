import java.io.*;
public class Assignment4BR {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Get the applicant's information
        System.out.print("Height: ");
        double height = Double.parseDouble(br.readLine());

        System.out.print("Age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.print("Citizenship (C/N): ");
        String citizen = br.readLine();

        System.out.print("Recommendee (R/N): ");
        String rec = br.readLine();

        // Check if accepted
        if (rec.equalsIgnoreCase("R") ||
                (height >= 200 && age >= 21 && age <= 25 &&
                        citizen.equalsIgnoreCase("C"))) {
            System.out.println("ACCEPTED");
        } else {
            System.out.println("REJECTED");
        }
    }
}


