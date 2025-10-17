import java.util.Random;
import java.util.Scanner;

public class GasLeakMonitor {
    public static void main(String[] args) {
        final int THRESHOLD = 600;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== Gas Leak Monitoring System ===");
        System.out.println("Enter the number of readings to simulate:");
        int readings = scanner.nextInt();

        for (int i = 1; i <= readings; i++) {
            int gasLevel = random.nextInt(1000);
            System.out.println("Reading " + i + ": Gas Level = " + gasLevel);

            if (gasLevel < THRESHOLD) {
                System.out.println("Status: Safe");
            } else {
                System.out.println("Status: DANGER!  Gas Leak Detected!");
            }

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Simulation Complete.");
        scanner.close();
    }
}
