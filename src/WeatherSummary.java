import java.util.Scanner;
public class WeatherSummary {
    /**
     * Reads newline-delimted temperatures from System.in and prints summary
     * statistics to System.out.
     * 
     * Example input:
     * 66.4
     * 77.1
     * 72.6
     * 
     * Example output:
     * Max: 66.4
     * Min: 77.1
     * Average: 72.03333333333333
     * 
     * @param args command line arguments (ignored)
     */
    public static void main(String[] args) {
        // Implement this method!
        // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!
        Scanner scanner = new Scanner(System.in);
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;

        while (scanner.hasNextDouble()) {
            double temp = scanner.nextDouble();
            max = Math.max(max, temp);
            min = Math.min(min, temp);
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        


        
        scanner.close();
    }
}
