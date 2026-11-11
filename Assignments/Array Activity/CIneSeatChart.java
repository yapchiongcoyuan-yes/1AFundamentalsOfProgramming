import java.util.Arrays;

public class CIneSeatChart {
    public static void main(String[] args) {
        String[][] seats = {
            {"Alice", "Bob", "Charlie"},
            {"David", "Emma", "Frank"}
        };

        System.out.println(seats[1][2]); // Iprint si Frank

        seats[0][1] = "Vacant"; // Palitan si Bob ng Vacant

        System.out.println(Arrays.deepToString(seats));
    }
}
