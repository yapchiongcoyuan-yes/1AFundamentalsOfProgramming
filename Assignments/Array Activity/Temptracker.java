public class Temptracker {
    public static void main(String[] args) {

        double[] temperatures = new double[5]; // Gagawa po ng array na may 5 temperatures

        temperatures[0] = 32.5; // Temperature ng Day 1
        temperatures[1] = 34.0; // Temperature ng Day 2
        temperatures[2] = 31.8; // Temperature ng Day 3
        temperatures[3] = 33.2; // Temperature ng Day 4
        temperatures[4] = 35.1; // Temperature ng Day 5

        for (int i = 0; i < temperatures.length; i++) {
            System.out.println(temperatures[i]);
        }

        temperatures[2] = 32.0; // Palitan ang Day 3 ng 32.0

        System.out.println("Updated Day 3: " + temperatures[2]);
    }
}
